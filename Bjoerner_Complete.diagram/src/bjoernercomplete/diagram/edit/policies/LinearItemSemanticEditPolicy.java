package bjoernercomplete.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;

import bjoernercomplete.diagram.edit.commands.SignalPlacedOnLinearCreateCommand;
import bjoernercomplete.diagram.edit.commands.SignalPlacedOnLinearReorientCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC1CreateCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC1ReorientCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC2CreateCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC2ReorientCommand;
import bjoernercomplete.diagram.edit.parts.SignalPlacedOnLinearEditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC1EditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC2EditPart;
import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;
import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class LinearItemSemanticEditPolicy extends
		BjoernerCompleteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LinearItemSemanticEditPolicy() {
		super(BjoernerCompleteElementTypes.Linear_2002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(
				getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator<?> it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == SignalPlacedOnLinearEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator<?> it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == UnitHasC1EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == UnitHasC2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: false
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req)
				: getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super
				.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (BjoernerCompleteElementTypes.SignalPlacedOnLinear_4001 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.UnitHasC1_4002 == req.getElementType()) {
			return getGEFWrapper(new UnitHasC1CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.UnitHasC2_4003 == req.getElementType()) {
			return getGEFWrapper(new UnitHasC2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (BjoernerCompleteElementTypes.SignalPlacedOnLinear_4001 == req
				.getElementType()) {
			return getGEFWrapper(new SignalPlacedOnLinearCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.UnitHasC1_4002 == req.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.UnitHasC2_4003 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case SignalPlacedOnLinearEditPart.VISUAL_ID:
			return getGEFWrapper(new SignalPlacedOnLinearReorientCommand(req));
		case UnitHasC1EditPart.VISUAL_ID:
			return getGEFWrapper(new UnitHasC1ReorientCommand(req));
		case UnitHasC2EditPart.VISUAL_ID:
			return getGEFWrapper(new UnitHasC2ReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
