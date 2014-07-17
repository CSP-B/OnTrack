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

import bjoernercomplete.diagram.edit.commands.SignalControlsRoutesCreateCommand;
import bjoernercomplete.diagram.edit.commands.SignalControlsRoutesReorientCommand;
import bjoernercomplete.diagram.edit.commands.SignalHasDirectionCreateCommand;
import bjoernercomplete.diagram.edit.commands.SignalHasDirectionReorientCommand;
import bjoernercomplete.diagram.edit.commands.SignalPlacedAtConnectorCreateCommand;
import bjoernercomplete.diagram.edit.commands.SignalPlacedAtConnectorReorientCommand;
import bjoernercomplete.diagram.edit.commands.SignalPlacedAtCreateCommand;
import bjoernercomplete.diagram.edit.commands.SignalPlacedAtReorientCommand;
import bjoernercomplete.diagram.edit.commands.SignalPlacedOnTrackCreateCommand;
import bjoernercomplete.diagram.edit.commands.SignalPlacedOnTrackReorientCommand;
import bjoernercomplete.diagram.edit.commands.TerminalHasTerminalSignalCreateCommand;
import bjoernercomplete.diagram.edit.commands.TerminalHasTerminalSignalReorientCommand;
import bjoernercomplete.diagram.edit.commands.TrackHasSignalCreateCommand;
import bjoernercomplete.diagram.edit.commands.TrackHasSignalReorientCommand;
import bjoernercomplete.diagram.edit.commands.TrackHasSignalsCreateCommand;
import bjoernercomplete.diagram.edit.commands.TrackHasSignalsReorientCommand;
import bjoernercomplete.diagram.edit.parts.SignalControlsRoutesEditPart;
import bjoernercomplete.diagram.edit.parts.SignalHasDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedAtConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedAtEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedOnTrackEditPart;
import bjoernercomplete.diagram.edit.parts.TerminalHasTerminalSignalEditPart;
import bjoernercomplete.diagram.edit.parts.TrackHasSignalEditPart;
import bjoernercomplete.diagram.edit.parts.TrackHasSignalsEditPart;
import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;
import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class SignalItemSemanticEditPolicy extends
		BjoernerCompleteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public SignalItemSemanticEditPolicy() {
		super(BjoernerCompleteElementTypes.Signal_2003);
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
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == TrackHasSignalEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == TerminalHasTerminalSignalEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						incomingLink.getSource().getElement(), null,
						incomingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(incomingLink) == TrackHasSignalsEditPart.VISUAL_ID) {
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
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == SignalPlacedAtConnectorEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == SignalPlacedOnTrackEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == SignalControlsRoutesEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == SignalPlacedAtEditPart.VISUAL_ID) {
				DestroyReferenceRequest r = new DestroyReferenceRequest(
						outgoingLink.getSource().getElement(), null,
						outgoingLink.getTarget().getElement(), false);
				cmd.add(new DestroyReferenceCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
			if (BjoernerCompleteVisualIDRegistry.getVisualID(outgoingLink) == SignalHasDirectionEditPart.VISUAL_ID) {
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
		if (BjoernerCompleteElementTypes.SignalPlacedAtConnector_4016 == req
				.getElementType()) {
			return getGEFWrapper(new SignalPlacedAtConnectorCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.TrackHasSignal_4006 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.SignalPlacedOnTrack_4005 == req
				.getElementType()) {
			return getGEFWrapper(new SignalPlacedOnTrackCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.SignalControlsRoutes_4019 == req
				.getElementType()) {
			return getGEFWrapper(new SignalControlsRoutesCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.SignalPlacedAt_4007 == req
				.getElementType()) {
			return getGEFWrapper(new SignalPlacedAtCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.TerminalHasTerminalSignal_4017 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.TrackHasSignals_4018 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.SignalHasDirection_4020 == req
				.getElementType()) {
			return getGEFWrapper(new SignalHasDirectionCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(
			CreateRelationshipRequest req) {
		if (BjoernerCompleteElementTypes.SignalPlacedAtConnector_4016 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.TrackHasSignal_4006 == req
				.getElementType()) {
			return getGEFWrapper(new TrackHasSignalCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.SignalPlacedOnTrack_4005 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.SignalControlsRoutes_4019 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.SignalPlacedAt_4007 == req
				.getElementType()) {
			return null;
		}
		if (BjoernerCompleteElementTypes.TerminalHasTerminalSignal_4017 == req
				.getElementType()) {
			return getGEFWrapper(new TerminalHasTerminalSignalCreateCommand(
					req, req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.TrackHasSignals_4018 == req
				.getElementType()) {
			return getGEFWrapper(new TrackHasSignalsCreateCommand(req,
					req.getSource(), req.getTarget()));
		}
		if (BjoernerCompleteElementTypes.SignalHasDirection_4020 == req
				.getElementType()) {
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
		case SignalPlacedAtConnectorEditPart.VISUAL_ID:
			return getGEFWrapper(new SignalPlacedAtConnectorReorientCommand(req));
		case TrackHasSignalEditPart.VISUAL_ID:
			return getGEFWrapper(new TrackHasSignalReorientCommand(req));
		case SignalPlacedOnTrackEditPart.VISUAL_ID:
			return getGEFWrapper(new SignalPlacedOnTrackReorientCommand(req));
		case SignalControlsRoutesEditPart.VISUAL_ID:
			return getGEFWrapper(new SignalControlsRoutesReorientCommand(req));
		case SignalPlacedAtEditPart.VISUAL_ID:
			return getGEFWrapper(new SignalPlacedAtReorientCommand(req));
		case TerminalHasTerminalSignalEditPart.VISUAL_ID:
			return getGEFWrapper(new TerminalHasTerminalSignalReorientCommand(
					req));
		case TrackHasSignalsEditPart.VISUAL_ID:
			return getGEFWrapper(new TrackHasSignalsReorientCommand(req));
		case SignalHasDirectionEditPart.VISUAL_ID:
			return getGEFWrapper(new SignalHasDirectionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
