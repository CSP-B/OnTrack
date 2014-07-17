package bjoernercomplete.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

import bjoernercomplete.BjoernercompletePackage;
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
import bjoernercomplete.diagram.part.BjoernerCompleteDiagramEditorPlugin;

/**
 * @generated
 */
public class BjoernerCompleteElementTypes {

	/**
	 * @generated
	 */
	private BjoernerCompleteElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			BjoernerCompleteDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType RailDiagram_1000 = getElementType("Bjoerner_Complete.diagram.RailDiagram_1000"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Terminal_2001 = getElementType("Bjoerner_Complete.diagram.Terminal_2001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Crossing_2006 = getElementType("Bjoerner_Complete.diagram.Crossing_2006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Connector_2004 = getElementType("Bjoerner_Complete.diagram.Connector_2004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Signal_2003 = getElementType("Bjoerner_Complete.diagram.Signal_2003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType Point_2005 = getElementType("Bjoerner_Complete.diagram.Point_2005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ControlTable_2002 = getElementType("Bjoerner_Complete.diagram.ControlTable_2002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectorHasUnit1_4015 = getElementType("Bjoerner_Complete.diagram.ConnectorHasUnit1_4015"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ControlTableHasRoutes_4013 = getElementType("Bjoerner_Complete.diagram.ControlTableHasRoutes_4013"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SignalPlacedAt_4007 = getElementType("Bjoerner_Complete.diagram.SignalPlacedAt_4007"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TerminalHasTerminalSignal_4017 = getElementType("Bjoerner_Complete.diagram.TerminalHasTerminalSignal_4017"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CrossingHasC3_Crossing_4009 = getElementType("Bjoerner_Complete.diagram.CrossingHasC3_Crossing_4009"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CrossingHasCrossingDirection_4002 = getElementType("Bjoerner_Complete.diagram.CrossingHasCrossingDirection_4002"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitHasC2_4012 = getElementType("Bjoerner_Complete.diagram.UnitHasC2_4012"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType CrossingHasC4_Crossing_4014 = getElementType("Bjoerner_Complete.diagram.CrossingHasC4_Crossing_4014"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SignalControlsRoutes_4019 = getElementType("Bjoerner_Complete.diagram.SignalControlsRoutes_4019"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectorHasUnit2_4010 = getElementType("Bjoerner_Complete.diagram.ConnectorHasUnit2_4010"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PointHasPointDirection_4004 = getElementType("Bjoerner_Complete.diagram.PointHasPointDirection_4004"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SignalPlacedOnTrack_4005 = getElementType("Bjoerner_Complete.diagram.SignalPlacedOnTrack_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TrackHasSignals_4018 = getElementType("Bjoerner_Complete.diagram.TrackHasSignals_4018"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TrackHasTrackDirection_4003 = getElementType("Bjoerner_Complete.diagram.TrackHasTrackDirection_4003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType PointHasC3_Point_4001 = getElementType("Bjoerner_Complete.diagram.PointHasC3_Point_4001"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SignalPlacedAtConnector_4016 = getElementType("Bjoerner_Complete.diagram.SignalPlacedAtConnector_4016"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType ConnectorHasPoint_4008 = getElementType("Bjoerner_Complete.diagram.ConnectorHasPoint_4008"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType UnitHasC1_4011 = getElementType("Bjoerner_Complete.diagram.UnitHasC1_4011"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType TrackHasSignal_4006 = getElementType("Bjoerner_Complete.diagram.TrackHasSignal_4006"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static final IElementType SignalHasDirection_4020 = getElementType("Bjoerner_Complete.diagram.SignalHasDirection_4020"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(RailDiagram_1000,
					BjoernercompletePackage.eINSTANCE.getRailDiagram());

			elements.put(Connector_2004,
					BjoernercompletePackage.eINSTANCE.getConnector());

			elements.put(Terminal_2001,
					BjoernercompletePackage.eINSTANCE.getTerminal());

			elements.put(Crossing_2006,
					BjoernercompletePackage.eINSTANCE.getCrossing());

			elements.put(ControlTable_2002,
					BjoernercompletePackage.eINSTANCE.getControlTable());

			elements.put(Signal_2003,
					BjoernercompletePackage.eINSTANCE.getSignal());

			elements.put(Point_2005,
					BjoernercompletePackage.eINSTANCE.getPoint());

			elements.put(SignalPlacedAtConnector_4016,
					BjoernercompletePackage.eINSTANCE
							.getSignal_PlacedAtConnector());

			elements.put(TrackHasSignal_4006,
					BjoernercompletePackage.eINSTANCE.getTrack_HasSignal());

			elements.put(SignalPlacedOnTrack_4005,
					BjoernercompletePackage.eINSTANCE.getSignal_PlacedOnTrack());

			elements.put(UnitHasC1_4011,
					BjoernercompletePackage.eINSTANCE.getUnit_HasC1());

			elements.put(TrackHasTrackDirection_4003,
					BjoernercompletePackage.eINSTANCE
							.getTrack_HasTrackDirection());

			elements.put(PointHasC3_Point_4001,
					BjoernercompletePackage.eINSTANCE.getPoint_HasC3_Point());

			elements.put(SignalControlsRoutes_4019,
					BjoernercompletePackage.eINSTANCE
							.getSignal_ControlsRoutes());

			elements.put(SignalPlacedAt_4007,
					BjoernercompletePackage.eINSTANCE.getSignal_PlacedAt());

			elements.put(ControlTableHasRoutes_4013,
					BjoernercompletePackage.eINSTANCE
							.getControlTable_HasRoutes());

			elements.put(ConnectorHasUnit2_4010,
					BjoernercompletePackage.eINSTANCE.getConnector_HasUnit2());

			elements.put(CrossingHasC3_Crossing_4009,
					BjoernercompletePackage.eINSTANCE
							.getCrossing_HasC3_Crossing());

			elements.put(PointHasPointDirection_4004,
					BjoernercompletePackage.eINSTANCE
							.getPoint_HasPointDirection());

			elements.put(ConnectorHasUnit1_4015,
					BjoernercompletePackage.eINSTANCE.getConnector_HasUnit1());

			elements.put(TerminalHasTerminalSignal_4017,
					BjoernercompletePackage.eINSTANCE
							.getTerminal_HasTerminalSignal());

			elements.put(TrackHasSignals_4018,
					BjoernercompletePackage.eINSTANCE.getTrack_HasSignals());

			elements.put(CrossingHasC4_Crossing_4014,
					BjoernercompletePackage.eINSTANCE
							.getCrossing_HasC4_Crossing());

			elements.put(SignalHasDirection_4020,
					BjoernercompletePackage.eINSTANCE.getSignal_HasDirection());

			elements.put(UnitHasC2_4012,
					BjoernercompletePackage.eINSTANCE.getUnit_HasC2());

			elements.put(ConnectorHasPoint_4008,
					BjoernercompletePackage.eINSTANCE.getConnector_HasPoint());

			elements.put(CrossingHasCrossingDirection_4002,
					BjoernercompletePackage.eINSTANCE
							.getCrossing_HasCrossingDirection());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(RailDiagram_1000);
			KNOWN_ELEMENT_TYPES.add(Connector_2004);
			KNOWN_ELEMENT_TYPES.add(Terminal_2001);
			KNOWN_ELEMENT_TYPES.add(Crossing_2006);
			KNOWN_ELEMENT_TYPES.add(ControlTable_2002);
			KNOWN_ELEMENT_TYPES.add(Signal_2003);
			KNOWN_ELEMENT_TYPES.add(Point_2005);
			KNOWN_ELEMENT_TYPES.add(SignalPlacedAtConnector_4016);
			KNOWN_ELEMENT_TYPES.add(TrackHasSignal_4006);
			KNOWN_ELEMENT_TYPES.add(SignalPlacedOnTrack_4005);
			KNOWN_ELEMENT_TYPES.add(UnitHasC1_4011);
			KNOWN_ELEMENT_TYPES.add(TrackHasTrackDirection_4003);
			KNOWN_ELEMENT_TYPES.add(PointHasC3_Point_4001);
			KNOWN_ELEMENT_TYPES.add(SignalControlsRoutes_4019);
			KNOWN_ELEMENT_TYPES.add(SignalPlacedAt_4007);
			KNOWN_ELEMENT_TYPES.add(ControlTableHasRoutes_4013);
			KNOWN_ELEMENT_TYPES.add(ConnectorHasUnit2_4010);
			KNOWN_ELEMENT_TYPES.add(CrossingHasC3_Crossing_4009);
			KNOWN_ELEMENT_TYPES.add(PointHasPointDirection_4004);
			KNOWN_ELEMENT_TYPES.add(ConnectorHasUnit1_4015);
			KNOWN_ELEMENT_TYPES.add(TerminalHasTerminalSignal_4017);
			KNOWN_ELEMENT_TYPES.add(TrackHasSignals_4018);
			KNOWN_ELEMENT_TYPES.add(CrossingHasC4_Crossing_4014);
			KNOWN_ELEMENT_TYPES.add(SignalHasDirection_4020);
			KNOWN_ELEMENT_TYPES.add(UnitHasC2_4012);
			KNOWN_ELEMENT_TYPES.add(ConnectorHasPoint_4008);
			KNOWN_ELEMENT_TYPES.add(CrossingHasCrossingDirection_4002);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RailDiagramEditPart.VISUAL_ID:
			return RailDiagram_1000;
		case ConnectorEditPart.VISUAL_ID:
			return Connector_2004;
		case TerminalEditPart.VISUAL_ID:
			return Terminal_2001;
		case CrossingEditPart.VISUAL_ID:
			return Crossing_2006;
		case ControlTableEditPart.VISUAL_ID:
			return ControlTable_2002;
		case SignalEditPart.VISUAL_ID:
			return Signal_2003;
		case PointEditPart.VISUAL_ID:
			return Point_2005;
		case SignalPlacedAtConnectorEditPart.VISUAL_ID:
			return SignalPlacedAtConnector_4016;
		case TrackHasSignalEditPart.VISUAL_ID:
			return TrackHasSignal_4006;
		case SignalPlacedOnTrackEditPart.VISUAL_ID:
			return SignalPlacedOnTrack_4005;
		case UnitHasC1EditPart.VISUAL_ID:
			return UnitHasC1_4011;
		case TrackHasTrackDirectionEditPart.VISUAL_ID:
			return TrackHasTrackDirection_4003;
		case PointHasC3_PointEditPart.VISUAL_ID:
			return PointHasC3_Point_4001;
		case SignalControlsRoutesEditPart.VISUAL_ID:
			return SignalControlsRoutes_4019;
		case SignalPlacedAtEditPart.VISUAL_ID:
			return SignalPlacedAt_4007;
		case ControlTableHasRoutesEditPart.VISUAL_ID:
			return ControlTableHasRoutes_4013;
		case ConnectorHasUnit2EditPart.VISUAL_ID:
			return ConnectorHasUnit2_4010;
		case CrossingHasC3_CrossingEditPart.VISUAL_ID:
			return CrossingHasC3_Crossing_4009;
		case PointHasPointDirectionEditPart.VISUAL_ID:
			return PointHasPointDirection_4004;
		case ConnectorHasUnit1EditPart.VISUAL_ID:
			return ConnectorHasUnit1_4015;
		case TerminalHasTerminalSignalEditPart.VISUAL_ID:
			return TerminalHasTerminalSignal_4017;
		case TrackHasSignalsEditPart.VISUAL_ID:
			return TrackHasSignals_4018;
		case CrossingHasC4_CrossingEditPart.VISUAL_ID:
			return CrossingHasC4_Crossing_4014;
		case SignalHasDirectionEditPart.VISUAL_ID:
			return SignalHasDirection_4020;
		case UnitHasC2EditPart.VISUAL_ID:
			return UnitHasC2_4012;
		case ConnectorHasPointEditPart.VISUAL_ID:
			return ConnectorHasPoint_4008;
		case CrossingHasCrossingDirectionEditPart.VISUAL_ID:
			return CrossingHasCrossingDirection_4002;
		}
		return null;
	}

	/**
	 * @generated
	 */
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(
			elementTypeImages) {

		/**
		 * @generated
		 */
		@Override
		public boolean isKnownElementType(IElementType elementType) {
			return bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes
					.isKnownElementType(elementType);
		}

		/**
		 * @generated
		 */
		@Override
		public IElementType getElementTypeForVisualId(int visualID) {
			return bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes
					.getElementType(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public ENamedElement getDefiningNamedElement(
				IAdaptable elementTypeAdapter) {
			return bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes
					.getElement(elementTypeAdapter);
		}
	};

}
