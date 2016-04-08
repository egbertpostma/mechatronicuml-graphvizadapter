/*
 * generated by Xtext
 */
package org.muml.graphviz.dot.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.muml.graphviz.dot.DirectedDotEdge;
import org.muml.graphviz.dot.DotGraph;
import org.muml.graphviz.dot.DotNode;
import org.muml.graphviz.dot.DotPackage;
import org.muml.graphviz.dot.Setting;
import org.muml.graphviz.dot.UndirectedDotEdge;
import org.muml.graphviz.dot.xtext.services.DotLanguageGrammarAccess;

@SuppressWarnings("all")
public abstract class AbstractDotLanguageSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DotLanguageGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == DotPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case DotPackage.DIRECTED_DOT_EDGE:
				sequence_DirectedDotEdge(context, (DirectedDotEdge) semanticObject); 
				return; 
			case DotPackage.DOT_GRAPH:
				sequence_DotGraph(context, (DotGraph) semanticObject); 
				return; 
			case DotPackage.DOT_NODE:
				sequence_DotNode(context, (DotNode) semanticObject); 
				return; 
			case DotPackage.SETTING:
				sequence_Setting(context, (Setting) semanticObject); 
				return; 
			case DotPackage.UNDIRECTED_DOT_EDGE:
				sequence_UndirectedDotEdge(context, (UndirectedDotEdge) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     DotEdge returns DirectedDotEdge
	 *     DirectedDotEdge returns DirectedDotEdge
	 *
	 * Constraint:
	 *     (source=[DotNode|DotID] target=[DotNode|DotID] (settings+=Setting settings+=Setting*)?)
	 */
	protected void sequence_DirectedDotEdge(ISerializationContext context, DirectedDotEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DotGraph returns DotGraph
	 *
	 * Constraint:
	 *     (
	 *         ((directedGraph?='digraph'? id=DotID?) | id=DotID)? 
	 *         (
	 *             (subgraphs+=DotGraph | nodes+=DotNode | edges+=DotEdge)? 
	 *             (graphSettings+=Setting graphSettings+=Setting*)? 
	 *             (nodeSettings+=Setting nodeSettings+=Setting*)? 
	 *             (edgeSettings+=Setting edgeSettings+=Setting*)?
	 *         )+
	 *     )
	 */
	protected void sequence_DotGraph(ISerializationContext context, DotGraph semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     DotNode returns DotNode
	 *
	 * Constraint:
	 *     (name=DotID (settings+=Setting settings+=Setting*)?)
	 */
	protected void sequence_DotNode(ISerializationContext context, DotNode semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Setting returns Setting
	 *
	 * Constraint:
	 *     (attribute=DotID value=DotID)
	 */
	protected void sequence_Setting(ISerializationContext context, Setting semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, DotPackage.Literals.SETTING__ATTRIBUTE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.SETTING__ATTRIBUTE));
			if (transientValues.isValueTransient(semanticObject, DotPackage.Literals.SETTING__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DotPackage.Literals.SETTING__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSettingAccess().getAttributeDotIDParserRuleCall_0_0(), semanticObject.getAttribute());
		feeder.accept(grammarAccess.getSettingAccess().getValueDotIDParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     DotEdge returns UndirectedDotEdge
	 *     UndirectedDotEdge returns UndirectedDotEdge
	 *
	 * Constraint:
	 *     (source=[DotNode|DotID] target=[DotNode|DotID] (settings+=Setting settings+=Setting*)?)
	 */
	protected void sequence_UndirectedDotEdge(ISerializationContext context, UndirectedDotEdge semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}
