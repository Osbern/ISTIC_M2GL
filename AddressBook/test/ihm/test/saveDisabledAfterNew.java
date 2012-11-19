package ihm.test;

import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swing.locator.JListLocator;

public class saveDisabledAfterNew extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public saveDisabledAfterNew() {
		super(com.sun.demo.addressbook.AddressFrame.class);
	}

	/**
	 * Main test method.
	 */
	public void testsaveDisabledAfterNew() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("New"));
		ui.assertThat(new JButtonLocator("Save").isEnabled(false));
	}

}