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

			case LinearEditPart.VISUAL_ID:
				return new LinearEditPart(view);

			case LinearNameEditPart.VISUAL_ID:
				return new LinearNameEditPart(view);

			case SignalEditPart.VISUAL_ID:
				return new SignalEditPart(view);

			case SignalNameEditPart.VISUAL_ID:
				return new SignalNameEditPart(view);

			case PointEditPart.VISUAL_ID:
				return new PointEditPart(view);

			case PointNameEditPart.VISUAL_ID:
				return new PointNameEditPart(view);

			case ControlTableEditPart.VISUAL_ID:
				return new ControlTableEditPart(view);

			case SignalPlacedOnLinearEditPart.VISUAL_ID:
				return new SignalPlacedOnLinearEditPart(view);

			case UnitHasC1EditPart.VISUAL_ID:
				return new UnitHasC1EditPart(view);

			case UnitHasC2EditPart.VISUAL_ID:
				return new UnitHasC2EditPart(view);

			case SignalPlacedAtConnectorEditPart.VISUAL_ID:
				return new SignalPlacedAtConnectorEditPart(view);

			case PointHasC3EditPart.VISUAL_ID:
				return new PointHasC3EditPart(view);

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
