package maxim.zaks;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;
import com.google.inject.Key;

import maxim.zaks.flatBuffers.Schema;
import maxim.zaks.generator.CSharpGenerator;
import maxim.zaks.generator.swift.EagerSwiftGenerator;
import maxim.zaks.generator.swift.EagerSwiftGenerator.InfrastructureInclusionRule;

public class Main {
	public static void main(String[] args) {
		int retval = new Main().run(args);
		if (retval != 0)
			System.exit(retval);
	}

	@SuppressWarnings("static-access")
	protected int run(String[] args) {
		final Options options = new Options();

		Option optSrcDir = OptionBuilder.withArgName("path").withDescription("Path to fbs file").hasArg().isRequired()
				.create("fbs");

		Option optTargetDir = OptionBuilder.withArgName("path").withDescription("Path and file name where to generate")
				.hasArg().isRequired().create("out");
		
		Option optLanguage = OptionBuilder.withArgName("option").withDescription("Choose the language you want to generate: swift | csharp")
				.hasArg().isRequired().create("lang");
		
		Option optInclude = OptionBuilder.withArgName("option").withDescription("Choose how you want to include library (swift only): include | import | exclude")
				.hasArg().create("lib");

		options.addOption(optSrcDir);
		options.addOption(optTargetDir);
		options.addOption(optLanguage);
		options.addOption(optInclude);

		// create the parser
		final CommandLineParser parser = new GnuParser();
		CommandLine line = null;
		String language;
		try {
			line = parser.parse(options, args);
			language = line.getOptionValue("lang").trim();
			if(!language.equals("swift") && !language.equals("csharp")){
				throw new ParseException("Unkonwn language : " + language);
			}
		} catch (final ParseException exp) {
			System.out.println(exp.getMessage());
			final HelpFormatter formatter = new HelpFormatter();
			formatter.printHelp("java -jar fbsSG.jar [OPTIONS]", options);
			return -1;
		}

		FlatBuffersStandaloneSetup setup = new FlatBuffersStandaloneSetup();
		Injector injector = setup.createInjectorAndDoEMFRegistration();
		ParseHelper<Schema> parseHelper = injector.getInstance(new Key<ParseHelper<Schema>>() {
		});
		EagerSwiftGenerator generatorSwift = new EagerSwiftGenerator();
		CSharpGenerator generatorCSharp = new CSharpGenerator();
		
		try {
			PrintWriter out = new PrintWriter(line.getOptionValue("out"));
			String fbsFile = readFile(line.getOptionValue("fbs"), StandardCharsets.UTF_8);
			Schema schema = parseHelper.parse(fbsFile);
			if(schema.getRootType() == null){
				out.close();
				throw new Exception("Invalid Schema, 'root_type' is not defined.");
			}
			CharSequence code;
			if(language.equals("swift")){
				InfrastructureInclusionRule rule = InfrastructureInclusionRule.Include;
				String libValue = line.getOptionValue("lib");
				if(libValue != null){
					if(libValue.trim().equals("import")){
						rule = InfrastructureInclusionRule.Import;
					} else if(libValue.trim().equals("exclude")){
						rule = InfrastructureInclusionRule.Exclude;
					}
				}
				code = generatorSwift.generate(schema, rule);
			} else {
				code = generatorCSharp.generate(schema);
			}
			out.print(code);
			out.close();
			List<Issue> issues = validate(schema.eResource());
			String issueText = doGetIssuesAsString(issues, schema.eResource()).toString();
			if (issueText.length() > 0) {
				System.err.println(issueText);
			}
			System.out.println("'" + line.getOptionValue("out") + "'" + " has been generated.");
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return 0;
	}

	private String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	private List<Issue> validate(Resource resource) {
		IResourceValidator validator = ((XtextResource) resource).getResourceServiceProvider().getResourceValidator();
		return validator.validate(resource, CheckMode.ALL, CancelIndicator.NullImpl);
	}

	private StringBuilder doGetIssuesAsString(final Iterable<Issue> issues, Resource resource) {
		StringBuilder result = new StringBuilder();
		for (Issue issue : issues) {
			URI uri = issue.getUriToProblem();
			result.append(issue.getSeverity());
			result.append(" (");
			result.append(issue.getCode());
			result.append(") '");
			result.append(issue.getMessage());
			result.append("'");
			if (uri != null) {
				EObject eObject = resource.getResourceSet().getEObject(uri, true);
				result.append(" on ");
				result.append(eObject.eClass().getName());
				result.append(" " + eObject.toString());
			}
			result.append(", lineNumber " + issue.getLineNumber() + ", length " + issue.getLength());
			result.append("\n");
		}
		return result;
	}
}