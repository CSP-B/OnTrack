package tool;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.Velocity;
import org.eclipse.epsilon.emc.emf.EmfModel;

/**
 * A class to generate CSPB scripts for railway verification based on a supplied track plan and control table
 *
 */
public class TrackScheme2CSPB {

	// Constants
	private static final String VERSION = "0.1";
	private static final String[] TRAINS = {"albert","bertie"};
	private int numTrains = 2; // Always two trains to verify safety of bidirectional tracks
	
	// File structure elements
	private final Date date;
	private final String[] outputFolder; // Generated files are placed in a unique date_time folder within OUTPUT_DIR
	
	// Epsilon Directories
	private static final String ETL_SOURCE_DIR = "Epsilon/";
	private static final String EGL_OUTPUT_DIR = "output/epsilon/";
	private static final String OUTPUT_DIR = "output/";
	private static final String TEMPLATES_DIR = "templates/";
	private static final String MODELS_DIR = "models/"; // All model files are assumed to be in this folder
	
	// Input Model
	private static final String BJOERNER_MODEL_NAME = "Bjoerner";
	private final String BJOERNER_MODEL; // The input model produced by the graphical editor
	private static final String BJOERNER_META_MODEL = "BjoernerComplete.ecore";
	private EmfModel inputModel; // Created in constructor once input model is provided
	
	// Output Models
	private static final String CSP_MODEL_NAME = "CSP";
	private static final String CSP_MODEL = "csp.model";
	private static final String CSP_META_MODEL = "CSP.ecore";
	private EmfModel csp = EpsilonStandaloneExample.createEmfModel(CSP_MODEL_NAME, MODELS_DIR + CSP_MODEL, MODELS_DIR + CSP_META_MODEL);

	private static final String B_MODEL_NAME = "BMachine";
	private static final String B_MODEL = "BMachine.model";
	private static final String B_META_MODEL = "BMachine.ecore";
	private EmfModel bMachine = EpsilonStandaloneExample.createEmfModel(B_MODEL_NAME, MODELS_DIR + B_MODEL, MODELS_DIR + B_META_MODEL);
	
	private EmfModel[] outputModels = {csp, bMachine};
	
	/**
	 * Main method
	 * Creates an instance of the class in order to generate files
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) {
		
		TrackScheme2CSPB tool = new TrackScheme2CSPB("Copy.bjoernercomplete");
		
		// Process all files in TEMPLATES_DIR
		for (String template : new File(TEMPLATES_DIR).list()) {
			tool.generate(template);
		}
	}
	
	/**
	 * Constructor
	 * Initialises input model, sets numTrains and creates output folders
	 * @param model the input model from the graphical editor
	 */
	public TrackScheme2CSPB(String model) {
		
		// create input model
		BJOERNER_MODEL = model;
		inputModel = EpsilonStandaloneExample.createEmfModel(BJOERNER_MODEL_NAME, MODELS_DIR + BJOERNER_MODEL, MODELS_DIR + BJOERNER_META_MODEL);
		
		// get date
		date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy_kk.mm.ss");
		
		// create output folders
		new File( OUTPUT_DIR + sdf.format(date) + "/" ).mkdir();
		outputFolder = new String[numTrains];
		
		for (int i = 0; i < numTrains; i++) {
			
			outputFolder[i] = OUTPUT_DIR + sdf.format(date) + "/" + (i + 1) + "_train" + ( ( i > 0 ? "s" : "" ) ) + "/";
			new File( outputFolder[i] ).mkdir();
		}
	}

	/**
	 * Processes a template to produce an output file of the same name in OUTPUT_DIR for each number of trains available (1 to numTrains)
	 * Each template must have its own ETL file stored in ETL_SOURCE_DIR with the same name as the template (but with the extension .etl)
	 * The Apache Velocity template engine is used to populate some parts of the template before EGL is processed
	 * @param template the filename of the template file for generation. The file should be placed in TEMPLATES_DIR
	 */
	public void generate(String template) {
		
		// Identify template's ETL source and EGL output filenames
		int dot = template.lastIndexOf(".");
		String etlSource = ETL_SOURCE_DIR + template.substring(0,dot) + ".etl";
		String eglOutput = EGL_OUTPUT_DIR + template.substring(0,dot) + ".egl";
		
		// Use ETL to produce output models
		new TrackSchemeETL(etlSource, inputModel,outputModels).execute();
		
		// Initialise Apache Velocity template engine
		Velocity.init();
		
		// For each number of trains available, generate EGL file from template and use to produce output file
		for (int i = 1; i <= numTrains; i++) {

			// Setup variables for template
			VelocityContext context = new VelocityContext();
			context.put("date", date.toString());
			context.put("model", BJOERNER_MODEL);
			context.put("numTrains", i);
			context.put("version", VERSION);
			context.put("trains", Arrays.copyOfRange(TRAINS, 0, i));
			
			try {

				// Prepare output EGL file
				BufferedWriter writer = new BufferedWriter(new FileWriter(eglOutput));

				// Get the template
				Template velocityTemplate = Velocity.getTemplate(TEMPLATES_DIR + template);

				// Process template
				velocityTemplate.merge(context, writer);

				// Finish writing to file
				writer.flush();
				writer.close();
			}
			catch (IOException e) {

				System.out.println("Error writing to " + eglOutput);
				e.printStackTrace();
			}
			
			// configure output filename
			String outputFile = outputFolder[i-1] + template;

			// process EGL
			new TrackSchemeEGL(outputFile, eglOutput, outputModels).execute();
		}
	}
	
}
