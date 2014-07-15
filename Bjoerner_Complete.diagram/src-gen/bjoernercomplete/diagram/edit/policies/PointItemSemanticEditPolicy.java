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

import bjoernercomplete.diagram.edit.commands.ConnectorHasPointCreateCommand;
import bjoernercomplete.diagram.edit.commands.ConnectorHasPointReorientCommand;
import bjoernercomplete.diagram.edit.commands.ConnectorHasUnit1CreateCommand;
import bjoernercomplete.diagram.edit.commands.ConnectorHasUnit1ReorientCommand;
import bjoernercomplete.diagram.edit.commands.ConnectorHasUnit2CreateCommand;
import bjoernercomplete.diagram.edit.commands.ConnectorHasUnit2ReorientCommand;
import bjoernercomplete.diagram.edit.commands.PointHasC3_PointCreateCommand;
import bjoernercomplete.diagram.edit.commands.PointHasC3_PointReorientCommand;
import bjoernercomplete.diagram.edit.commands.PointHasPointDirectionCreateCommand;
import bjoernercomplete.diagram.edit.commands.PointHasPointDirectionReorientCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC1CreateCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC1ReorientCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC2CreateCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC2ReorientCommand;
import bjoernercomplete.diagram.edit.parts.ConnectorHasPointEditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorHasUnit1EditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorHasUnit2EditPart;
import bjoernercomplete.diagram.edit.parts.PointHasC3_PointEditPart;
import bjoernercomplete.diagram.edit.parts.PointHasPointDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC1EditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC2EditPart;
import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;
import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class PointItemSemanticEditPolicy extends
		BjoernerCompleteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public PointItemSemanticEditPolicy() {
		super(BjoernerCompleteElementTypes.Point_2005);
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
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == ConnectorHasUnit1EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == ConnectorHasUnit2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == ConnectorHasPointEditPart.VISUAL_ID) {
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
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == UnitHasC2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == PointHasPointDirectionEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == PointHasC3_PointEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == UnitHasC1EditPart.VISUAL_ID) {
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
		if (BjoernerCompleteElementTypes.ConnectorHasUnit1_4015 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.UnitHasC2_4012 == req.getElementType()) {
			return getGEFWrapper(new UnitHasC2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.ConnectorHasUnit2_4010 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.PointHasPointDirection_4004 == req
				.getElementType()) {
			return getGEFWrapper(new PointHasPointDirectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.PointHasC3_Point_4001 == req
				.getElementType()) {
			return getGEFWrapper(new PointHasC3_PointCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.ConnectorHasPoint_4008 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.UnitHasC1_4011 == req.getElementType()) {
			return getGEFWrapper(new UnitHasC1CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (BjoernerCompleteElementTypes.ConnectorHasUnit1_4015 == req
				.getElementType()) {
			return getGEFWrapper(new ConnectorHasUnit1CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.UnitHasC2_4012 == req.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.ConnectorHasUnit2_4010 == req
				.getElementType()) {
			return getGEFWrapper(new ConnectorHasUnit2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.PointHasPointDirection_4004 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.PointHasC3_Point_4001 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.ConnectorHasPoint_4008 == req
				.getElementType()) {
			return getGEFWrapper(new ConnectorHasPointCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.UnitHasC1_4011 == req.getElementType()) {
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
		case ConnectorHasUnit1EditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectorHasUnit1ReorientCommand(req));
		case UnitHasC2EditPart.VISUAL_ID:
			return getGEFWrapper(new UnitHasC2ReorientCommand(req));
		case ConnectorHasUnit2EditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectorHasUnit2ReorientCommand(req));
		case PointHasPointDirectionEditPart.VISUAL_ID:
			return getGEFWrapper(new PointHasPointDirectionReorientCommand(req));
		case PointHasC3_PointEditPart.VISUAL_ID:
			return getGEFWrapper(new PointHasC3_PointReorientCommand(req));
		case ConnectorHasPointEditPart.VISUAL_ID:
			return getGEFWrapper(new ConnectorHasPointReorientCommand(req));
		case UnitHasC1EditPart.VISUAL_ID:
			return getGEFWrapper(new UnitHasC1ReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
