package bjoernercomplete.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.lite.svg.SVGFigure;
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
	public static final int VISUAL_ID = 4002;

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
		return new UnitHasC1Figure();
	}

	/**
	 * @generated
	 */
	public UnitHasC1Figure getPrimaryShape() {
		return (UnitHasC1Figure) getFigure();
	}

	/**
	 * @generated
	 */
	public class UnitHasC1Figure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public UnitHasC1Figure() {
			this.setLineWidth(3);
			this.setLineStyle(Graphics.LINE_DASH);
			this.setMaximumSize(new Dimension(getMapMode().DPtoLP(1),
					getMapMode().DPtoLP(3)));
			this.setSize(getMapMode().DPtoLP(2), getMapMode().DPtoLP(3));

		}

	}

}
