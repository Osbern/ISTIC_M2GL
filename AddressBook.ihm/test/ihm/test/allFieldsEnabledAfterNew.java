package ihm.test;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.locator.LabeledTextLocator;

public class allFieldsEnabledAfterNew extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public allFieldsEnabledAfterNew() {
		super(com.sun.demo.addressbook.AddressFrame.class);
	}

	/**
	 * Main test method.
	 */
	public void testallFieldsEnabledAfterNew() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("New"));
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