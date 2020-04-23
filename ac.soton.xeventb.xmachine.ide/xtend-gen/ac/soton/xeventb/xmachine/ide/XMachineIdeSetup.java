/**
 * generated by Xtext 2.13.0
 */
package ac.soton.xeventb.xmachine.ide;

import ac.soton.xeventb.xmachine.XMachineRuntimeModule;
import ac.soton.xeventb.xmachine.XMachineStandaloneSetup;
import ac.soton.xeventb.xmachine.ide.XMachineIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class XMachineIdeSetup extends XMachineStandaloneSetup {
  @Override
  public Injector createInjector() {
    XMachineRuntimeModule _xMachineRuntimeModule = new XMachineRuntimeModule();
    XMachineIdeModule _xMachineIdeModule = new XMachineIdeModule();
    return Guice.createInjector(Modules2.mixin(_xMachineRuntimeModule, _xMachineIdeModule));
  }
}
