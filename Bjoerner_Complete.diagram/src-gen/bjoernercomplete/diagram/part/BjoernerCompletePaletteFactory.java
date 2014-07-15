package bjoernercomplete.diagram.part;

import java.util.ArrayList;
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
		paletteContainer.add(createUnit1CreationTool());
		paletteContainer.add(createTrack2CreationTool());
		paletteContainer.add(createPoint3CreationTool());
		paletteContainer.add(createConnector4CreationTool());
		paletteContainer.add(createConnectorHasUnit15CreationTool());
		paletteContainer.add(createConnectorHasPoint6CreationTool());
		paletteContainer.add(createConnectorHasUnit27CreationTool());
		paletteContainer.add(createSignal8CreationTool());
		paletteContainer.add(createControlTable9CreationTool());
		paletteContainer.add(createControlTableHasRoutes10CreationTool());
		paletteContainer.add(createCrossing11CreationTool());
		paletteContainer.add(createTerminal12CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnit1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Unit1CreationTool_title,
				Messages.Unit1CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.Terminal_2001));
		entry.setId("createUnit1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.Terminal_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTrack2CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Track2CreationTool_title,
				Messages.Track2CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.Crossing_2006));
		entry.setId("createTrack2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.Crossing_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPoint3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Point3CreationTool_title,
				Messages.Point3CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.Connector_2004));
		entry.setId("createPoint3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.Connector_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector4CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.Connector4CreationTool_title,
				Messages.Connector4CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.Signal_2003));
		entry.setId("createConnector4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.Signal_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectorHasUnit15CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConnectorHasUnit15CreationTool_title,
				Messages.ConnectorHasUnit15CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.Point_2005));
		entry.setId("createConnectorHasUnit15CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.Point_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectorHasPoint6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(
				Messages.ConnectorHasPoint6CreationTool_title,
				Messages.ConnectorHasPoint6CreationTool_desc,
				Collections
						.singletonList(BjoernerCompleteElementTypes.ControlTable_2002));
		entry.setId("createConnectorHasPoint6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.ControlTable_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnectorHasUnit27CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(BjoernerCompleteElementTypes.ConnectorHasUnit1_4015);
		types.add(BjoernerCompleteElementTypes.TrackHasSignals_4018);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ConnectorHasUnit27CreationTool_title,
				Messages.ConnectorHasUnit27CreationTool_desc, types);
		entry.setId("createConnectorHasUnit27CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.ConnectorHasUnit1_4015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSignal8CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(BjoernerCompleteElementTypes.ControlTableHasRoutes_4013);
		types.add(BjoernerCompleteElementTypes.TrackHasTrackDirection_4003);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Signal8CreationTool_title,
				Messages.Signal8CreationTool_desc, types);
		entry.setId("createSignal8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.ControlTableHasRoutes_4013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlTable9CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(BjoernerCompleteElementTypes.SignalPlacedAt_4007);
		types.add(BjoernerCompleteElementTypes.PointHasC3_Point_4001);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ControlTable9CreationTool_title,
				Messages.ControlTable9CreationTool_desc, types);
		entry.setId("createControlTable9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.SignalPlacedAt_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlTableHasRoutes10CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(BjoernerCompleteElementTypes.TerminalHasTerminalSignal_4017);
		types.add(BjoernerCompleteElementTypes.SignalPlacedAtConnector_4016);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.ControlTableHasRoutes10CreationTool_title,
				Messages.ControlTableHasRoutes10CreationTool_desc, types);
		entry.setId("createControlTableHasRoutes10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.TerminalHasTerminalSignal_4017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCrossing11CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(BjoernerCompleteElementTypes.CrossingHasC3_Crossing_4009);
		types.add(BjoernerCompleteElementTypes.ConnectorHasPoint_4008);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Crossing11CreationTool_title,
				Messages.Crossing11CreationTool_desc, types);
		entry.setId("createCrossing11CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.CrossingHasC3_Crossing_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTerminal12CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(BjoernerCompleteElementTypes.CrossingHasCrossingDirection_4002);
		types.add(BjoernerCompleteElementTypes.UnitHasC1_4011);
		LinkToolEntry entry = new LinkToolEntry(
				Messages.Terminal12CreationTool_title,
				Messages.Terminal12CreationTool_desc, types);
		entry.setId("createTerminal12CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(BjoernerCompleteElementTypes
				.getImageDescriptor(BjoernerCompleteElementTypes.CrossingHasCrossingDirection_4002));
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
