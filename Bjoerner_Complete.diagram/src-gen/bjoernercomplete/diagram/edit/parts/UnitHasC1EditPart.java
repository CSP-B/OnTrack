package bjoernercomplete.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import bjoernercomplete.diagram.edit.policies.UnitHasC1ItemSemanticEditPolicy;

/**
 * @generated
 */
public class UnitHasC1EditPart extends ConnectionNodeEditPart implements
		ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4011;

	/**
	 * @generated
	 */
	public UnitHasC1EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new UnitHasC1ItemSemanticEditPolicy());
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
		return new UnitFigure();
	}

	/**
	 * @generated
	 */
	public UnitFigure getPrimaryShape() {
		return (UnitFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class UnitFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnitNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureUnitLengthFigure;

		/**
		 * @generated
		 */
		public UnitFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureUnitNameFigure = new WrappingLabel();

			fFigureUnitNameFigure.setText("<...>");

			this.add(fFigureUnitNameFigure);

			fFigureUnitLengthFigure = new WrappingLabel();

			fFigureUnitLengthFigure.setText("<...>");

			this.add(fFigureUnitLengthFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnitNameFigure() {
			return fFigureUnitNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureUnitLengthFigure() {
			return fFigureUnitLengthFigure;
		}

	}

}
