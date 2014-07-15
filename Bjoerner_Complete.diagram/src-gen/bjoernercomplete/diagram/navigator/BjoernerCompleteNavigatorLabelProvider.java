package bjoernercomplete.diagram.navigator;

import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

import bjoernercomplete.Connector;
import bjoernercomplete.diagram.edit.parts.ConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorHasPointEditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorHasUnit1EditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorHasUnit2EditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorIDEditPart;
import bjoernercomplete.diagram.edit.parts.ControlTableEditPart;
import bjoernercomplete.diagram.edit.parts.ControlTableHasRoutesEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingHasC3_CrossingEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingHasC4_CrossingEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingHasCrossingDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingNameEditPart;
import bjoernercomplete.diagram.edit.parts.PointEditPart;
import bjoernercomplete.diagram.edit.parts.PointHasC3_PointEditPart;
import bjoernercomplete.diagram.edit.parts.PointHasPointDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.PointNameEditPart;
import bjoernercomplete.diagram.edit.parts.RailDiagramEditPart;
import bjoernercomplete.diagram.edit.parts.SignalControlsRoutesEditPart;
import bjoernercomplete.diagram.edit.parts.SignalEditPart;
import bjoernercomplete.diagram.edit.parts.SignalHasDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.SignalNameEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedAtConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedAtEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedOnTrackEditPart;
import bjoernercomplete.diagram.edit.parts.TerminalEditPart;
import bjoernercomplete.diagram.edit.parts.TerminalHasTerminalSignalEditPart;
import bjoernercomplete.diagram.edit.parts.TerminalNameEditPart;
import bjoernercomplete.diagram.edit.parts.TrackHasSignalEditPart;
import bjoernercomplete.diagram.edit.parts.TrackHasSignalsEditPart;
import bjoernercomplete.diagram.edit.parts.TrackHasTrackDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC1EditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC2EditPart;
import bjoernercomplete.diagram.part.BjoernerCompleteDiagramEditorPlugin;
import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;
import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;
import bjoernercomplete.diagram.providers.BjoernerCompleteParserProvider;

/**
 * @generated
 */
public class BjoernerCompleteNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	 * @generated
	 */
	static {
		BjoernerCompleteDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		BjoernerCompleteDiagramEditorPlugin
				.getInstance()
				.getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof BjoernerCompleteNavigatorItem
				&& !isOwnView(((BjoernerCompleteNavigatorItem) element)
						.getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	 * @generated
	 */
	public Image getImage(Object element) {
		if (element instanceof BjoernerCompleteNavigatorGroup) {
			BjoernerCompleteNavigatorGroup group = (BjoernerCompleteNavigatorGroup) element;
			return BjoernerCompleteDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof BjoernerCompleteNavigatorItem) {
			BjoernerCompleteNavigatorItem navigatorItem = (BjoernerCompleteNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		return super.getImage(element);
	}

	/**
	 * @generated
	 */
	public Image getImage(View view) {
		switch (BjoernerCompleteVisualIDRegistry.getVisualID(view)) {
		case RailDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://bjoernercomplete/1.0.0.qualifier?RailDiagram", BjoernerCompleteElementTypes.RailDiagram_1000); //$NON-NLS-1$
		case TerminalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0.0.qualifier?Terminal", BjoernerCompleteElementTypes.Terminal_2001); //$NON-NLS-1$
		case ControlTableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0.0.qualifier?ControlTable", BjoernerCompleteElementTypes.ControlTable_2002); //$NON-NLS-1$
		case SignalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0.0.qualifier?Signal", BjoernerCompleteElementTypes.Signal_2003); //$NON-NLS-1$
		case ConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0.0.qualifier?Connector", BjoernerCompleteElementTypes.Connector_2004); //$NON-NLS-1$
		case PointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0.0.qualifier?Point", BjoernerCompleteElementTypes.Point_2005); //$NON-NLS-1$
		case CrossingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0.0.qualifier?Crossing", BjoernerCompleteElementTypes.Crossing_2006); //$NON-NLS-1$
		case PointHasC3_PointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Point?hasC3_Point", BjoernerCompleteElementTypes.PointHasC3_Point_4001); //$NON-NLS-1$
		case CrossingHasCrossingDirectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Crossing?hasCrossingDirection", BjoernerCompleteElementTypes.CrossingHasCrossingDirection_4002); //$NON-NLS-1$
		case TrackHasTrackDirectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Track?hasTrackDirection", BjoernerCompleteElementTypes.TrackHasTrackDirection_4003); //$NON-NLS-1$
		case PointHasPointDirectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Point?hasPointDirection", BjoernerCompleteElementTypes.PointHasPointDirection_4004); //$NON-NLS-1$
		case SignalPlacedOnTrackEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Signal?placedOnTrack", BjoernerCompleteElementTypes.SignalPlacedOnTrack_4005); //$NON-NLS-1$
		case TrackHasSignalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Track?hasSignal", BjoernerCompleteElementTypes.TrackHasSignal_4006); //$NON-NLS-1$
		case SignalPlacedAtEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Signal?placedAt", BjoernerCompleteElementTypes.SignalPlacedAt_4007); //$NON-NLS-1$
		case ConnectorHasPointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Connector?hasPoint", BjoernerCompleteElementTypes.ConnectorHasPoint_4008); //$NON-NLS-1$
		case CrossingHasC3_CrossingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Crossing?hasC3_Crossing", BjoernerCompleteElementTypes.CrossingHasC3_Crossing_4009); //$NON-NLS-1$
		case ConnectorHasUnit2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Connector?hasUnit2", BjoernerCompleteElementTypes.ConnectorHasUnit2_4010); //$NON-NLS-1$
		case UnitHasC1EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Unit?hasC1", BjoernerCompleteElementTypes.UnitHasC1_4011); //$NON-NLS-1$
		case UnitHasC2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Unit?hasC2", BjoernerCompleteElementTypes.UnitHasC2_4012); //$NON-NLS-1$
		case ControlTableHasRoutesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?ControlTable?hasRoutes", BjoernerCompleteElementTypes.ControlTableHasRoutes_4013); //$NON-NLS-1$
		case CrossingHasC4_CrossingEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Crossing?hasC4_Crossing", BjoernerCompleteElementTypes.CrossingHasC4_Crossing_4014); //$NON-NLS-1$
		case ConnectorHasUnit1EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Connector?hasUnit1", BjoernerCompleteElementTypes.ConnectorHasUnit1_4015); //$NON-NLS-1$
		case SignalPlacedAtConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Signal?placedAtConnector", BjoernerCompleteElementTypes.SignalPlacedAtConnector_4016); //$NON-NLS-1$
		case TerminalHasTerminalSignalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Terminal?hasTerminalSignal", BjoernerCompleteElementTypes.TerminalHasTerminalSignal_4017); //$NON-NLS-1$
		case TrackHasSignalsEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Track?hasSignals", BjoernerCompleteElementTypes.TrackHasSignals_4018); //$NON-NLS-1$
		case SignalControlsRoutesEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Signal?controlsRoutes", BjoernerCompleteElementTypes.SignalControlsRoutes_4019); //$NON-NLS-1$
		case SignalHasDirectionEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0.0.qualifier?Signal?hasDirection", BjoernerCompleteElementTypes.SignalHasDirection_4020); //$NON-NLS-1$
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = BjoernerCompleteDiagramEditorPlugin
				.getInstance().getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& BjoernerCompleteElementTypes.isKnownElementType(elementType)) {
			image = BjoernerCompleteElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public String getText(Object element) {
		if (element instanceof BjoernerCompleteNavigatorGroup) {
			BjoernerCompleteNavigatorGroup group = (BjoernerCompleteNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof BjoernerCompleteNavigatorItem) {
			BjoernerCompleteNavigatorItem navigatorItem = (BjoernerCompleteNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		return super.getText(element);
	}

	/**
	 * @generated
	 */
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (BjoernerCompleteVisualIDRegistry.getVisualID(view)) {
		case RailDiagramEditPart.VISUAL_ID:
			return getRailDiagram_1000Text(view);
		case TerminalEditPart.VISUAL_ID:
			return getTerminal_2001Text(view);
		case ControlTableEditPart.VISUAL_ID:
			return getControlTable_2002Text(view);
		case SignalEditPart.VISUAL_ID:
			return getSignal_2003Text(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2004Text(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2005Text(view);
		case CrossingEditPart.VISUAL_ID:
			return getCrossing_2006Text(view);
		case PointHasC3_PointEditPart.VISUAL_ID:
			return getPointHasC3_Point_4001Text(view);
		case CrossingHasCrossingDirectionEditPart.VISUAL_ID:
			return getCrossingHasCrossingDirection_4002Text(view);
		case TrackHasTrackDirectionEditPart.VISUAL_ID:
			return getTrackHasTrackDirection_4003Text(view);
		case PointHasPointDirectionEditPart.VISUAL_ID:
			return getPointHasPointDirection_4004Text(view);
		case SignalPlacedOnTrackEditPart.VISUAL_ID:
			return getSignalPlacedOnTrack_4005Text(view);
		case TrackHasSignalEditPart.VISUAL_ID:
			return getTrackHasSignal_4006Text(view);
		case SignalPlacedAtEditPart.VISUAL_ID:
			return getSignalPlacedAt_4007Text(view);
		case ConnectorHasPointEditPart.VISUAL_ID:
			return getConnectorHasPoint_4008Text(view);
		case CrossingHasC3_CrossingEditPart.VISUAL_ID:
			return getCrossingHasC3_Crossing_4009Text(view);
		case ConnectorHasUnit2EditPart.VISUAL_ID:
			return getConnectorHasUnit2_4010Text(view);
		case UnitHasC1EditPart.VISUAL_ID:
			return getUnitHasC1_4011Text(view);
		case UnitHasC2EditPart.VISUAL_ID:
			return getUnitHasC2_4012Text(view);
		case ControlTableHasRoutesEditPart.VISUAL_ID:
			return getControlTableHasRoutes_4013Text(view);
		case CrossingHasC4_CrossingEditPart.VISUAL_ID:
			return getCrossingHasC4_Crossing_4014Text(view);
		case ConnectorHasUnit1EditPart.VISUAL_ID:
			return getConnectorHasUnit1_4015Text(view);
		case SignalPlacedAtConnectorEditPart.VISUAL_ID:
			return getSignalPlacedAtConnector_4016Text(view);
		case TerminalHasTerminalSignalEditPart.VISUAL_ID:
			return getTerminalHasTerminalSignal_4017Text(view);
		case TrackHasSignalsEditPart.VISUAL_ID:
			return getTrackHasSignals_4018Text(view);
		case SignalControlsRoutesEditPart.VISUAL_ID:
			return getSignalControlsRoutes_4019Text(view);
		case SignalHasDirectionEditPart.VISUAL_ID:
			return getSignalHasDirection_4020Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	 * @generated
	 */
	private String getRailDiagram_1000Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTerminal_2001Text(View view) {
		IParser parser = BjoernerCompleteParserProvider.getParser(
				BjoernerCompleteElementTypes.Terminal_2001,
				view.getElement() != null ? view.getElement() : view,
				BjoernerCompleteVisualIDRegistry
						.getType(TerminalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BjoernerCompleteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getControlTable_2002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSignal_2003Text(View view) {
		IParser parser = BjoernerCompleteParserProvider.getParser(
				BjoernerCompleteElementTypes.Signal_2003,
				view.getElement() != null ? view.getElement() : view,
				BjoernerCompleteVisualIDRegistry
						.getType(SignalNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BjoernerCompleteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5004); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getConnector_2004Text(View view) {
		IParser parser = BjoernerCompleteParserProvider.getParser(
				BjoernerCompleteElementTypes.Connector_2004,
				view.getElement() != null ? view.getElement() : view,
				BjoernerCompleteVisualIDRegistry
						.getType(ConnectorIDEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BjoernerCompleteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPoint_2005Text(View view) {
		IParser parser = BjoernerCompleteParserProvider.getParser(
				BjoernerCompleteElementTypes.Point_2005,
				view.getElement() != null ? view.getElement() : view,
				BjoernerCompleteVisualIDRegistry
						.getType(PointNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BjoernerCompleteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getCrossing_2006Text(View view) {
		IParser parser = BjoernerCompleteParserProvider.getParser(
				BjoernerCompleteElementTypes.Crossing_2006,
				view.getElement() != null ? view.getElement() : view,
				BjoernerCompleteVisualIDRegistry
						.getType(CrossingNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(
					view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			BjoernerCompleteDiagramEditorPlugin.getInstance().logError(
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPointHasC3_Point_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCrossingHasCrossingDirection_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTrackHasTrackDirection_4003Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPointHasPointDirection_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSignalPlacedOnTrack_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTrackHasSignal_4006Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSignalPlacedAt_4007Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectorHasPoint_4008Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCrossingHasC3_Crossing_4009Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectorHasUnit2_4010Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnitHasC1_4011Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnitHasC2_4012Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getControlTableHasRoutes_4013Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getCrossingHasC4_Crossing_4014Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnectorHasUnit1_4015Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSignalPlacedAtConnector_4016Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTerminalHasTerminalSignal_4017Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getTrackHasSignals_4018Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSignalControlsRoutes_4019Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getSignalHasDirection_4020Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return RailDiagramEditPart.MODEL_ID
				.equals(BjoernerCompleteVisualIDRegistry.getModelID(view));
	}

}
