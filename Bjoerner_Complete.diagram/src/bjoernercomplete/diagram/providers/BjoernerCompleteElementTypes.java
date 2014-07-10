package bjoernercomplete.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import bjoernercomplete.BjoernercompletePackage;
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
	private static ImageRegistry imageRegistry;

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
	public static final IElementType Connector_2001 = getElementType("Bjoerner_Complete.diagram.Connector_2001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Linear_2002 = getElementType("Bjoerner_Complete.diagram.Linear_2002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Signal_2003 = getElementType("Bjoerner_Complete.diagram.Signal_2003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Point_2004 = getElementType("Bjoerner_Complete.diagram.Point_2004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ControlTable_2005 = getElementType("Bjoerner_Complete.diagram.ControlTable_2005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SignalPlacedOnLinear_4001 = getElementType("Bjoerner_Complete.diagram.SignalPlacedOnLinear_4001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitHasC1_4002 = getElementType("Bjoerner_Complete.diagram.UnitHasC1_4002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType UnitHasC2_4003 = getElementType("Bjoerner_Complete.diagram.UnitHasC2_4003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType SignalPlacedAtConnector_4004 = getElementType("Bjoerner_Complete.diagram.SignalPlacedAtConnector_4004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType PointHasC3_4005 = getElementType("Bjoerner_Complete.diagram.PointHasC3_4005"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return BjoernerCompleteDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
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

			elements.put(Connector_2001,
					BjoernercompletePackage.eINSTANCE.getConnector());

			elements.put(Linear_2002,
					BjoernercompletePackage.eINSTANCE.getLinear());

			elements.put(Signal_2003,
					BjoernercompletePackage.eINSTANCE.getSignal());

			elements.put(Point_2004,
					BjoernercompletePackage.eINSTANCE.getPoint());

			elements.put(ControlTable_2005,
					BjoernercompletePackage.eINSTANCE.getControlTable());

			elements.put(SignalPlacedOnLinear_4001,
					BjoernercompletePackage.eINSTANCE
							.getSignal_PlacedOnLinear());

			elements.put(UnitHasC1_4002,
					BjoernercompletePackage.eINSTANCE.getUnit_HasC1());

			elements.put(UnitHasC2_4003,
					BjoernercompletePackage.eINSTANCE.getUnit_HasC2());

			elements.put(SignalPlacedAtConnector_4004,
					BjoernercompletePackage.eINSTANCE
							.getSignal_PlacedAtConnector());

			elements.put(PointHasC3_4005,
					BjoernercompletePackage.eINSTANCE.getPoint_HasC3());
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
			KNOWN_ELEMENT_TYPES.add(Connector_2001);
			KNOWN_ELEMENT_TYPES.add(Linear_2002);
			KNOWN_ELEMENT_TYPES.add(Signal_2003);
			KNOWN_ELEMENT_TYPES.add(Point_2004);
			KNOWN_ELEMENT_TYPES.add(ControlTable_2005);
			KNOWN_ELEMENT_TYPES.add(SignalPlacedOnLinear_4001);
			KNOWN_ELEMENT_TYPES.add(UnitHasC1_4002);
			KNOWN_ELEMENT_TYPES.add(UnitHasC2_4003);
			KNOWN_ELEMENT_TYPES.add(SignalPlacedAtConnector_4004);
			KNOWN_ELEMENT_TYPES.add(PointHasC3_4005);
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
			return Connector_2001;
		case LinearEditPart.VISUAL_ID:
			return Linear_2002;
		case SignalEditPart.VISUAL_ID:
			return Signal_2003;
		case PointEditPart.VISUAL_ID:
			return Point_2004;
		case ControlTableEditPart.VISUAL_ID:
			return ControlTable_2005;
		case SignalPlacedOnLinearEditPart.VISUAL_ID:
			return SignalPlacedOnLinear_4001;
		case UnitHasC1EditPart.VISUAL_ID:
			return UnitHasC1_4002;
		case UnitHasC2EditPart.VISUAL_ID:
			return UnitHasC2_4003;
		case SignalPlacedAtConnectorEditPart.VISUAL_ID:
			return SignalPlacedAtConnector_4004;
		case PointHasC3EditPart.VISUAL_ID:
			return PointHasC3_4005;
		}
		return null;
	}

}
