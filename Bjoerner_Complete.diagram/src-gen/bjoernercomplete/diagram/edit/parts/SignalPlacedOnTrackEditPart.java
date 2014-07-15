package bjoernercomplete.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import bjoernercomplete.diagram.edit.policies.SignalPlacedOnTrackItemSemanticEditPolicy;

/**
 * @generated
 */
public class SignalPlacedOnTrackEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4005;

	/**
	 * @generated
	 */
	public SignalPlacedOnTrackEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new SignalPlacedOnTrackItemSemanticEditPolicy());
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
		return new SignalFigure();
	}

	/**
	 * @generated
	 */
	public SignalFigure getPrimaryShape() {
		return (SignalFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class SignalFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureSignalNameFigure;

		/**
		 * @generated
		 */
		public SignalFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureSignalNameFigure = new WrappingLabel();

			fFigureSignalNameFigure.setText("<...>");

			this.add(fFigureSignalNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureSignalNameFigure() {
			return fFigureSignalNameFigure;
		}

	}

}
