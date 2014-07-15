package bjoernercomplete.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.Connector;
import bjoernercomplete.RailDiagram;
import bjoernercomplete.diagram.edit.parts.ConnectorEditPart;
import bjoernercomplete.diagram.edit.parts.ConnectorIDEditPart;
import bjoernercomplete.diagram.edit.parts.ControlTableEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingNameEditPart;
import bjoernercomplete.diagram.edit.parts.PointEditPart;
import bjoernercomplete.diagram.edit.parts.PointNameEditPart;
import bjoernercomplete.diagram.edit.parts.RailDiagramEditPart;
import bjoernercomplete.diagram.edit.parts.SignalEditPart;
import bjoernercomplete.diagram.edit.parts.SignalNameEditPart;
import bjoernercomplete.diagram.edit.parts.TerminalEditPart;
import bjoernercomplete.diagram.edit.parts.TerminalNameEditPart;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class BjoernerCompleteVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = "Bjoerner_Complete.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (RailDiagramEditPart.MODEL_ID.equals(view.getType())) {
				return RailDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
				.getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(
					Platform.getDebugOption(DEBUG_KEY))) {
				BjoernerCompleteDiagramEditorPlugin.getInstance().logError(
						"Unable to parse view type as a visualID number: "
								+ type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (BjoernercompletePackage.eINSTANCE.getRailDiagram().isSuperTypeOf(
				domainElement.eClass())
				&& isDiagram((RailDiagram) domainElement)) {
			return RailDiagramEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
				.getModelID(containerView);
		if (!RailDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (RailDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RailDiagramEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case RailDiagramEditPart.VISUAL_ID:
			if (BjoernercompletePackage.eINSTANCE.getTerminal().isSuperTypeOf(
					domainElement.eClass())) {
				return TerminalEditPart.VISUAL_ID;
			}
			if (BjoernercompletePackage.eINSTANCE.getCrossing().isSuperTypeOf(
					domainElement.eClass())) {
				return CrossingEditPart.VISUAL_ID;
			}
			if (BjoernercompletePackage.eINSTANCE.getConnector().isSuperTypeOf(
					domainElement.eClass())) {
				return ConnectorEditPart.VISUAL_ID;
			}
			if (BjoernercompletePackage.eINSTANCE.getSignal().isSuperTypeOf(
					domainElement.eClass())) {
				return SignalEditPart.VISUAL_ID;
			}
			if (BjoernercompletePackage.eINSTANCE.getPoint().isSuperTypeOf(
					domainElement.eClass())) {
				return PointEditPart.VISUAL_ID;
			}
			if (BjoernercompletePackage.eINSTANCE.getControlTable()
					.isSuperTypeOf(domainElement.eClass())) {
				return ControlTableEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
				.getModelID(containerView);
		if (!RailDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (RailDiagramEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
					.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = RailDiagramEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case RailDiagramEditPart.VISUAL_ID:
			if (TerminalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CrossingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConnectorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SignalEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PointEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlTableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case TerminalEditPart.VISUAL_ID:
			if (TerminalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CrossingEditPart.VISUAL_ID:
			if (CrossingNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConnectorEditPart.VISUAL_ID:
			if (ConnectorIDEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SignalEditPart.VISUAL_ID:
			if (SignalNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PointEditPart.VISUAL_ID:
			if (PointNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(RailDiagram element) {
		return true;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView,
			EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case RailDiagramEditPart.VISUAL_ID:
			return false;
		case TerminalEditPart.VISUAL_ID:
		case ControlTableEditPart.VISUAL_ID:
		case SignalEditPart.VISUAL_ID:
		case ConnectorEditPart.VISUAL_ID:
		case PointEditPart.VISUAL_ID:
		case CrossingEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		 * @generated
		 */
		@Override
		public int getVisualID(View view) {
			return bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
					.getVisualID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public String getModelID(View view) {
			return bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
					.getModelID(view);
		}

		/**
		 * @generated
		 */
		@Override
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
					.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean checkNodeVisualID(View containerView,
				EObject domainElement, int candidate) {
			return bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
					.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isCompartmentVisualID(int visualID) {
			return bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
					.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		@Override
		public boolean isSemanticLeafVisualID(int visualID) {
			return bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry
					.isSemanticLeafVisualID(visualID);
		}
	};

}
