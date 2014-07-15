package bjoernercomplete.diagram.part;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;

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
		ToolEntry entry = new ToolEntry(Messages.UnitHasC11CreationTool_title,
				Messages.UnitHasC11CreationTool_desc, null, null) {
		};
		entry.setId("createUnitHasC11CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createUnitHasC22CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.UnitHasC22CreationTool_title,
				Messages.UnitHasC22CreationTool_desc, null, null) {
		};
		entry.setId("createUnitHasC22CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLinear3CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Linear3CreationTool_title,
				Messages.Linear3CreationTool_desc, null, null) {
		};
		entry.setId("createLinear3CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPoint4CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Point4CreationTool_title,
				Messages.Point4CreationTool_desc, null, null) {
		};
		entry.setId("createPoint4CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPointHasC35CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.PointHasC35CreationTool_title,
				Messages.PointHasC35CreationTool_desc, null, null) {
		};
		entry.setId("createPointHasC35CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector6CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Connector6CreationTool_title,
				Messages.Connector6CreationTool_desc, null, null) {
		};
		entry.setId("createConnector6CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSignal7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.Signal7CreationTool_title,
				Messages.Signal7CreationTool_desc, null, null) {
		};
		entry.setId("createSignal7CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSignalPlacedOnLinear8CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SignalPlacedOnLinear8CreationTool_title,
				Messages.SignalPlacedOnLinear8CreationTool_desc, null, null) {
		};
		entry.setId("createSignalPlacedOnLinear8CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSignalPlacedAtConnector9CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.SignalPlacedAtConnector9CreationTool_title,
				Messages.SignalPlacedAtConnector9CreationTool_desc, null, null) {
		};
		entry.setId("createSignalPlacedAtConnector9CreationTool"); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlTable10CreationTool() {
		ToolEntry entry = new ToolEntry(
				Messages.ControlTable10CreationTool_title,
				Messages.ControlTable10CreationTool_desc, null, null) {
		};
		entry.setId("createControlTable10CreationTool"); //$NON-NLS-1$
		return entry;
	}

}
