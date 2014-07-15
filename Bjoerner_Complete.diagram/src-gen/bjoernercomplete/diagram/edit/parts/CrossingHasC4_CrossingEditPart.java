package bjoernercomplete.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;

import bjoernercomplete.diagram.edit.policies.CrossingHasC4_CrossingItemSemanticEditPolicy;

/**
 * @generated
 */
public class CrossingHasC4_CrossingEditPart extends ConnectionNodeEditPart
		implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4014;

	/**
	 * @generated
	 */
	public CrossingHasC4_CrossingEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new CrossingHasC4_CrossingItemSemanticEditPolicy());
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
		return new CrossingFigure();
	}

	/**
	 * @generated
	 */
	public CrossingFigure getPrimaryShape() {
		return (CrossingFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class CrossingFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureCrossingNameFigure;
		/**
		 * @generated
		 */
		private WrappingLabel fFigureCrossingLengthFigure;

		/**
		 * @generated
		 */
		public CrossingFigure() {

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureCrossingNameFigure = new WrappingLabel();

			fFigureCrossingNameFigure.setText("<...>");

			this.add(fFigureCrossingNameFigure);

			fFigureCrossingLengthFigure = new WrappingLabel();

			fFigureCrossingLengthFigure.setText("<...>");

			this.add(fFigureCrossingLengthFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCrossingNameFigure() {
			return fFigureCrossingNameFigure;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureCrossingLengthFigure() {
			return fFigureCrossingLengthFigure;
		}

	}

}
