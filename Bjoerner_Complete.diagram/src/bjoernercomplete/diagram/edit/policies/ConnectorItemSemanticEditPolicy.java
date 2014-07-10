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

import bjoernercomplete.diagram.edit.commands.PointHasC3CreateCommand;
import bjoernercomplete.diagram.edit.commands.PointHasC3ReorientCommand;
import bjoernercomplete.diagram.edit.commands.SignalPlacedAtConnectorCreateCommand;
import bjoernercomplete.diagram.edit.commands.SignalPlacedAtConnectorReorientCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC1CreateCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC1ReorientCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC2CreateCommand;
import bjoernercomplete.diagram.edit.commands.UnitHasC2ReorientCommand;
import bjoernercomplete.diagram.edit.parts.PointHasC3EditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedAtConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC1EditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC2EditPart;
import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;
import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class ConnectorItemSemanticEditPolicy extends
		BjoernerCompleteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ConnectorItemSemanticEditPolicy() {
		super(BjoernerCompleteElementTypes.Connector_2001);
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
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == UnitHasC1EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == UnitHasC2EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == SignalPlacedAtConnectorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == PointHasC3EditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
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
		if (BjoernerCompleteElementTypes.UnitHasC1_4002 == req.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.UnitHasC2_4003 == req.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.SignalPlacedAtConnector_4004 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.PointHasC3_4005 == req
				.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (BjoernerCompleteElementTypes.UnitHasC1_4002 == req.getElementType()) {
			return getGEFWrapper(new UnitHasC1CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.UnitHasC2_4003 == req.getElementType()) {
			return getGEFWrapper(new UnitHasC2CreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.SignalPlacedAtConnector_4004 == req
				.getElementType()) {
			return getGEFWrapper(new SignalPlacedAtConnectorCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.PointHasC3_4005 == req
				.getElementType()) {
			return getGEFWrapper(new PointHasC3CreateCommand(req,
					req.getSource(), req.getTarget()));
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
		case UnitHasC1EditPart.VISUAL_ID:
			return getGEFWrapper(new UnitHasC1ReorientCommand(req));
		case UnitHasC2EditPart.VISUAL_ID:
			return getGEFWrapper(new UnitHasC2ReorientCommand(req));
		case SignalPlacedAtConnectorEditPart.VISUAL_ID:
			return getGEFWrapper(new SignalPlacedAtConnectorReorientCommand(req));
		case PointHasC3EditPart.VISUAL_ID:
			return getGEFWrapper(new PointHasC3ReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
