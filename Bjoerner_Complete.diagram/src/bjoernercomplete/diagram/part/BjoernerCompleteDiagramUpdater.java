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
import bjoernercomplete.Linear;
import bjoernercomplete.Point;
import bjoernercomplete.RailDiagram;
import bjoernercomplete.Signal;
import bjoernercomplete.Unit;
import bjoernercomplete.diagram.edit.parts.ConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.ControlTableEditPart;
import bjoernercomplete.diagram.edit.parts.LinearEditPart;
import bjoernercomplete.diagram.edit.parts.PointEditPart;
import bjoernercomplete.diagram.edit.parts.PointHasC3EditPart;
import bjoernercomplete.diagram.edit.parts.RailDiagramEditPart;
import bjoernercomplete.diagram.edit.parts.SignalEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedAtConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.SignalPlacedOnLinearEditPart;
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
			if (visualID == LinearEditPart.VISUAL_ID) {
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
		{
			ControlTable childElement = modelElement.getHasControlTable();
			int visualID = BjoernerCompleteVisualIDRegistry.getNodeVisualID(
					view, childElement);
			if (visualID == ControlTableEditPart.VISUAL_ID) {
				result.add(new BjoernerCompleteNodeDescriptor(childElement,
						visualID));
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
			return getConnector_2001ContainedLinks(view);
		case LinearEditPart.VISUAL_ID:
			return getLinear_2002ContainedLinks(view);
		case SignalEditPart.VISUAL_ID:
			return getSignal_2003ContainedLinks(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2004ContainedLinks(view);
		case ControlTableEditPart.VISUAL_ID:
			return getControlTable_2005ContainedLinks(view);
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
			return getConnector_2001IncomingLinks(view);
		case LinearEditPart.VISUAL_ID:
			return getLinear_2002IncomingLinks(view);
		case SignalEditPart.VISUAL_ID:
			return getSignal_2003IncomingLinks(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2004IncomingLinks(view);
		case ControlTableEditPart.VISUAL_ID:
			return getControlTable_2005IncomingLinks(view);
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
			return getConnector_2001OutgoingLinks(view);
		case LinearEditPart.VISUAL_ID:
			return getLinear_2002OutgoingLinks(view);
		case SignalEditPart.VISUAL_ID:
			return getSignal_2003OutgoingLinks(view);
		case PointEditPart.VISUAL_ID:
			return getPoint_2004OutgoingLinks(view);
		case ControlTableEditPart.VISUAL_ID:
			return getControlTable_2005OutgoingLinks(view);
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
	public static List<BjoernerCompleteLinkDescriptor> getConnector_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getLinear_2002ContainedLinks(
			View view) {
		Linear modelElement = (Linear) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getSignal_2003ContainedLinks(
			View view) {
		Signal modelElement = (Signal) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedOnLinear_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedAtConnector_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getPoint_2004ContainedLinks(
			View view) {
		Point modelElement = (Point) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Point_HasC3_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getControlTable_2005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getConnector_2001IncomingLinks(
			View view) {
		Connector modelElement = (Connector) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Unit_HasC1_4002(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Unit_HasC2_4003(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Signal_PlacedAtConnector_4004(
				modelElement, crossReferences));
		result.addAll(getIncomingFeatureModelFacetLinks_Point_HasC3_4005(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getLinear_2002IncomingLinks(
			View view) {
		Linear modelElement = (Linear) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_Signal_PlacedOnLinear_4001(
				modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getSignal_2003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getPoint_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getControlTable_2005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getConnector_2001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getLinear_2002OutgoingLinks(
			View view) {
		Linear modelElement = (Linear) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getSignal_2003OutgoingLinks(
			View view) {
		Signal modelElement = (Signal) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedOnLinear_4001(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Signal_PlacedAtConnector_4004(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getPoint_2004OutgoingLinks(
			View view) {
		Point modelElement = (Point) view.getElement();
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC1_4002(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Unit_HasC2_4003(modelElement));
		result.addAll(getOutgoingFeatureModelFacetLinks_Point_HasC3_4005(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getControlTable_2005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Signal_PlacedOnLinear_4001(
			Linear target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getSignal_PlacedOnLinear()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.SignalPlacedOnLinear_4001,
						SignalPlacedOnLinearEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Unit_HasC1_4002(
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
						BjoernerCompleteElementTypes.UnitHasC1_4002,
						UnitHasC1EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Unit_HasC2_4003(
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
						BjoernerCompleteElementTypes.UnitHasC2_4003,
						UnitHasC2EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Signal_PlacedAtConnector_4004(
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
						BjoernerCompleteElementTypes.SignalPlacedAtConnector_4004,
						SignalPlacedAtConnectorEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getIncomingFeatureModelFacetLinks_Point_HasC3_4005(
			Connector target,
			Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences
				.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == BjoernercompletePackage.eINSTANCE
					.getPoint_HasC3()) {
				result.add(new BjoernerCompleteLinkDescriptor(setting
						.getEObject(), target,
						BjoernerCompleteElementTypes.PointHasC3_4005,
						PointHasC3EditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Signal_PlacedOnLinear_4001(
			Signal source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Linear destination = source.getPlacedOnLinear();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.SignalPlacedOnLinear_4001,
				SignalPlacedOnLinearEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Unit_HasC1_4002(
			Unit source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getHasC1();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.UnitHasC1_4002,
				UnitHasC1EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Unit_HasC2_4003(
			Unit source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getHasC2();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.UnitHasC2_4003,
				UnitHasC2EditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Signal_PlacedAtConnector_4004(
			Signal source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getPlacedAtConnector();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.SignalPlacedAtConnector_4004,
				SignalPlacedAtConnectorEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<BjoernerCompleteLinkDescriptor> getOutgoingFeatureModelFacetLinks_Point_HasC3_4005(
			Point source) {
		LinkedList<BjoernerCompleteLinkDescriptor> result = new LinkedList<BjoernerCompleteLinkDescriptor>();
		Connector destination = source.getHasC3();
		if (destination == null) {
			return result;
		}
		result.add(new BjoernerCompleteLinkDescriptor(source, destination,
				BjoernerCompleteElementTypes.PointHasC3_4005,
				PointHasC3EditPart.VISUAL_ID));
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
