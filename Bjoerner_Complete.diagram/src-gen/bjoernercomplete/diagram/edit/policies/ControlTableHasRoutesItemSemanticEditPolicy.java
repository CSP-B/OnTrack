package bjoernercomplete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class ControlTableHasRoutesItemSemanticEditPolicy extends
		BjoernerCompleteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ControlTableHasRoutesItemSemanticEditPolicy() {
		super(BjoernerCompleteElementTypes.ControlTableHasRoutes_4013);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
