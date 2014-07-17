package bjoernercomplete.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;

/**
 * @generated
 */
public class BjoernerCompleteEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (BjoernerCompleteVisualIDRegistry.getVisualID(view)) {

			case RailDiagramEditPart.VISUAL_ID:
				return new RailDiagramEditPart(view);

			case ConnectorEditPart.VISUAL_ID:
				return new ConnectorEditPart(view);

			case ConnectorIDEditPart.VISUAL_ID:
				return new ConnectorIDEditPart(view);

			case TerminalEditPart.VISUAL_ID:
				return new TerminalEditPart(view);

			case TerminalNameEditPart.VISUAL_ID:
				return new TerminalNameEditPart(view);

			case CrossingEditPart.VISUAL_ID:
				return new CrossingEditPart(view);

			case CrossingNameEditPart.VISUAL_ID:
				return new CrossingNameEditPart(view);

			case ControlTableEditPart.VISUAL_ID:
				return new ControlTableEditPart(view);

			case SignalEditPart.VISUAL_ID:
				return new SignalEditPart(view);

			case SignalNameEditPart.VISUAL_ID:
				return new SignalNameEditPart(view);

			case PointEditPart.VISUAL_ID:
				return new PointEditPart(view);

			case PointNameEditPart.VISUAL_ID:
				return new PointNameEditPart(view);

			case SignalPlacedAtConnectorEditPart.VISUAL_ID:
				return new SignalPlacedAtConnectorEditPart(view);

			case TrackHasSignalEditPart.VISUAL_ID:
				return new TrackHasSignalEditPart(view);

			case SignalPlacedOnTrackEditPart.VISUAL_ID:
				return new SignalPlacedOnTrackEditPart(view);

			case UnitHasC1EditPart.VISUAL_ID:
				return new UnitHasC1EditPart(view);

			case TrackHasTrackDirectionEditPart.VISUAL_ID:
				return new TrackHasTrackDirectionEditPart(view);

			case PointHasC3_PointEditPart.VISUAL_ID:
				return new PointHasC3_PointEditPart(view);

			case SignalControlsRoutesEditPart.VISUAL_ID:
				return new SignalControlsRoutesEditPart(view);

			case SignalPlacedAtEditPart.VISUAL_ID:
				return new SignalPlacedAtEditPart(view);

			case ControlTableHasRoutesEditPart.VISUAL_ID:
				return new ControlTableHasRoutesEditPart(view);

			case ConnectorHasUnit2EditPart.VISUAL_ID:
				return new ConnectorHasUnit2EditPart(view);

			case CrossingHasC3_CrossingEditPart.VISUAL_ID:
				return new CrossingHasC3_CrossingEditPart(view);

			case PointHasPointDirectionEditPart.VISUAL_ID:
				return new PointHasPointDirectionEditPart(view);

			case ConnectorHasUnit1EditPart.VISUAL_ID:
				return new ConnectorHasUnit1EditPart(view);

			case TerminalHasTerminalSignalEditPart.VISUAL_ID:
				return new TerminalHasTerminalSignalEditPart(view);

			case TrackHasSignalsEditPart.VISUAL_ID:
				return new TrackHasSignalsEditPart(view);

			case CrossingHasC4_CrossingEditPart.VISUAL_ID:
				return new CrossingHasC4_CrossingEditPart(view);

			case SignalHasDirectionEditPart.VISUAL_ID:
				return new SignalHasDirectionEditPart(view);

			case UnitHasC2EditPart.VISUAL_ID:
				return new UnitHasC2EditPart(view);

			case ConnectorHasPointEditPart.VISUAL_ID:
				return new ConnectorHasPointEditPart(view);

			case CrossingHasCrossingDirectionEditPart.VISUAL_ID:
				return new CrossingHasCrossingDirectionEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(
			ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE
				.getTextCellEditorLocator(source);
	}

}
