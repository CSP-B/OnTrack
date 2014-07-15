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
import bjoernercomplete.diagram.edit.parts.ConnectorIDEditPart;
import bjoernercomplete.diagram.edit.parts.CrossingNameEditPart;
import bjoernercomplete.diagram.edit.parts.PointNameEditPart;
import bjoernercomplete.diagram.edit.parts.SignalNameEditPart;
import bjoernercomplete.diagram.edit.parts.TerminalNameEditPart;
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
	private IParser terminalName_5001Parser;

	/**
	 * @generated
	 */
	private IParser getTerminalName_5001Parser() {
		if (terminalName_5001Parser == null) {
			EAttribute[] features = new EAttribute[] { BjoernercompletePackage.eINSTANCE
					.getUnit_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			terminalName_5001Parser = parser;
		}
		return terminalName_5001Parser;
	}

	/**
	 * @generated
	 */
	private IParser crossingName_5002Parser;

	/**
	 * @generated
	 */
	private IParser getCrossingName_5002Parser() {
		if (crossingName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] { BjoernercompletePackage.eINSTANCE
					.getUnit_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			crossingName_5002Parser = parser;
		}
		return crossingName_5002Parser;
	}

	/**
	 * @generated
	 */
	private IParser connectorID_5003Parser;

	/**
	 * @generated
	 */
	private IParser getConnectorID_5003Parser() {
		if (connectorID_5003Parser == null) {
			EAttribute[] features = new EAttribute[] { BjoernercompletePackage.eINSTANCE
					.getConnector_ID() };
			MessageFormatParser parser = new MessageFormatParser(features);
			connectorID_5003Parser = parser;
		}
		return connectorID_5003Parser;
	}

	/**
	 * @generated
	 */
	private IParser signalName_5004Parser;

	/**
	 * @generated
	 */
	private IParser getSignalName_5004Parser() {
		if (signalName_5004Parser == null) {
			EAttribute[] features = new EAttribute[] { BjoernercompletePackage.eINSTANCE
					.getSignal_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			signalName_5004Parser = parser;
		}
		return signalName_5004Parser;
	}

	/**
	 * @generated
	 */
	private IParser pointName_5005Parser;

	/**
	 * @generated
	 */
	private IParser getPointName_5005Parser() {
		if (pointName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] { BjoernercompletePackage.eINSTANCE
					.getUnit_Name() };
			MessageFormatParser parser = new MessageFormatParser(features);
			pointName_5005Parser = parser;
		}
		return pointName_5005Parser;
	}

	/**
	 * @generated
	 */
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case TerminalNameEditPart.VISUAL_ID:
			return getTerminalName_5001Parser();
		case CrossingNameEditPart.VISUAL_ID:
			return getCrossingName_5002Parser();
		case ConnectorIDEditPart.VISUAL_ID:
			return getConnectorID_5003Parser();
		case SignalNameEditPart.VISUAL_ID:
			return getSignalName_5004Parser();
		case PointNameEditPart.VISUAL_ID:
			return getPointName_5005Parser();
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
