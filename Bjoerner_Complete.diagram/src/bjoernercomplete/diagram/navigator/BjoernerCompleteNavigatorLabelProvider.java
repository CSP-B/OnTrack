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

import bjoernercomplete.diagram.edit.parts.ConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.ControlTableEditPart;
import bjoernercomplete.diagram.edit.parts.LinearEditPart;
import bjoernercomplete.diagram.edit.parts.LinearNameEditPart;
import bjoernercomplete.diagram.edit.parts.PointEditPart;
import bjoernercomplete.diagram.edit.parts.PointHasC3EditPart;
import bjoernercomplete.diagram.edit.parts.PointNameEditPart;
import bjoernercomplete.diagram.edit.parts.RailDiagramEditPart;
import bjoernercomplete.diagram.edit.parts.SignalEditPart;
import bjoernercomplete.diagram.edit.parts.SignalNameEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedAtConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedOnLinearEditPart;
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
		case ConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0?Connector", BjoernerCompleteElementTypes.Connector_2001); //$NON-NLS-1$
		case UnitHasC2EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0?Unit?hasC2", BjoernerCompleteElementTypes.UnitHasC2_4003); //$NON-NLS-1$
		case SignalPlacedOnLinearEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0?Signal?placedOnLinear", BjoernerCompleteElementTypes.SignalPlacedOnLinear_4001); //$NON-NLS-1$
		case LinearEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0?Linear", BjoernerCompleteElementTypes.Linear_2002); //$NON-NLS-1$
		case PointHasC3EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0?Point?hasC3", BjoernerCompleteElementTypes.PointHasC3_4005); //$NON-NLS-1$
		case SignalPlacedAtConnectorEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0?Signal?placedAtConnector", BjoernerCompleteElementTypes.SignalPlacedAtConnector_4004); //$NON-NLS-1$
		case PointEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0?Point", BjoernerCompleteElementTypes.Point_2004); //$NON-NLS-1$
		case RailDiagramEditPart.VISUAL_ID:
			return getImage(
					"Navigator?Diagram?http://bjoernercomplete/1.0?RailDiagram", BjoernerCompleteElementTypes.RailDiagram_1000); //$NON-NLS-1$
		case ControlTableEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0?ControlTable", BjoernerCompleteElementTypes.ControlTable_2005); //$NON-NLS-1$
		case SignalEditPart.VISUAL_ID:
			return getImage(
					"Navigator?TopLevelNode?http://bjoernercomplete/1.0?Signal", BjoernerCompleteElementTypes.Signal_2003); //$NON-NLS-1$
		case UnitHasC1EditPart.VISUAL_ID:
			return getImage(
					"Navigator?Link?http://bjoernercomplete/1.0?Unit?hasC1", BjoernerCompleteElementTypes.UnitHasC1_4002); //$NON-NLS-1$
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
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2001Text(view);
		case UnitHasC2EditPart.VISUAL_ID:
			return getUnitHasC2_4003Text(view);
		case SignalPlacedOnLinearEditPart.VISUAL_ID:
			return getSignalPlacedOnLinear_4001Text(view);
		case LinearEditPart.VISUAL_ID:
			return getLinear_2002Text(view);
		case PointHasC3EditPart.VISUAL_ID:
			return getPointHasC3_4005Text(view);
		case SignalPlacedAtConnectorEditPart.VISUAL_ID:
			return getSignalPlacedAtConnector_4004Text(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2004Text(view);
		case RailDiagramEditPart.VISUAL_ID:
			return getRailDiagram_1000Text(view);
		case ControlTableEditPart.VISUAL_ID:
			return getControlTable_2005Text(view);
		case SignalEditPart.VISUAL_ID:
			return getSignal_2003Text(view);
		case UnitHasC1EditPart.VISUAL_ID:
			return getUnitHasC1_4002Text(view);
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
	private String getSignalPlacedOnLinear_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getConnector_2001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getControlTable_2005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnitHasC1_4002Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getUnitHasC2_4003Text(View view) {
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
					"Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	 * @generated
	 */
	private String getPointHasC3_4005Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getLinear_2002Text(View view) {
		IParser parser = BjoernerCompleteParserProvider.getParser(
				BjoernerCompleteElementTypes.Linear_2002,
				view.getElement() != null ? view.getElement() : view,
				BjoernerCompleteVisualIDRegistry
						.getType(LinearNameEditPart.VISUAL_ID));
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
	private String getSignalPlacedAtConnector_4004Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	private String getPoint_2004Text(View view) {
		IParser parser = BjoernerCompleteParserProvider.getParser(
				BjoernerCompleteElementTypes.Point_2004,
				view.getElement() != null ? view.getElement() : view,
				BjoernerCompleteVisualIDRegistry
						.getType(PointNameEditPart.VISUAL_ID));
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
