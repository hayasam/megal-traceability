/*
 * generated by Xtext
 */
package org.softlang.megal.language;

import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.validation.CheckMode;
import org.softlang.megal.language.scoping.MegalQualifiedNameConverter;
import org.softlang.megal.language.values.MegalValueConverterService;

import com.google.inject.Binder;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class MegalRuntimeModule extends AbstractMegalRuntimeModule {
	@Override
	public void configure(Binder binder) {
		super.configure(binder);

		binder.bind(IQualifiedNameConverter.class).to(MegalQualifiedNameConverter.class);
	}

	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return MegalValueConverterService.class;
	}

}
