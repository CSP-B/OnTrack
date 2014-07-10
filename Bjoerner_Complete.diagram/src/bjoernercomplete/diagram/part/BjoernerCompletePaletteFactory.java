package bjoernercomplete.diagram.part;

import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class BjoernerCompletePaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createBjoernercomplete1Group());
	}

	/**
	 * Creates "bjoernercomplete" palette tool group
	 * @generated
	 */
	private PaletteContainer createBjoernercomplete1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(
				Messages.Bjoernercomplete1Group_title);
		paletteContainer.setId("createBjoernercomplete1Group"); //$NON-NLS-1$
		paletteContainer.add(createUnitHasC11CreationTool());
		paletteContainer.add(createUnitHasC22CreationTool());
		paletteContainer.add(createLinear3CreationTool());
		paletteContainer.add(createPoint4CreationTool());
		paletteContainer.add(createPointHasC35CreationTool());
		paletteContainer.add(createConnector6CreationTool());
		paletteContainer.add(createSignal7CreationTool());
		paletteContainer.add(createSignalPlacedOnLinear8CreationTool());
		paletteContainer.add(createSignalPlacedAtConnector9CreationTool());
		paletteContainer.add(createControlTable10CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnitHasC11CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.UnitHasC11CreationTool_title,
				Messages.UnitHasC11CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.UnitHasC1_4002));
		entry.setId("createUnitHasC11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.UnitHasC1_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnitHasC22CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.UnitHasC22CreationTool_title,
				Messages.UnitHasC22CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.UnitHasC2_4003));
		entry.setId("createUnitHasC22CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.UnitHasC2_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinear3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Linear3CreationTool_title,
				Messages.Linear3CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.Linear_2002));
		entry.setId("createLinear3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.Linear_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPoint4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Point4CreationTool_title,
				Messages.Point4CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.Point_2004));
		entry.setId("createPoint4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.Point_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPointHasC35CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.PointHasC35CreationTool_title,
				Messages.PointHasC35CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.PointHasC3_4005));
		entry.setId("createPointHasC35CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.PointHasC3_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connector6CreationTool_title,
				Messages.Connector6CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.Connector_2001));
		entry.setId("createConnector6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.Connector_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSignal7CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Signal7CreationTool_title,
				Messages.Signal7CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.Signal_2003));
		entry.setId("createSignal7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.Signal_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSignalPlacedOnLinear8CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SignalPlacedOnLinear8CreationTool_title,
				Messages.SignalPlacedOnLinear8CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.SignalPlacedOnLinear_4001));
		entry.setId("createSignalPlacedOnLinear8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.SignalPlacedOnLinear_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSignalPlacedAtConnector9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(
				Messages.SignalPlacedAtConnector9CreationTool_title,
				Messages.SignalPlacedAtConnector9CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.SignalPlacedAtConnector_4004));
		entry.setId("createSignalPlacedAtConnector9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.SignalPlacedAtConnector_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlTable10CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ControlTable10CreationTool_title,
				Messages.ControlTable10CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.ControlTable_2005));
		entry.setId("createControlTable10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.ControlTable_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description,
				List<IElementType> elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List<IElementType> relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description,
				List<IElementType> relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
