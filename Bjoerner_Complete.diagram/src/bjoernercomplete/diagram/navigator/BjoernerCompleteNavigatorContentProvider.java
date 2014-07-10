package bjoernercomplete.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

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
import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;
import bjoernercomplete.diagram.part.Messages;

/**
 * @generated
 */
public class BjoernerCompleteNavigatorContentProvider implements
		ICommonContentProvider {

	/**
	 * @generated
	 */
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	 * @generated
	 */
	private Viewer myViewer;

	/**
	 * @generated
	 */
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	 * @generated
	 */
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	 * @generated
	 */
	private Runnable myViewerRefreshRunnable;

	/**
	 * @generated
	 */
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public BjoernerCompleteNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE
				.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain,
				new WorkspaceSynchronizer.Delegate() {
					public void dispose() {
					}

					public boolean handleResourceChanged(final Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceDeleted(Resource resource) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}

					public boolean handleResourceMoved(Resource resource,
							final URI newURI) {
						unloadAllResources();
						asyncRefresh();
						return true;
					}
				});
	}

	/**
	 * @generated
	 */
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	 * @generated
	 */
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	 * @generated
	 */
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet()
				.getResources()) {
			nextResource.unload();
		}
	}

	/**
	 * @generated
	 */
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay()
					.asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	 * @generated
	 */
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
	}

	/**
	 * @generated
	 */
	public void restoreState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void saveState(IMemento aMemento) {
	}

	/**
	 * @generated
	 */
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	 * @generated
	 */
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath()
					.toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(
					fileURI, true);
			ArrayList<BjoernerCompleteNavigatorItem> result = new ArrayList<BjoernerCompleteNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource
					.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, RailDiagramEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof BjoernerCompleteNavigatorGroup) {
			BjoernerCompleteNavigatorGroup group = (BjoernerCompleteNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof BjoernerCompleteNavigatorItem) {
			BjoernerCompleteNavigatorItem navigatorItem = (BjoernerCompleteNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (BjoernerCompleteVisualIDRegistry.getVisualID(view)) {

		case ConnectorEditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			BjoernerCompleteNavigatorGroup incominglinks = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_Connector_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(UnitHasC1EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(UnitHasC2EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(SignalPlacedAtConnectorEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(PointHasC3EditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case UnitHasC2EditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			BjoernerCompleteNavigatorGroup target = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_UnitHasC2_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BjoernerCompleteNavigatorGroup source = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_UnitHasC2_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(ConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(LinearEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(PointEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SignalPlacedOnLinearEditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			BjoernerCompleteNavigatorGroup target = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_SignalPlacedOnLinear_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BjoernerCompleteNavigatorGroup source = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_SignalPlacedOnLinear_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(LinearEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(SignalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case LinearEditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			BjoernerCompleteNavigatorGroup incominglinks = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_Linear_2002_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BjoernerCompleteNavigatorGroup outgoinglinks = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_Linear_2002_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(SignalPlacedOnLinearEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews,
					incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(UnitHasC1EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(UnitHasC2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case PointHasC3EditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			BjoernerCompleteNavigatorGroup target = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_PointHasC3_4005_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BjoernerCompleteNavigatorGroup source = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_PointHasC3_4005_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(ConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(PointEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case SignalPlacedAtConnectorEditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			BjoernerCompleteNavigatorGroup target = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_SignalPlacedAtConnector_4004_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BjoernerCompleteNavigatorGroup source = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_SignalPlacedAtConnector_4004_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(ConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(SignalEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}

		case PointEditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			BjoernerCompleteNavigatorGroup outgoinglinks = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_Point_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(UnitHasC1EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(UnitHasC2EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(PointHasC3EditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case RailDiagramEditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Diagram sv = (Diagram) view;
			BjoernerCompleteNavigatorGroup links = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_RailDiagram_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(ConnectorEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(LinearEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(SignalEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(PointEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(ControlTableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement,
					false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(SignalPlacedOnLinearEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(UnitHasC1EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(UnitHasC2EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(SignalPlacedAtConnectorEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(PointHasC3EditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case SignalEditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Node sv = (Node) view;
			BjoernerCompleteNavigatorGroup outgoinglinks = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_Signal_2003_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(SignalPlacedOnLinearEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(SignalPlacedAtConnectorEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews,
					outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case UnitHasC1EditPart.VISUAL_ID: {
			LinkedList<BjoernerCompleteAbstractNavigatorItem> result = new LinkedList<BjoernerCompleteAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			BjoernerCompleteNavigatorGroup target = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_UnitHasC1_4002_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			BjoernerCompleteNavigatorGroup source = new BjoernerCompleteNavigatorGroup(
					Messages.NavigatorGroupName_UnitHasC1_4002_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(ConnectorEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(LinearEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					BjoernerCompleteVisualIDRegistry
							.getType(PointEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source,
					true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksSourceByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType())
					&& isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges,
			String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType())
					&& isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(
			Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(
			Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views,
			String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return RailDiagramEditPart.MODEL_ID
				.equals(BjoernerCompleteVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<BjoernerCompleteNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<BjoernerCompleteNavigatorItem> result = new ArrayList<BjoernerCompleteNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new BjoernerCompleteNavigatorItem(nextView, parent,
					isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	public Object getParent(Object element) {
		if (element instanceof BjoernerCompleteAbstractNavigatorItem) {
			BjoernerCompleteAbstractNavigatorItem abstractNavigatorItem = (BjoernerCompleteAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
