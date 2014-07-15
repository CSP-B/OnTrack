package bjoernercomplete.diagram.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.SemanticEditPolicy;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.ConfigureRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.GetEditContextRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.MoveRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.helpers.GeneratedEditHelperBase;

import bjoernercomplete.Connector;
import bjoernercomplete.ControlTable;
import bjoernercomplete.Crossing;
import bjoernercomplete.Direction;
import bjoernercomplete.Point;
import bjoernercomplete.Route;
import bjoernercomplete.Signal;
import bjoernercomplete.Terminal;
import bjoernercomplete.Track;
import bjoernercomplete.Unit;
import bjoernercomplete.diagram.part.BjoernerCompleteDiagramEditorPlugin;
import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;
import bjoernercomplete.diagram.providers.BjoernerCompleteElementTypes;

/**
 * @generated
 */
public class BjoernerCompleteBaseItemSemanticEditPolicy extends
		SemanticEditPolicy {

	/**
	 * Extended request data key to hold editpart visual id.
	 * @generated
	 */
	public static final String VISUAL_ID_KEY = "visual_id"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private final IElementType myElementType;

	/**
	 * @generated
	 */
	protected BjoernerCompleteBaseItemSemanticEditPolicy(
			IElementType elementType) {
		myElementType = elementType;
	}

	/**
	 * Extended request data key to hold editpart visual id.
	 * Add visual id of edited editpart to extended data of the request
	 * so command switch can decide what kind of diagram element is being edited.
	 * It is done in those cases when it's not possible to deduce diagram
	 * element kind from domain element.
	 * 
	 * @generated
	 */
	public Command getCommand(Request request) {
		if (request instanceof ReconnectRequest) {
			Object view = ((ReconnectRequest) request).getConnectionEditPart()
					.getModel();
			if (view instanceof View) {
				Integer id = new Integer(
						BjoernerCompleteVisualIDRegistry
								.getVisualID((View) view));
				request.getExtendedData().put(VISUAL_ID_KEY, id);
			}
		}
		return super.getCommand(request);
	}

	/**
	 * Returns visual id from request parameters.
	 * @generated
	 */
	protected int getVisualID(IEditCommandRequest request) {
		Object id = request.getParameter(VISUAL_ID_KEY);
		return id instanceof Integer ? ((Integer) id).intValue() : -1;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommand(IEditCommandRequest request) {
		IEditCommandRequest completedRequest = completeRequest(request);
		Command semanticCommand = getSemanticCommandSwitch(completedRequest);
		semanticCommand = getEditHelperCommand(completedRequest,
				semanticCommand);
		if (completedRequest instanceof DestroyRequest) {
			DestroyRequest destroyRequest = (DestroyRequest) completedRequest;
			return shouldProceed(destroyRequest) ? addDeleteViewCommand(
					semanticCommand, destroyRequest) : null;
		}
		return semanticCommand;
	}

	/**
	 * @generated
	 */
	protected Command addDeleteViewCommand(Command mainCommand,
			DestroyRequest completedRequest) {
		Command deleteViewCommand = getGEFWrapper(new DeleteCommand(
				getEditingDomain(), (View) getHost().getModel()));
		return mainCommand == null ? deleteViewCommand : mainCommand
				.chain(deleteViewCommand);
	}

	/**
	 * @generated
	 */
	private Command getEditHelperCommand(IEditCommandRequest request,
			Command editPolicyCommand) {
		if (editPolicyCommand != null) {
			ICommand command = editPolicyCommand instanceof ICommandProxy ? ((ICommandProxy) editPolicyCommand)
					.getICommand() : new CommandProxy(editPolicyCommand);
			request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND,
					command);
		}
		IElementType requestContextElementType = getContextElementType(request);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE,
				requestContextElementType);
		ICommand command = requestContextElementType.getEditCommand(request);
		request.setParameter(GeneratedEditHelperBase.EDIT_POLICY_COMMAND, null);
		request.setParameter(GeneratedEditHelperBase.CONTEXT_ELEMENT_TYPE, null);
		if (command != null) {
			if (!(command instanceof CompositeTransactionalCommand)) {
				command = new CompositeTransactionalCommand(getEditingDomain(),
						command.getLabel()).compose(command);
			}
			return new ICommandProxy(command);
		}
		return editPolicyCommand;
	}

	/**
	 * @generated
	 */
	private IElementType getContextElementType(IEditCommandRequest request) {
		IElementType requestContextElementType = BjoernerCompleteElementTypes
				.getElementType(getVisualID(request));
		return requestContextElementType != null ? requestContextElementType
				: myElementType;
	}

	/**
	 * @generated
	 */
	protected Command getSemanticCommandSwitch(IEditCommandRequest req) {
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		} else if (req instanceof CreateElementRequest) {
			return getCreateCommand((CreateElementRequest) req);
		} else if (req instanceof ConfigureRequest) {
			return getConfigureCommand((ConfigureRequest) req);
		} else if (req instanceof DestroyElementRequest) {
			return getDestroyElementCommand((DestroyElementRequest) req);
		} else if (req instanceof DestroyReferenceRequest) {
			return getDestroyReferenceCommand((DestroyReferenceRequest) req);
		} else if (req instanceof DuplicateElementsRequest) {
			return getDuplicateCommand((DuplicateElementsRequest) req);
		} else if (req instanceof GetEditContextRequest) {
			return getEditContextCommand((GetEditContextRequest) req);
		} else if (req instanceof MoveRequest) {
			return getMoveCommand((MoveRequest) req);
		} else if (req instanceof ReorientReferenceRelationshipRequest) {
			return getReorientReferenceRelationshipCommand((ReorientReferenceRelationshipRequest) req);
		} else if (req instanceof ReorientRelationshipRequest) {
			return getReorientRelationshipCommand((ReorientRelationshipRequest) req);
		} else if (req instanceof SetRequest) {
			return getSetCommand((SetRequest) req);
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getConfigureCommand(ConfigureRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getSetCommand(SetRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getEditContextCommand(GetEditContextRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getMoveCommand(MoveRequest req) {
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(
			ReorientReferenceRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(
			ReorientRelationshipRequest req) {
		return UnexecutableCommand.INSTANCE;
	}

	/**
	 * @generated
	 */
	protected final Command getGEFWrapper(ICommand cmd) {
		return new ICommandProxy(cmd);
	}

	/**
	 * Returns editing domain from the host edit part.
	 * @generated
	 */
	protected TransactionalEditingDomain getEditingDomain() {
		return ((IGraphicalEditPart) getHost()).getEditingDomain();
	}

	/**
	 * Clean all shortcuts to the host element from the same diagram
	 * @generated
	 */
	protected void addDestroyShortcutsCommand(ICompositeCommand cmd, View view) {
		assert view.getEAnnotation("Shortcut") == null; //$NON-NLS-1$
		for (Iterator it = view.getDiagram().getChildren().iterator(); it
				.hasNext();) {
			View nextView = (View) it.next();
			if (nextView.getEAnnotation("Shortcut") == null || !nextView.isSetElement() || nextView.getElement() != view.getElement()) { //$NON-NLS-1$
				continue;
			}
			cmd.add(new DeleteCommand(getEditingDomain(), nextView));
		}
	}

	/**
	 * @generated
	 */
	public static LinkConstraints getLinkConstraints() {
		LinkConstraints cached = BjoernerCompleteDiagramEditorPlugin
				.getInstance().getLinkConstraints();
		if (cached == null) {
			BjoernerCompleteDiagramEditorPlugin.getInstance()
					.setLinkConstraints(cached = new LinkConstraints());
		}
		return cached;
	}

	/**
	 * @generated
	 */
	public static class LinkConstraints {

		/**
		 * @generated
		 */
		LinkConstraints() {
			// use static method #getLinkConstraints() to access instance
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectorHasUnit1_4015(Connector source,
				Unit target) {
			if (source != null) {
				if (source.getHasUnit1().size() >= 2
						|| source.getHasUnit1().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getHasC1() != null)) {
				return false;
			}

			return canExistConnectorHasUnit1_4015(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateControlTableHasRoutes_4013(ControlTable source,
				Route target) {
			if (source != null) {
				if (source.getHasRoutes().contains(target)) {
					return false;
				}
			}

			return canExistControlTableHasRoutes_4013(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSignalPlacedAt_4007(Signal source, Track target) {
			if (source != null) {
				if (source.getPlacedAt() != null) {
					return false;
				}
			}

			return canExistSignalPlacedAt_4007(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTerminalHasTerminalSignal_4017(Terminal source,
				Signal target) {
			if (source != null) {
				if (source.getHasTerminalSignal() != null) {
					return false;
				}
			}

			return canExistTerminalHasTerminalSignal_4017(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCrossingHasC3_Crossing_4009(Crossing source,
				Connector target) {
			if (source != null) {
				if (source.getHasC3_Crossing() != null) {
					return false;
				}
			}

			return canExistCrossingHasC3_Crossing_4009(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCrossingHasCrossingDirection_4002(
				Crossing source, Direction target) {
			if (source != null) {
				if (source.getHasCrossingDirection().size() >= 4
						|| source.getHasCrossingDirection().contains(target)) {
					return false;
				}
			}

			return canExistCrossingHasCrossingDirection_4002(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateUnitHasC2_4012(Unit source, Connector target) {
			if (source != null) {
				if (source.getHasC2() != null) {
					return false;
				}
			}
			if (target != null
					&& (target.getHasUnit2().size() >= 2 || target
							.getHasUnit2().contains(target))) {
				return false;
			}

			return canExistUnitHasC2_4012(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateCrossingHasC4_Crossing_4014(Crossing source,
				Connector target) {
			if (source != null) {
				if (source.getHasC4_Crossing() != null) {
					return false;
				}
			}

			return canExistCrossingHasC4_Crossing_4014(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSignalControlsRoutes_4019(Signal source,
				Route target) {
			if (source != null) {
				if (source.getControlsRoutes().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getControlledBySignal() != null)) {
				return false;
			}

			return canExistSignalControlsRoutes_4019(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectorHasUnit2_4010(Connector source,
				Unit target) {
			if (source != null) {
				if (source.getHasUnit2().size() >= 2
						|| source.getHasUnit2().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getHasC2() != null)) {
				return false;
			}

			return canExistConnectorHasUnit2_4010(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePointHasPointDirection_4004(Point source,
				Direction target) {
			if (source != null) {
				if (source.getHasPointDirection().size() >= 4
						|| source.getHasPointDirection().contains(target)) {
					return false;
				}
			}

			return canExistPointHasPointDirection_4004(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSignalPlacedOnTrack_4005(Signal source,
				Track target) {
			if (source != null) {
				if (source.getPlacedOnTrack() != null) {
					return false;
				}
			}
			if (target != null
					&& (target.getHasSignals().size() >= 2 || target
							.getHasSignals().contains(target))) {
				return false;
			}

			return canExistSignalPlacedOnTrack_4005(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTrackHasSignals_4018(Track source, Signal target) {
			if (source != null) {
				if (source.getHasSignals().size() >= 2
						|| source.getHasSignals().contains(target)) {
					return false;
				}
			}
			if (target != null && (target.getPlacedOnTrack() != null)) {
				return false;
			}

			return canExistTrackHasSignals_4018(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTrackHasTrackDirection_4003(Track source,
				Direction target) {
			if (source != null) {
				if (source.getHasTrackDirection().size() >= 2
						|| source.getHasTrackDirection().contains(target)) {
					return false;
				}
			}

			return canExistTrackHasTrackDirection_4003(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreatePointHasC3_Point_4001(Point source,
				Connector target) {
			if (source != null) {
				if (source.getHasC3_Point() != null) {
					return false;
				}
			}

			return canExistPointHasC3_Point_4001(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSignalPlacedAtConnector_4016(Signal source,
				Connector target) {
			if (source != null) {
				if (source.getPlacedAtConnector() != null) {
					return false;
				}
			}

			return canExistSignalPlacedAtConnector_4016(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateConnectorHasPoint_4008(Connector source,
				Point target) {
			if (source != null) {
				if (source.getHasPoint().size() >= 2
						|| source.getHasPoint().contains(target)) {
					return false;
				}
			}

			return canExistConnectorHasPoint_4008(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateUnitHasC1_4011(Unit source, Connector target) {
			if (source != null) {
				if (source.getHasC1() != null) {
					return false;
				}
			}
			if (target != null
					&& (target.getHasUnit1().size() >= 2 || target
							.getHasUnit1().contains(target))) {
				return false;
			}

			return canExistUnitHasC1_4011(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateTrackHasSignal_4006(Track source, Signal target) {
			if (source != null) {
				if (source.getHasSignal().size() >= 2
						|| source.getHasSignal().contains(target)) {
					return false;
				}
			}

			return canExistTrackHasSignal_4006(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canCreateSignalHasDirection_4020(Signal source,
				Direction target) {
			if (source != null) {
				if (source.getHasDirection() != null) {
					return false;
				}
			}

			return canExistSignalHasDirection_4020(source, target);
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectorHasUnit1_4015(Connector source,
				Unit target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistControlTableHasRoutes_4013(ControlTable source,
				Route target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSignalPlacedAt_4007(Signal source, Track target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTerminalHasTerminalSignal_4017(Terminal source,
				Signal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCrossingHasC3_Crossing_4009(Crossing source,
				Connector target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCrossingHasCrossingDirection_4002(
				Crossing source, Direction target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistUnitHasC2_4012(Unit source, Connector target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistCrossingHasC4_Crossing_4014(Crossing source,
				Connector target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSignalControlsRoutes_4019(Signal source,
				Route target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectorHasUnit2_4010(Connector source,
				Unit target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPointHasPointDirection_4004(Point source,
				Direction target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSignalPlacedOnTrack_4005(Signal source,
				Track target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTrackHasSignals_4018(Track source, Signal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTrackHasTrackDirection_4003(Track source,
				Direction target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistPointHasC3_Point_4001(Point source,
				Connector target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSignalPlacedAtConnector_4016(Signal source,
				Connector target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistConnectorHasPoint_4008(Connector source,
				Point target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistUnitHasC1_4011(Unit source, Connector target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistTrackHasSignal_4006(Track source, Signal target) {
			return true;
		}

		/**
		 * @generated
		 */
		public boolean canExistSignalHasDirection_4020(Signal source,
				Direction target) {
			return true;
		}
	}

}
