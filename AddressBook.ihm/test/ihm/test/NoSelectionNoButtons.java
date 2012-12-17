package ihm.test;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.locator.LabeledTextLocator;

public class NoSelectionNoButtons extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public NoSelectionNoButtons() {
		super(com.sun.demo.addressbook.AddressFrame.class);
	}

	/**
	 * Main test method.
	 */
	public void testallFiledsDisables() throws Exception {
		// le seul moment ou rien n'est selectionné c'est au lancement de l'application
		IUIContext ui = getUI();
		ui.assertThat(new JButtonLocator("Delete").isEnabled(false));
		ui.assertThat(new JButtonLocator("Edit").isEnabled(false));

	}

}