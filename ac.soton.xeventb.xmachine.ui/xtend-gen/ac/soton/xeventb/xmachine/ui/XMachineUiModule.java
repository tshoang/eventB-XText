/**
 * generated by Xtext 2.13.0
 */
package ac.soton.xeventb.xmachine.ui;

import ac.soton.xeventb.xmachine.ui.AbstractXMachineUiModule;
import com.google.inject.Binder;
import com.google.inject.name.Names;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.ui.editor.contentassist.XtextContentAssistProcessor;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@SuppressWarnings("all")
public class XMachineUiModule extends AbstractXMachineUiModule {
  public XMachineUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
  
  @Override
  public void configure(final Binder binder) {
    super.configure(binder);
    binder.<String>bind(String.class).annotatedWith(
      Names.named(XtextContentAssistProcessor.COMPLETION_AUTO_ACTIVATION_CHARS)).toInstance("!#%&*-:|~/\\NIP");
  }
}
