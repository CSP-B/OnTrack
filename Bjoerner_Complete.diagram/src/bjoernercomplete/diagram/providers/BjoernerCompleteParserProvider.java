package bjoernercomplete.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

import bjoernercomplete.BjoernercompletePackage;
import bjoernercomplete.diagram.edit.parts.LinearNameEditPart;
import bjoernercomplete.diagram.edit.parts.PointNameEditPart;
import bjoernercomplete.diagram.edit.parts.SignalNameEditPart;
import bjoernercomplete.diagram.parsers.MessageFormatParser;
import bjoernercomplete.diagram.part.BjoernerCompleteVisualIDRegistry;

/**
 * @generated
 */
public class BjoernerCompleteParserProvider extends AbstractProvider implements
		IParserProvider {

	/**
	 * @generated
	 */
	private IParser linearName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getLinearName_5001Parser() {
		if (linearName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { BjoernercompletePackage.eINSTANCE
					.getUnit_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			linearName_5001Parser = parser;
		}
		return linearName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser signalName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getSignalName_5002Parser() {
		if (signalName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { BjoernercompletePackage.eINSTANCE
					.getSignal_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			signalName_5002Parser = parser;
		}
		return signalName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser pointName_5003Parser;

	/**
	 * @generated
	 */
	private IParser getPointName_5003Parser() {
		if (pointName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { BjoernercompletePackage.eINSTANCE
					.getUnit_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pointName_5003Parser = parser;
		}
		return pointName_5003Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case LinearNameEditPart.VISUAL_ID:
			return getLinearName_5001Parser();
		case SignalNameEditPart.VISUAL_ID:
			return getSignalName_5002Parser();
		case PointNameEditPart.VISUAL_ID:
			return getPointName_5003Parser();
		}
		return null;
	}

	/**
	 * Utility method that consults ParserService
	 * @generated
	 */
	public static IParser getParser(IElementType type, EObject object,
			String parserHint) {
		return ParserService.getInstance().getParser(
				new HintAdapter(type, object, parserHint));
	}

	/**
	 * @generated
	 */
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(BjoernerCompleteVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(BjoernerCompleteVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	 * @generated
	 */
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (BjoernerCompleteElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static class HintAdapter extends ParserHintAdapter {

		/**
		 * @generated
		 */
		private final IElementType elementType;

		/**
		 * @generated
		 */
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		 * @generated
		 */
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
