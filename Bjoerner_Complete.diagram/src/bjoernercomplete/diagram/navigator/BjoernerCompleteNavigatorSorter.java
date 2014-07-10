package bjoernercomplete.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;

/**
 * @generated
 */
public class BjoernerCompleteNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4007;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof BjoernerCompleteNavigatorItem) {
			BjoernerCompleteNavigatorItem item = (BjoernerCompleteNavigatorItem) element;
			return BjoernerCompleteVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
