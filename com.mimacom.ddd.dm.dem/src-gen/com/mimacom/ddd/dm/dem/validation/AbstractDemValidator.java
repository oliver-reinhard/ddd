/*
 * generated by Xtext 2.19.0
 */
package com.mimacom.ddd.dm.dem.validation;

import com.mimacom.ddd.dm.dmx.validation.DmxValidator;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.validation.NamesAreUniqueValidator;

@ComposedChecks(validators = {NamesAreUniqueValidator.class})
public abstract class AbstractDemValidator extends DmxValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>(super.getEPackages());
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.mimacom.com/ddd/dm/base"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.mimacom.com/ddd/dm/dmx"));
		return result;
	}
}
