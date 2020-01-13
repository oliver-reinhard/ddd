/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.scoping;

import com.google.common.base.Objects;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.ReferenceScope;
import com.mimacom.ddd.pub.pub.scoping.AbstractPubScopeProvider;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class PubScopeProvider extends AbstractPubScopeProvider {
  private static final PubPackage PUB = PubPackage.eINSTANCE;
  
  @Override
  public IScope getScope(final EObject context, final EReference reference) {
    if ((Objects.equal(reference, PubScopeProvider.PUB.getReference_Target()) && (context instanceof Reference))) {
      EClass _switchResult = null;
      ReferenceScope _scope = ((Reference) context).getScope();
      if (_scope != null) {
        switch (_scope) {
          case DOCUMENT_SEGMENT:
            _switchResult = PubScopeProvider.PUB.getDocumentSegment();
            break;
          case DIVISION:
            _switchResult = PubScopeProvider.PUB.getDivision();
            break;
          case PART:
            _switchResult = PubScopeProvider.PUB.getPart();
            break;
          case APPENDIX:
            _switchResult = PubScopeProvider.PUB.getAppendix();
            break;
          case CHAPTER:
            _switchResult = PubScopeProvider.PUB.getChapter();
            break;
          case SECTION:
            _switchResult = PubScopeProvider.PUB.getSection();
            break;
          case SUBSECTION:
            _switchResult = PubScopeProvider.PUB.getSubsection();
            break;
          case SUBSUBSECTION:
            _switchResult = PubScopeProvider.PUB.getSubsubsection();
            break;
          case TABLE:
            _switchResult = PubScopeProvider.PUB.getTable();
            break;
          case FIGURE:
            _switchResult = PubScopeProvider.PUB.getFigure();
            break;
          case EQUATION:
            _switchResult = PubScopeProvider.PUB.getEquation();
            break;
          case CODE_LISTING:
            _switchResult = PubScopeProvider.PUB.getCodeListing();
            break;
          case ADMONITION:
            _switchResult = PubScopeProvider.PUB.getAdmonition();
            break;
          case ABBREVIATION:
            _switchResult = PubScopeProvider.PUB.getAbbreviation();
            break;
          case GLOSSARY:
            _switchResult = PubScopeProvider.PUB.getGlossaryEntry();
            break;
          case BIBLIOGRAPHY:
            _switchResult = PubScopeProvider.PUB.getBibliographyEntry();
            break;
          default:
            _switchResult = PubScopeProvider.PUB.getReferenceTarget();
            break;
        }
      } else {
        _switchResult = PubScopeProvider.PUB.getReferenceTarget();
      }
      final EClass targetScope = _switchResult;
      return this.getDefaultScopeForType(context, targetScope);
    }
    return super.getScope(context, reference);
  }
}