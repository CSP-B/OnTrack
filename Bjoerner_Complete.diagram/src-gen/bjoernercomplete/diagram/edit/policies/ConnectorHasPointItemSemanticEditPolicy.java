package bjoernercomplete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class ConnectorHasPointItemSemanticEditPolicy extends
		BjoernerCompleteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectorHasPointItemSemanticEditPolicy() {
		super(BjoernerCompleteElementTypes.ConnectorHasPoint_4008);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
