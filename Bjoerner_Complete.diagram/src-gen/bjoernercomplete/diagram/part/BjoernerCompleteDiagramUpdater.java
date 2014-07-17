package bjoernercomplete.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Connector;
import bjoernercomplete.ControlTable;
import bjoernercomplete.Crossing;
import bjoernercomplete.Direction;
import bjoernercomplete.Point;
import bjoernercomplete.RailDiagram;
import bjoernercomplete.Route;
import bjoernercomplete.Signal;
import bjoernercomplete.Terminal;
import bjoernercomplete.Track;
import bjoernercomplete.Unit;
import bjoernercomplete.diagram.edit.parts.ConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorHasPointEditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorHasUnit1EditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorHasUnit2EditPart;
import bjoernercomplete.diagram.edit.parts.ControlTableEditPart;
import bjoernercomplete.diagram.edit.parts.ControlTableHasRoutesEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingHasC3_CrossingEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingHasC4_CrossingEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingHasCrossingDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.PointEditPart;
import bjoernercomplete.diagram.edit.parts.PointHasC3_PointEditPart;
import bjoernercomplete.diagram.edit.parts.PointHasPointDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.RailDiagramEditPart;
import bjoernercomplete.diagram.edit.parts.SignalControlsRoutesEditPart;
import bjoernercomplete.diagram.edit.parts.SignalEditPart;
import bjoernercomplete.diagram.edit.parts.SignalHasDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedAtConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedAtEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedOnTrackEditPart;
import bjoernercomplete.diagram.edit.parts.TerminalEditPart;
import bjoernercomplete.diagram.edit.parts.TerminalHasTerminalSignalEditPart;
import bjoernercomplete.diagram.edit.parts.TrackHasSignalEditPart;
import bjoernercomplete.diagram.edit.parts.TrackHasSignalsEditPart;
import bjoernercomplete.diagram.edit.parts.TrackHasTrackDirectionEditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC1EditPart;
import bjoernercomplete.diagram.edit.parts.UnitHasC2EditPart;
import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class BjoernerCompleteDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteNodeDescriptor> getSemanticChildren(
			View view) {
		switch (BjoernerCompleteVisualIDRegistry.getVisualID(view)) {
		case RailDiagramEditPart.VISUAL_ID:
			return getRailDiagram_1000SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteNodeDescriptor> getRailDiagram_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		RailDiagram modelElement = (RailDiagram) view.getElement();
		LinkedList<BjoernerCompleteNodeDescriptor> result = new LinkedList<BjoernerCompleteNodeDescriptor>();
		for (Iterator<?> it = modelElement.getHasConnectors().iterator(); it
				.hasNext();) {
			Connector childElement = (Connector) it.next();
			int visualID = BjoernerCompleteVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ConnectorEditPart.VISUAL_ID) {
				result.add(new BjoernerCompleteNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		for (Iterator<?> it = modelElement.getHasUnits().iterator(); it
				.hasNext();) {
			Unit childElement = (Unit) it.next();
			int visualID = BjoernerCompleteVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == TerminalEditPart.VISUAL_ID) {
				result.add(new BjoernerCompleteNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == CrossingEditPart.VISUAL_ID) {
				result.add(new BjoernerCompleteNodeDescriptor(childElement,
						visualID));
				continue;
			}
			if (visualID == PointEditPart.VISUAL_ID) {
				result.add(new BjoernerCompleteNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		{
			ControlTable childElement = modelElement.getHasControlTable();
			int visualID = BjoernerCompleteVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ControlTableEditPart.VISUAL_ID) {
				result.add(new BjoernerCompleteNodeDescriptor(childElement,
						visualID));
			}
		}
		for (Iterator<?> it = modelElement.getHasSignals().iterator(); it
				.hasNext();) {
			Signal childElement = (Signal) it.next();
			int visualID = BjoernerCompleteVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == SignalEditPart.VISUAL_ID) {
				result.add(new BjoernerCompleteNodeDescriptor(childElement,
						visualID));
				continue;
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getContainedLinks(
			View view) {
		switch (BjoernerCompleteVisualIDRegistry.getVisualID(view)) {
		case RailDiagramEditPart.VISUAL_ID:
			return getRailDiagram_1000ContainedLinks(view);
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2004ContainedLinks(view);
		case TerminalEditPart.VISUAL_ID:
			return getTerminal_2001ContainedLinks(view);
		case CrossingEditPart.VISUAL_ID:
			return getCrossing_2006ContainedLinks(view);
		case ControlTableEditPart.VISUAL_ID:
			return getControlTable_2002ContainedLinks(view);
		case SignalEditPart.VISUAL_ID:
			return getSignal_2003ContainedLinks(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2005ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getIncomingLinks(
			View view) {
		switch (BjoernerCompleteVisualIDRegistry.getVisualID(view)) {
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2004IncomingLinks(view);
		case TerminalEditPart.VISUAL_ID:
			return getTerminal_2001IncomingLinks(view);
		case CrossingEditPart.VISUAL_ID:
			return getCrossing_2006IncomingLinks(view);
		case ControlTableEditPart.VISUAL_ID:
			return getControlTable_2002IncomingLinks(view);
		case SignalEditPart.VISUAL_ID:
			return getSignal_2003IncomingLinks(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2005IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getOutgoingLinks(
			View view) {
		switch (BjoernerCompleteVisualIDRegistry.getVisualID(view)) {
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_2004OutgoingLinks(view);
		case TerminalEditPart.VISUAL_ID:
			return getTerminal_2001OutgoingLinks(view);
		case CrossingEditPart.VISUAL_ID:
			return getCrossing_2006OutgoingLinks(view);
		case ControlTableEditPart.VISUAL_ID:
			return getControlTable_2002OutgoingLinks(view);
		case SignalEditPart.VISUAL_ID:
			return getSignal_2003OutgoingLinks(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2005OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getRailDiagram_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getTerminal_2001ContainedLinks(
			View view) {
		Terminal modelElement = (Terminal) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Track_HasSignal_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Track_HasTrackDirection_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Terminal_HasTerminalSignal_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Track_HasSignals_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getCrossing_2006ContainedLinks(
			View view) {
		Crossing modelElement = (Crossing) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Crossing_HasC3_Crossing_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Crossing_HasC4_Crossing_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Crossing_HasCrossingDirection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getConnector_2004ContainedLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_HasUnit2_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_HasUnit1_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_HasPoint_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getSignal_2003ContainedLinks(
			View view) {
		Signal modelElement = (Signal) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedAtConnector_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedOnTrack_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_ControlsRoutes_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedAt_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_HasDirection_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getPoint_2005ContainedLinks(
			View view) {
		Point modelElement = (Point) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Point_HasC3_Point_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Point_HasPointDirection_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getControlTable_2002ContainedLinks(
			View view) {
		ControlTable modelElement = (ControlTable) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ControlTable_HasRoutes_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getTerminal_2001IncomingLinks(
			View view) {
		Terminal modelElement = (Terminal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Signal_PlacedOnTrack_4005(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Signal_PlacedAt_4007(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connector_HasUnit2_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connector_HasUnit1_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getCrossing_2006IncomingLinks(
			View view) {
		Crossing modelElement = (Crossing) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connector_HasUnit2_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connector_HasUnit1_4015(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getConnector_2004IncomingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Signal_PlacedAtConnector_4016(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Unit_HasC1_4011(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Point_HasC3_Point_4001(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Crossing_HasC3_Crossing_4009(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Crossing_HasC4_Crossing_4014(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Unit_HasC2_4012(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getSignal_2003IncomingLinks(
			View view) {
		Signal modelElement = (Signal) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Track_HasSignal_4006(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Terminal_HasTerminalSignal_4017(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Track_HasSignals_4018(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getPoint_2005IncomingLinks(
			View view) {
		Point modelElement = (Point) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Connector_HasUnit2_4010(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connector_HasUnit1_4015(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Connector_HasPoint_4008(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getControlTable_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getTerminal_2001OutgoingLinks(
			View view) {
		Terminal modelElement = (Terminal) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Track_HasSignal_4006(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Track_HasTrackDirection_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Terminal_HasTerminalSignal_4017(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Track_HasSignals_4018(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getCrossing_2006OutgoingLinks(
			View view) {
		Crossing modelElement = (Crossing) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Crossing_HasC3_Crossing_4009(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Crossing_HasC4_Crossing_4014(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4012(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Crossing_HasCrossingDirection_4002(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getConnector_2004OutgoingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_HasUnit2_4010(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_HasUnit1_4015(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Connector_HasPoint_4008(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getSignal_2003OutgoingLinks(
			View view) {
		Signal modelElement = (Signal) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedAtConnector_4016(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedOnTrack_4005(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_ControlsRoutes_4019(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedAt_4007(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_HasDirection_4020(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getPoint_2005OutgoingLinks(
			View view) {
		Point modelElement = (Point) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4011(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Point_HasC3_Point_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Point_HasPointDirection_4004(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4012(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getControlTable_2002OutgoingLinks(
			View view) {
		ControlTable modelElement = (ControlTable) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_ControlTable_HasRoutes_4013(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Connector_HasUnit1_4015(
			Unit target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getConnector_HasUnit1()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.ConnectorHasUnit1_4015,
						ConnectorHasUnit1EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Signal_PlacedAt_4007(
			Track target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getSignal_PlacedAt()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.SignalPlacedAt_4007,
						SignalPlacedAtEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Terminal_HasTerminalSignal_4017(
			Signal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getTerminal_HasTerminalSignal()) {
				result.add(new BjoernerCompleteLinkDescriptor(
						setting.getEObject(),
						target,
						BjoernerCompleteElementTypes.TerminalHasTerminalSignal_4017,
						TerminalHasTerminalSignalEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Crossing_HasC3_Crossing_4009(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getCrossing_HasC3_Crossing()) {
				result.add(new BjoernerCompleteLinkDescriptor(
						setting.getEObject(),
						target,
						BjoernerCompleteElementTypes.CrossingHasC3_Crossing_4009,
						CrossingHasC3_CrossingEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Unit_HasC2_4012(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getUnit_HasC2()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.UnitHasC2_4012,
						UnitHasC2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Crossing_HasC4_Crossing_4014(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getCrossing_HasC4_Crossing()) {
				result.add(new BjoernerCompleteLinkDescriptor(
						setting.getEObject(),
						target,
						BjoernerCompleteElementTypes.CrossingHasC4_Crossing_4014,
						CrossingHasC4_CrossingEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Connector_HasUnit2_4010(
			Unit target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getConnector_HasUnit2()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.ConnectorHasUnit2_4010,
						ConnectorHasUnit2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Signal_PlacedOnTrack_4005(
			Track target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getSignal_PlacedOnTrack()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.SignalPlacedOnTrack_4005,
						SignalPlacedOnTrackEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Track_HasSignals_4018(
			Signal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getTrack_HasSignals()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.TrackHasSignals_4018,
						TrackHasSignalsEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Point_HasC3_Point_4001(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getPoint_HasC3_Point()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.PointHasC3_Point_4001,
						PointHasC3_PointEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Signal_PlacedAtConnector_4016(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getSignal_PlacedAtConnector()) {
				result.add(new BjoernerCompleteLinkDescriptor(
						setting.getEObject(),
						target,
						BjoernerCompleteElementTypes.SignalPlacedAtConnector_4016,
						SignalPlacedAtConnectorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Connector_HasPoint_4008(
			Point target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getConnector_HasPoint()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.ConnectorHasPoint_4008,
						ConnectorHasPointEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Unit_HasC1_4011(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getUnit_HasC1()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.UnitHasC1_4011,
						UnitHasC1EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Track_HasSignal_4006(
			Signal target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getTrack_HasSignal()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.TrackHasSignal_4006,
						TrackHasSignalEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connector_HasUnit1_4015(
			Connector source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Unit destination = source.getHasUnit1();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.ConnectorHasUnit1_4015,
				ConnectorHasUnit1EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_ControlTable_HasRoutes_4013(
			ControlTable source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		for (Iterator<?> destinations = source.getHasRoutes().iterator(); destinations
				.hasNext();) {
			Route destination = (Route) destinations.next();
			result.add(new BjoernerCompleteLinkDescriptor(source, destination,
					BjoernerCompleteElementTypes.ControlTableHasRoutes_4013,
					ControlTableHasRoutesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Signal_PlacedAt_4007(
			Signal source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Track destination = source.getPlacedAt();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.SignalPlacedAt_4007,
				SignalPlacedAtEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Terminal_HasTerminalSignal_4017(
			Terminal source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Signal destination = source.getHasTerminalSignal();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.TerminalHasTerminalSignal_4017,
				TerminalHasTerminalSignalEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Crossing_HasC3_Crossing_4009(
			Crossing source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getHasC3_Crossing();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.CrossingHasC3_Crossing_4009,
				CrossingHasC3_CrossingEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Crossing_HasCrossingDirection_4002(
			Crossing source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		for (Iterator<?> destinations = source.getHasCrossingDirection()
				.iterator(); destinations.hasNext();) {
			Direction destination = (Direction) destinations.next();
			result.add(new BjoernerCompleteLinkDescriptor(
					source,
					destination,
					BjoernerCompleteElementTypes.CrossingHasCrossingDirection_4002,
					CrossingHasCrossingDirectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Unit_HasC2_4012(
			Unit source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getHasC2();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.UnitHasC2_4012,
				UnitHasC2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Crossing_HasC4_Crossing_4014(
			Crossing source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getHasC4_Crossing();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.CrossingHasC4_Crossing_4014,
				CrossingHasC4_CrossingEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Signal_ControlsRoutes_4019(
			Signal source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		for (Iterator<?> destinations = source.getControlsRoutes().iterator(); destinations
				.hasNext();) {
			Route destination = (Route) destinations.next();
			result.add(new BjoernerCompleteLinkDescriptor(source, destination,
					BjoernerCompleteElementTypes.SignalControlsRoutes_4019,
					SignalControlsRoutesEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connector_HasUnit2_4010(
			Connector source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Unit destination = source.getHasUnit2();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.ConnectorHasUnit2_4010,
				ConnectorHasUnit2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Point_HasPointDirection_4004(
			Point source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		for (Iterator<?> destinations = source.getHasPointDirection()
				.iterator(); destinations.hasNext();) {
			Direction destination = (Direction) destinations.next();
			result.add(new BjoernerCompleteLinkDescriptor(source, destination,
					BjoernerCompleteElementTypes.PointHasPointDirection_4004,
					PointHasPointDirectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Signal_PlacedOnTrack_4005(
			Signal source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Track destination = source.getPlacedOnTrack();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.SignalPlacedOnTrack_4005,
				SignalPlacedOnTrackEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Track_HasSignals_4018(
			Track source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		for (Iterator<?> destinations = source.getHasSignals().iterator(); destinations
				.hasNext();) {
			Signal destination = (Signal) destinations.next();
			result.add(new BjoernerCompleteLinkDescriptor(source, destination,
					BjoernerCompleteElementTypes.TrackHasSignals_4018,
					TrackHasSignalsEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Track_HasTrackDirection_4003(
			Track source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		for (Iterator<?> destinations = source.getHasTrackDirection()
				.iterator(); destinations.hasNext();) {
			Direction destination = (Direction) destinations.next();
			result.add(new BjoernerCompleteLinkDescriptor(source, destination,
					BjoernerCompleteElementTypes.TrackHasTrackDirection_4003,
					TrackHasTrackDirectionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Point_HasC3_Point_4001(
			Point source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getHasC3_Point();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.PointHasC3_Point_4001,
				PointHasC3_PointEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Signal_PlacedAtConnector_4016(
			Signal source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getPlacedAtConnector();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.SignalPlacedAtConnector_4016,
				SignalPlacedAtConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Connector_HasPoint_4008(
			Connector source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		for (Iterator<?> destinations = source.getHasPoint().iterator(); destinations
				.hasNext();) {
			Point destination = (Point) destinations.next();
			result.add(new BjoernerCompleteLinkDescriptor(source, destination,
					BjoernerCompleteElementTypes.ConnectorHasPoint_4008,
					ConnectorHasPointEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Unit_HasC1_4011(
			Unit source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getHasC1();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.UnitHasC1_4011,
				UnitHasC1EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Track_HasSignal_4006(
			Track source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		for (Iterator<?> destinations = source.getHasSignal().iterator(); destinations
				.hasNext();) {
			Signal destination = (Signal) destinations.next();
			result.add(new BjoernerCompleteLinkDescriptor(source, destination,
					BjoernerCompleteElementTypes.TrackHasSignal_4006,
					TrackHasSignalEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Signal_HasDirection_4020(
			Signal source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Direction destination = source.getHasDirection();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.SignalHasDirection_4020,
				SignalHasDirectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		 * @generated
		 */
		@Override
		public List<BjoernerCompleteNodeDescriptor> getSemanticChildren(
				View view) {
			return BjoernerCompleteDiagramUpdater.getSemanticChildren(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<BjoernerCompleteLinkDescriptor> getContainedLinks(View view) {
			return BjoernerCompleteDiagramUpdater.getContainedLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<BjoernerCompleteLinkDescriptor> getIncomingLinks(View view) {
			return BjoernerCompleteDiagramUpdater.getIncomingLinks(view);
		}

		/**
		 * @generated
		 */
		@Override
		public List<BjoernerCompleteLinkDescriptor> getOutgoingLinks(View view) {
			return BjoernerCompleteDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
