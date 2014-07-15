package bjoernercomplete.diagram.providers;

import org.eclipse.gmf.tooling.runtime.providers.DefaultEditPartProvider;

import bjoernercomplete.diagram.edit.parts.BjoernerCompleteEditPartFactory;
import bjoernercomplete.diagram.edit.parts.ConnectorEditPart;
import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;

/**
 * @generated
 */
public class BjoernerCompleteEditPartProvider extends DefaultEditPartProvider {

	/**
	 * @generated
	 */
	public BjoernerCompleteEditPartProvider() {
		super(new BjoernerCompleteEditPartFactory(),
				BjoernerCompleteVisualIDRegistry.TYPED_INSTANCE,
				ConnectorEditPart.MODEL_ID);
	}

}
