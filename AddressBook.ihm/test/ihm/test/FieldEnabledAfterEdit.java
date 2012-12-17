package ihm.test;

import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swing.locator.LabeledTextLocator;
import com.windowtester.runtime.swing.locator.JListLocator;

public class FieldEnabledAfterEdit extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public FieldEnabledAfterEdit() {
		super(com.sun.demo.addressbook.AddressFrame.class);
	}

	/**
	 * Main test method.
	 */
	public void testFieldEnabledAfterEdit() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("New"));
		ui.click(new LabeledTextLocator("Last Name"));
		ui.enterText("aaa");
		ui.click(new LabeledTextLocator("First Name"));
		ui.enterText("bbb");
		ui.click(new LabeledTextLocator("Middle Name"));
		ui.enterText("ccc");
		ui.click(new LabeledTextLocator("Phone"));
		ui.enterText("ddd");
		ui.click(new LabeledTextLocator("Email"));
		ui.enterText("eee");
		ui.click(new JButtonLocator("Save"));
		ui.click(new JListLocator("aaa, bbb ccc"));
		ui.assertThat(new LabeledTextLocator("Last Name").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("First Name").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("Middle Name").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("Phone").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("Email").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("Address 1").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("Address 2").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("City").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("State").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("ZIP").isEnabled(false));
		ui.assertThat(new LabeledTextLocator("Country").isEnabled(false));
		ui.click(new JButtonLocator("Edit"));
		ui.assertThat(new LabeledTextLocator("Last Name").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("First Name").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("Middle Name").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("Phone").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("Email").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("Address 1").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("Address 2").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("City").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("State").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("ZIP").isEnabled(true));
		ui.assertThat(new LabeledTextLocator("Country").isEnabled(true));
	}

}