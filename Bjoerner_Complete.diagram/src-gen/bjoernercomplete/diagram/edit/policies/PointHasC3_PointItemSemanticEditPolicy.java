package bjoernercomplete.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class PointHasC3_PointItemSemanticEditPolicy extends
		BjoernerCompleteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PointHasC3_PointItemSemanticEditPolicy() {
		super(BjoernerCompleteElementTypes.PointHasC3_Point_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
