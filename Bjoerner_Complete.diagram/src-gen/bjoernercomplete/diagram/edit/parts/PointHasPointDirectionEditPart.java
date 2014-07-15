package bjoernercomplete.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import bjoernercomplete.diagram.edit.policies.PointHasPointDirectionItemSemanticEditPolicy;

/**
 * @generated
 */
public class PointHasPointDirectionEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4004;

	/**
	 * @generated
	 */
	public PointHasPointDirectionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new PointHasPointDirectionItemSemanticEditPolicy());
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
		return new PointFigure();
	}

	/**
	 * @generated
	 */
	public PointFigure getPrimaryShape() {
		return (PointFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class PointFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigurePointNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePointLengthFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigurePointPointNameFigure;

		/**
		 * @generated
		 */
		public PointFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigurePointNameFigure = new WrappingLabel();

			fFigurePointNameFigure.setText("<...>");

			this.add(fFigurePointNameFigure);

			fFigurePointLengthFigure = new WrappingLabel();

			fFigurePointLengthFigure.setText("<...>");

			this.add(fFigurePointLengthFigure);

			fFigurePointPointNameFigure = new WrappingLabel();

			fFigurePointPointNameFigure.setText("<...>");

			this.add(fFigurePointPointNameFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePointNameFigure() {
			return fFigurePointNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePointLengthFigure() {
			return fFigurePointLengthFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigurePointPointNameFigure() {
			return fFigurePointPointNameFigure;
		}

	}

}
