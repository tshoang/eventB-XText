/*
 * generated by Xtext 2.10.0
 */
package ac.soton.eventb.xtext.machine.ui

import com.google.inject.Binder
import com.google.inject.name.Names
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
class XMachineUiModule extends AbstractXMachineUiModule {

	override configure(Binder binder) {
		super.configure(binder);
		binder.bind(typeof(String)).annotatedWith(
			Names.named((XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS))).toInstance("!#%&*-:|~/");
	}

}