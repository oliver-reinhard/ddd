/**
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.pub.pub.scoping;

import com.google.common.base.Objects;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.mimacom.ddd.dm.base.IDiagramRoot;
import com.mimacom.ddd.pub.pub.Document;
import com.mimacom.ddd.pub.pub.ProvidedDiagramType;
import com.mimacom.ddd.pub.pub.ProvidedFigure;
import com.mimacom.ddd.pub.pub.ProvidedTable;
import com.mimacom.ddd.pub.pub.ProvidedTableType;
import com.mimacom.ddd.pub.pub.PubModel;
import com.mimacom.ddd.pub.pub.PubPackage;
import com.mimacom.ddd.pub.pub.Reference;
import com.mimacom.ddd.pub.pub.ReferenceScope;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramProviderRegistry;
import com.mimacom.ddd.pub.pub.diagramProvider.DiagramRendererProxy;
import com.mimacom.ddd.pub.pub.scoping.AbstractPubScopeProvider;
import com.mimacom.ddd.pub.pub.tableProvider.TableProviderRegistry;
import com.mimacom.ddd.pub.pub.tableProvider.TableRendererProxy;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class PubScopeProvider extends AbstractPubScopeProvider {
  private static final PubPackage PUB = PubPackage.eINSTANCE;
  
  @Inject
  private IQualifiedNameProvider qualifiedNameProvider;
  
  @Inject
  private TableProviderRegistry tableProviderRegistry;
  
  @Inject
  private DiagramProviderRegistry diagramProviderRegistry;
  
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
          case FOOTNOTE:
            _switchResult = PubScopeProvider.PUB.getFootnote();
            break;
          case LIST_ITEM:
            _switchResult = PubScopeProvider.PUB.getListItem();
            break;
          case TABLE:
            _switchResult = PubScopeProvider.PUB.getTitledTable();
            break;
          case FIGURE:
            _switchResult = PubScopeProvider.PUB.getTitledFigure();
            break;
          case EQUATION:
            _switchResult = PubScopeProvider.PUB.getEquation();
            break;
          case CODE_LISTING:
            _switchResult = PubScopeProvider.PUB.getTitledCodeListing();
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
      return this.getDefaultScopeOfType(context, targetScope);
    } else {
      if ((Objects.equal(reference, PubScopeProvider.PUB.getProvidedTable_TableType()) && (context instanceof ProvidedTable))) {
        final ProvidedTable table = ((ProvidedTable) context);
        final PubModel model = EcoreUtil2.<PubModel>getContainerOfType(context, PubModel.class);
        if ((model != null)) {
          boolean _isEmpty = model.getProvidedTableTypes().isEmpty();
          if (_isEmpty) {
            return IScope.NULLSCOPE;
          } else {
            IDiagramRoot _diagramRoot = table.getDiagramRoot();
            boolean _tripleNotEquals = (_diagramRoot != null);
            if (_tripleNotEquals) {
              final Function1<TableRendererProxy, String> _function = (TableRendererProxy it) -> {
                return it.id;
              };
              final List<String> tableRendererIds = IterableExtensions.<String>toList(IterableExtensions.<TableRendererProxy, String>map(this.tableProviderRegistry.getTableRenderers(table.getDiagramRoot().getClass()), _function));
              final Function1<ProvidedTableType, Boolean> _function_1 = (ProvidedTableType it) -> {
                return Boolean.valueOf(tableRendererIds.contains(it.getName()));
              };
              return this.createScopeWithQualifiedNames(IterableExtensions.<ProvidedTableType>filter(model.getProvidedTableTypes(), _function_1));
            }
          }
        }
      } else {
        if ((Objects.equal(reference, PubScopeProvider.PUB.getProvidedFigure_DiagramType()) && (context instanceof ProvidedFigure))) {
          final ProvidedFigure figure = ((ProvidedFigure) context);
          final PubModel model_1 = EcoreUtil2.<PubModel>getContainerOfType(context, PubModel.class);
          if ((model_1 != null)) {
            boolean _isEmpty_1 = model_1.getProvidedDiagramTypes().isEmpty();
            if (_isEmpty_1) {
              return IScope.NULLSCOPE;
            } else {
              IDiagramRoot _diagramRoot_1 = figure.getDiagramRoot();
              boolean _tripleNotEquals_1 = (_diagramRoot_1 != null);
              if (_tripleNotEquals_1) {
                final Function1<DiagramRendererProxy, String> _function_2 = (DiagramRendererProxy it) -> {
                  return it.diagramTypeID;
                };
                final List<String> diagramProviderIds = IterableExtensions.<String>toList(ListExtensions.<DiagramRendererProxy, String>map(((List<DiagramRendererProxy>)Conversions.doWrapArray(this.diagramProviderRegistry.getAllDiagramRenderers())), _function_2));
                final Function1<ProvidedDiagramType, Boolean> _function_3 = (ProvidedDiagramType it) -> {
                  return Boolean.valueOf(diagramProviderIds.contains(it.getName()));
                };
                return this.createScopeWithQualifiedNames(IterableExtensions.<ProvidedDiagramType>filter(model_1.getProvidedDiagramTypes(), _function_3));
              }
            }
          }
        }
      }
    }
    return super.getScope(context, reference);
  }
  
  /**
   * Add symbols to context-reference scope.
   */
  @Override
  public IScope getContextReferenceScope(final EObject context, final IScope outerScope) {
    final IScope scope = super.getContextReferenceScope(context, outerScope);
    final Document doc = EcoreUtil2.<Document>getContainerOfType(context, Document.class);
    if (((doc != null) && (!doc.getSymbols().isEmpty()))) {
      return Scopes.scopeFor(doc.getSymbols(), scope);
    }
    return scope;
  }
  
  protected SimpleScope createScopeWithQualifiedNames(final Iterable<? extends EObject> objects) {
    final List<IEObjectDescription> descriptions = Lists.<IEObjectDescription>newArrayList();
    for (final EObject obj : objects) {
      QualifiedName _fullyQualifiedName = this.qualifiedNameProvider.getFullyQualifiedName(obj);
      EObjectDescription _eObjectDescription = new EObjectDescription(_fullyQualifiedName, obj, null);
      descriptions.add(_eObjectDescription);
    }
    return new SimpleScope(descriptions);
  }
}
