package bjoernercomplete.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import bjoernercomplete.diagram.edit.policies.TerminalHasTerminalSignalItemSemanticEditPolicy;

/**
 * @generated
 */
public class TerminalHasTerminalSignalEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4017;

	/**
	 * @generated
	 */
	public TerminalHasTerminalSignalEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new TerminalHasTerminalSignalItemSemanticEditPolicy());
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
		return new TerminalFigure();
	}

	/**
	 * @generated
	 */
	public TerminalFigure getPrimaryShape() {
		return (TerminalFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class TerminalFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureTerminalNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureTerminalLengthFigure;

		/**
		 * @generated
		 */
		public TerminalFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTerminalNameFigure = new WrappingLabel();

			fFigureTerminalNameFigure.setText("<...>");

			this.add(fFigureTerminalNameFigure);

			fFigureTerminalLengthFigure = new WrappingLabel();

			fFigureTerminalLengthFigure.setText("<...>");

			this.add(fFigureTerminalLengthFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTerminalNameFigure() {
			return fFigureTerminalNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureTerminalLengthFigure() {
			return fFigureTerminalLengthFigure;
		}

	}

}
