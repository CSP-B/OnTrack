package tool;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.epsilon.eol.EolModule;
import org.eclipse.epsilon.eol.IEolExecutableModule;
import org.eclipse.epsilon.eol.exceptions.models.EolModelLoadingException;
import org.eclipse.epsilon.eol.models.IModel;

public class TrackSchemeEOL extends EpsilonStandaloneExample {
	
	private List<IModel> models;
	private final String source;

	public TrackSchemeEOL(String source, IModel model) {
		
		this.source = source;
		
		// Set model properties
		model.setReadOnLoad(true);
		model.setStoredOnDisposal(false);
		try {
			model.load();
		} catch (EolModelLoadingException e) {
			System.out.println("Error loading model");
			e.printStackTrace();
		}
		
		// Add to models
		models = new ArrayList<IModel>();
		models.add(model);
	}

	@Override
	public IEolExecutableModule createModule() {
		return new EolModule();
	}

	@Override
	public String getSource() {
		return source;
	}

	@Override
	public List<IModel> getModels() {
		return models;
	}

}
