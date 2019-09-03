package com.mimacom.ddd.dm.esm.impl;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;

import com.mimacom.ddd.dm.esm.EsmEntityStateModel;
import com.mimacom.ddd.dm.esm.EsmLayoutDirection;
import com.mimacom.ddd.dm.esm.IEsmLayout;
import com.mimacom.ddd.dm.esm.IEsmStateModel;

public class EsmLayoutUtil {
	
	static private EsmLayoutDirection DEFAULT_DIRECTION = EsmLayoutDirection.RIGHT;

	static public EsmLayoutDirection getDirection(EsmEntityStateModel model, EsmLayoutDirection direction) {
		if (direction == EsmLayoutDirection.DEFAULT) {
			return DEFAULT_DIRECTION;
		}
		return direction;
	}

	static public EsmLayoutDirection getDirection(IEsmLayout layout, EsmLayoutDirection direction) {
		if (direction == EsmLayoutDirection.DEFAULT) {
			EObject parent = EcoreUtil2.getContainerOfType(layout.eContainer(), IEsmStateModel.class);
			if (parent != null) {
				return ((IEsmStateModel) parent).getDirection();
			}
			return DEFAULT_DIRECTION;
		}
		return direction;
	}
}
