package bjoernercomplete.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import bjoernercomplete.diagram.edit.policies.TrackHasSignalsItemSemanticEditPolicy;

/**
 * @generated
 */
public class TrackHasSignalsEditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4018;

	/**
	 * @generated
	 */
	public TrackHasSignalsEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TrackHasSignalsItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new TrackFigure();
	}

	/**
	 * @generated
	 */
	public TrackFigure getPrimaryShape() {
		return (TrackFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TrackFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTrackNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTrackLengthFigure;

		/**
		 * @generated
		 */
		public TrackFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTrackNameFigure = new WrappingLabel();

			fFigureTrackNameFigure.setText("<...>");

			this.add(fFigureTrackNameFigure);

			fFigureTrackLengthFigure = new WrappingLabel();

			fFigureTrackLengthFigure.setText("<...>");

			this.add(fFigureTrackLengthFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTrackNameFigure() {
			return fFigureTrackNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTrackLengthFigure() {
			return fFigureTrackLengthFigure;
		}

	}

}
