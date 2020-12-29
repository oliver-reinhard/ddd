package com.mimacom.ddd.dm.dim.derivedState;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import com.mimacom.ddd.dm.base.base.DEntityType;
import com.mimacom.ddd.dm.base.base.DModel;
import com.mimacom.ddd.dm.base.base.DNamespace;
import com.mimacom.ddd.dm.base.base.DState;
import com.mimacom.ddd.dm.base.base.ITypeContainer;
import com.mimacom.ddd.dm.base.synthetic.SyntheticFactory;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticEnumeration;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticLiteral;
import com.mimacom.ddd.dm.base.synthetic.TSyntheticQuery;
import com.mimacom.ddd.dm.base.transpose.ISyntheticElement;
import com.mimacom.ddd.dm.dim.DomainInformationModel;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@SuppressWarnings("all")
public class DimDerivedStateComputer implements IDerivedStateComputer {
  private static final Logger LOGGER = Logger.getLogger(DimDerivedStateComputer.class);
  
  private static final SyntheticFactory SYNTHETIC = SyntheticFactory.eINSTANCE;
  
  public static final String SYNTHETIC_STATE_QUERY_NAME = "state";
  
  public static final String SYNTHETIC_STATES_ENUM_SUFFIX = "State";
  
  private boolean derivedStateInstalled = false;
  
  public DimDerivedStateComputer() {
    DimDerivedStateComputer.LOGGER.setLevel(Level.DEBUG);
    DimDerivedStateComputer.LOGGER.debug("Created");
  }
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    boolean _hasSyntaxErrors = resource.getParseResult().hasSyntaxErrors();
    boolean _not = (!_hasSyntaxErrors);
    if (_not) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final DNamespace namespace = ((DNamespace) _head);
      DModel _model = namespace.getModel();
      final DomainInformationModel model = ((DomainInformationModel) _model);
      if ((model != null)) {
        URI _uRI = resource.getURI();
        String _plus = ("Derive state for " + _uRI);
        DimDerivedStateComputer.LOGGER.debug(_plus);
        this.derivedStateInstalled = true;
        this.doInstallDerivedState(resource, model);
        URI _uRI_1 = resource.getURI();
        String _plus_1 = ("Derive state END for " + _uRI_1);
        DimDerivedStateComputer.LOGGER.debug(_plus_1);
      }
    }
  }
  
  protected void doInstallDerivedState(final DerivedStateAwareResource resource, final DomainInformationModel model) {
    final Function1<DEntityType, Boolean> _function = (DEntityType it) -> {
      boolean _isEmpty = it.getStates().isEmpty();
      return Boolean.valueOf((!_isEmpty));
    };
    final Iterator<DEntityType> entitiesWithStates = IteratorExtensions.<DEntityType>filter(Iterators.<DEntityType>filter(resource.getAllContents(), DEntityType.class), _function);
    while (entitiesWithStates.hasNext()) {
      {
        final DEntityType entity = entitiesWithStates.next();
        final ITypeContainer container = EcoreUtil2.<ITypeContainer>getContainerOfType(entity, ITypeContainer.class);
        if ((container != null)) {
          final TSyntheticEnumeration enum_ = DimDerivedStateComputer.SYNTHETIC.createTSyntheticEnumeration();
          String _name = entity.getName();
          String _plus = (_name + DimDerivedStateComputer.SYNTHETIC_STATES_ENUM_SUFFIX);
          enum_.setName(_plus);
          EList<DState> _states = entity.getStates();
          for (final DState state : _states) {
            {
              final TSyntheticLiteral lit = DimDerivedStateComputer.SYNTHETIC.createTSyntheticLiteral();
              lit.setName(state.getName());
              enum_.getLiterals().add(lit);
            }
          }
          container.getTypes().add(enum_);
          final TSyntheticQuery query = DimDerivedStateComputer.SYNTHETIC.createTSyntheticQuery();
          query.setName(DimDerivedStateComputer.SYNTHETIC_STATE_QUERY_NAME);
          query.setType(enum_);
          entity.getFeatures().add(query);
        }
      }
    }
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    if (this.derivedStateInstalled) {
      try {
        URI _uRI = null;
        if (resource!=null) {
          _uRI=resource.getURI();
        }
        String _plus = ("Discard state for " + _uRI);
        DimDerivedStateComputer.LOGGER.debug(_plus);
        this.removeAllSyntheticElements(resource);
      } finally {
        this.derivedStateInstalled = false;
      }
    }
  }
  
  protected void removeAllSyntheticElements(final DerivedStateAwareResource resource) {
    final Iterator<ISyntheticElement> syntheticElements = Iterators.<ISyntheticElement>filter(resource.getAllContents(), ISyntheticElement.class);
    final ArrayList<ISyntheticElement> list = Lists.<ISyntheticElement>newArrayList();
    while (syntheticElements.hasNext()) {
      list.add(syntheticElements.next());
    }
    for (final ISyntheticElement e : list) {
      EcoreUtil.remove(e);
    }
  }
}
