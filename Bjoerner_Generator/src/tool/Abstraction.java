package tool;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.models.IModel;
import org.eclipse.epsilon.etl.EtlModule;

public class Abstraction extends EpsilonStandaloneExample {
	
	public static void main(String[] args) throws Exception {
		new Abstraction().execute();
	}
	
	@Override
	public IEolExecutableModule createModule() {
		return new EtlModule();
	}

	@Override
	public List<IModel> getModels() throws Exception {
		List<IModel> models = new ArrayList<IModel>();
		models.add(createEmfModel("Input", "models/doubleJunction.bjoernercomplete", "models/BjoernerComplete.ecore", true, false));
		models.add(createEmfModel("Target", "models/Copy.bjoernercomplete", "models/BjoernerComplete.ecore", false, true));
		return models;
	}

	@Override
	public String getSource() throws Exception {
		return "Epsilon/abstraction.etl";
	}

	@Override
	public void postProcess() {
		
	}

}





//package tool;
//
//
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//import org.eclipse.epsilon.emc.emf.EmfModel;
//
///**
// * A class to generate CSPB scripts for railway verification based on a supplied track plan and control table
// *
// */
//public class Abstraction {
//
//	
//	// File structure elements
//	private final Date date;
//	 // Generated files are placed in a unique date_time folder within OUTPUT_DIR
//	
//	// Epsilon Directories
//	private static final String ETL_SOURCE_DIR = "Epsilon/";
//	private static final String OUTPUT_DIR = "output/";
//	private static final String TEMPLATES_DIR = "templates/";
//	private static final String MODELS_DIR = "models/"; // All model files are assumed to be in this folder
//	
//	// Input Model
//	private static final String BJOERNER_MODEL_NAME = "Bjoerner";
//	private final String BJOERNER_MODEL; // The input model produced by the graphical editor
//	private static final String BJOERNER_META_MODEL = "BjoernerComplete.ecore";
//	private EmfModel inputModel; // Created in constructor once input model is provided
//	
//	// Output Models
//	private EmfModel abstractModel;
//	
//	private EmfModel[] outputModels = {abstractModel};
//	
//	/**
//	 * Main method
//	 * Creates an instance of the class in order to generate files
//	 * @param args
//	 * @throws Exception
//	 */
//	public static void main(String[] args) {
//		
//		Abstraction tool = new Abstraction("doubleJunction.bjoernercomplete");
//		tool.generate("doubleJunstion_Abstraction.bjoernercomplete");
//
//	}
//	
//	/**
//	 * Constructor
//	 * Initialises input model, and creates output folders
//	 * @param model the input model from the graphical editor
//	 */
//	public Abstraction(String model) {
//		
//		// create input model
//		BJOERNER_MODEL = model;
//		inputModel = EpsilonStandaloneExample.createEmfModel(BJOERNER_MODEL_NAME, MODELS_DIR + BJOERNER_MODEL, MODELS_DIR + BJOERNER_META_MODEL);
//			
//		// get date
//		date = new Date();
//		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yy_kk.mm.ss");
//		
//		// create output folders
//		new File(OUTPUT_DIR + sdf.format(date) + "/").mkdir();
//		
//		//create Output Model
//		abstractModel = EpsilonStandaloneExample.createEmfModel(BJOERNER_MODEL_NAME, MODELS_DIR + BJOERNER_MODEL, MODELS_DIR + BJOERNER_META_MODEL);
//		
//	}
//	
//	
//	/**
//	 * Processes a template to produce an output file of the same name in OUTPUT_DIR for each number of trains available (1 to numTrains)
//	 * Each template must have its own ETL file stored in ETL_SOURCE_DIR with the same name as the template (but with the extension .etl)
//	 * The Apache Velocity template engine is used to populate some parts of the template before EGL is processed
//	 * @param template the filename of the template file for generation. The file should be placed in TEMPLATES_DIR
//	 */
//	public void generate(String template) {
//		
//		String etlSource = ETL_SOURCE_DIR + "abstraction.etl";
//				
//		
//		System.out.println(etlSource + inputModel + outputModels);
//		
//		// Use ETL to produce output models
//		new TrackSchemeETL(etlSource, inputModel,outputModels).execute();
//		
//		
//	}
//}
//	
//
