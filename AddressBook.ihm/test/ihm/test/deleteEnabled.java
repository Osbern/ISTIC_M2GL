package ihm.test;

import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swing.locator.LabeledTextLocator;
import com.windowtester.runtime.swing.locator.JListLocator;

public class deleteEnabled extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public deleteEnabled() {
		super(com.sun.demo.addressbook.AddressFrame.class);
	}

	/**
	 * Main test method.
	 */
	public void testdeleteEnabled() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("New"));
		ui.click(new LabeledTextLocator("Last Name"));
		ui.enterText("Hello");
		ui.click(new LabeledTextLocator("First Name"));
		ui.enterText("World");
		ui.click(new JButtonLocator("Save"));
		ui.click(new JListLocator("Hello, World"));
		ui.assertThat(new JButtonLocator("Delete").isEnabled(true));
		ui.click(new JButtonLocator("Delete"));
	}

}