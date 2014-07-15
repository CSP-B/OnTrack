package bjoernercomplete.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

import bjoernercomplete.diagram.edit.parts.ConnectorEditPart;

/**
 * @generated
 */
public class BjoernerCompleteDiagramUpdater {

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteNodeDescriptor> getSemanticChildren(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getContainedLinks(
			View view) {
		switch (BjoernerCompleteVisualIDRegistry.getVisualID(view)) {
		case ConnectorEditPart.VISUAL_ID:
			return getConnector_1000ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getIncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getOutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<BjoernerCompleteLinkDescriptor> getConnector_1000ContainedLinks(
			View view) {
		return Collections.emptyList();
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
