package bjoernercomplete.diagram.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;

import bjoernercomplete.diagram.edit.commands.ConnectorCreateCommand;
import bjoernercomplete.diagram.edit.commands.ControlTableCreateCommand;
import bjoernercomplete.diagram.edit.commands.CrossingCreateCommand;
import bjoernercomplete.diagram.edit.commands.PointCreateCommand;
import bjoernercomplete.diagram.edit.commands.SignalCreateCommand;
import bjoernercomplete.diagram.edit.commands.TerminalCreateCommand;
import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class RailDiagramItemSemanticEditPolicy extends
		BjoernerCompleteBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RailDiagramItemSemanticEditPolicy() {
		super(BjoernerCompleteElementTypes.RailDiagram_1000);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (BjoernerCompleteElementTypes.Terminal_2001 == req.getElementType()) {
			return getGEFWrapper(new TerminalCreateCommand(req));
		}
		if (BjoernerCompleteElementTypes.Crossing_2006 == req.getElementType()) {
			return getGEFWrapper(new CrossingCreateCommand(req));
		}
		if (BjoernerCompleteElementTypes.Connector_2004 == req.getElementType()) {
			return getGEFWrapper(new ConnectorCreateCommand(req));
		}
		if (BjoernerCompleteElementTypes.Signal_2003 == req.getElementType()) {
			return getGEFWrapper(new SignalCreateCommand(req));
		}
		if (BjoernerCompleteElementTypes.Point_2005 == req.getElementType()) {
			return getGEFWrapper(new PointCreateCommand(req));
		}
		if (BjoernerCompleteElementTypes.ControlTable_2002 == req
				.getElementType()) {
			return getGEFWrapper(new ControlTableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost())
				.getEditingDomain();
		return getGEFWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends
			DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(
				TransactionalEditingDomain editingDomain,
				DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req
					.getElementsToBeDuplicated(), req
					.getAllDuplicatedElementsMap());
		}

	}

}
