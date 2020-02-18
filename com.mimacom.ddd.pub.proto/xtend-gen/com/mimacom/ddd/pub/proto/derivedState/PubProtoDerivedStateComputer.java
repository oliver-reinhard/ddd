package com.mimacom.ddd.pub.proto.derivedState;

import com.google.common.base.Objects;
import com.google.inject.Singleton;
import com.mimacom.ddd.pub.proto.ProtoFactory;
import com.mimacom.ddd.pub.proto.ProtoSymbol;
import com.mimacom.ddd.pub.proto.PublicationClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

@Singleton
@SuppressWarnings("all")
public class PubProtoDerivedStateComputer implements IDerivedStateComputer {
  private static final ProtoFactory PROTO = ProtoFactory.eINSTANCE;
  
  public static final String TITLE_SYMBOL_NAME = "DOC_TITLE";
  
  @Override
  public void installDerivedState(final DerivedStateAwareResource resource, final boolean preLinkingPhase) {
    if ((!preLinkingPhase)) {
      EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
      final PublicationClass model = ((PublicationClass) _head);
      this.installTitleSymbol(model);
    }
  }
  
  @Override
  public void discardDerivedState(final DerivedStateAwareResource resource) {
    EObject _head = IteratorExtensions.<EObject>head(resource.getAllContents());
    final PublicationClass model = ((PublicationClass) _head);
    if ((model != null)) {
      this.removeTitleSymbol(model);
    }
  }
  
  protected void installTitleSymbol(final PublicationClass model) {
    final Function1<ProtoSymbol, Boolean> _function = (ProtoSymbol it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, PubProtoDerivedStateComputer.TITLE_SYMBOL_NAME));
    };
    boolean _isEmpty = IterableExtensions.isEmpty(IterableExtensions.<ProtoSymbol>filter(model.getSymbols(), _function));
    if (_isEmpty) {
      final ProtoSymbol titleSymbol = PubProtoDerivedStateComputer.PROTO.createProtoSymbol();
      titleSymbol.setName(PubProtoDerivedStateComputer.TITLE_SYMBOL_NAME);
      model.getSymbols().add(titleSymbol);
    }
  }
  
  protected void removeTitleSymbol(final PublicationClass model) {
    final Function1<ProtoSymbol, Boolean> _function = (ProtoSymbol it) -> {
      String _name = it.getName();
      return Boolean.valueOf(Objects.equal(_name, PubProtoDerivedStateComputer.TITLE_SYMBOL_NAME));
    };
    final ProtoSymbol titleSymbol = IterableExtensions.<ProtoSymbol>head(IterableExtensions.<ProtoSymbol>filter(model.getSymbols(), _function));
    if ((titleSymbol != null)) {
      model.getSymbols().remove(titleSymbol);
    }
  }
}
