package bjoernercomplete.diagram.providers;

import bjoernercomplete.diagram.part.BjoernerCompleteDiagramEditorPlugin;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	 * @generated
	 */
	public static ElementInitializers getInstance() {
		ElementInitializers cached = BjoernerCompleteDiagramEditorPlugin
				.getInstance().getElementInitializers();
		if (cached == null) {
			BjoernerCompleteDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
