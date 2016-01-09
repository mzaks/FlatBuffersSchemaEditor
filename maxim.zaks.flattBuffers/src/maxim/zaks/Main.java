package maxim.zaks;

import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.GnuParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionBuilder;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.mwe2.launch.runtime.Mwe2Launcher;

import com.google.common.collect.Lists;
import com.google.inject.Injector;
import com.google.inject.Key;

import maxim.zaks.flatBuffers.Definition;
import maxim.zaks.flatBuffers.Schema;

// Implementation found under:
// http://lwc11-xtext.eclipselabs.org.codespot.com/svn-history/r230/doc/LWC11_Documentation/phase3_headlessGenerator.tex

public class Main {
    /** The value of 'module' in the .mwe2 file to execute */
    private static final String WORKFLOW_MODULE =
    "maxim.zaks.GenerateFlatBuffers";
    public static void main(String[] args) {
      int retval = new Main().run(args);
      if (retval != 0) System.exit(retval);
    }

    @SuppressWarnings("static-access")
    protected int run (String[] args) {
      final Options options = new Options();

      Option optSrcDir =
      OptionBuilder.withArgName("path").withDescription("Model source directory").hasArg()
        .isRequired().withValueSeparator(' ').create("srcdir");

      Option optTargetDir =
      OptionBuilder.withArgName("path").withDescription("Generator target directory (default: ./src-gen)").hasArg()
        .create("targetdir");

      options.addOption(optSrcDir);
      options.addOption(optTargetDir);

      // create the parser
      final CommandLineParser parser = new GnuParser();
      CommandLine line = null;
      try {
          line = parser.parse(options, args);
      } catch (final ParseException exp) {
          System.out.println(exp.getMessage());
          final HelpFormatter formatter = new HelpFormatter();
          formatter.printHelp("java -jar dmodelgen.jar [OPTIONS]", options);
          return -1;
      }
      
      FlatBuffersStandaloneSetup setup = new FlatBuffersStandaloneSetup();
      Injector injector = setup.createInjectorAndDoEMFRegistration();
      ParseHelper<Schema> parseHelper = injector.getInstance(new Key<ParseHelper<Schema>>(){});
      
      try {
		Schema schema = parseHelper.parse("table Max{}");
		EList<Definition> definitions = schema.getDefinitions();
		
	} catch (Exception e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
      
//      List<String> launchArgs = Lists.newArrayList();
//      launchArgs.add(WORKFLOW_MODULE);
//      launchArgs.add("-pmodelPath=" + line.getOptionValue("srcdir"));
//      launchArgs.add("-ptargetDir=" + line.getOptionValue("targetdir",
//      "./src-gen"));
//      try {
//          Mwe2Launcher.main(launchArgs.toArray(new String[0]));
//          return 0;
//      } catch (Exception e) {
//          return -1;
//      }
      return 0;
    }
}