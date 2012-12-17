package ihm.test;

import com.sun.demo.addressbook.AddressFrame;
import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swing.locator.LabeledTextLocator;
import java.awt.event.KeyEvent;
import com.windowtester.runtime.WT;
import com.windowtester.runtime.swing.locator.JListLocator;

public class NoSaveIfNoEdit extends UITestCaseSwing {

	/**
	 * Create an Instance
	 */
	public NoSaveIfNoEdit() {
		super(com.sun.demo.addressbook.AddressFrame.class);
	}

	/**
	 * Main test method.
	 */
	public void testNoSaveIfNoEdit() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("New"));
		ui.click(new LabeledTextLocator("Last Name"));
		ui.enterText("toto");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("tata");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("titi");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("tutu");
		ui.click(new JButtonLocator("Save"));
		ui.click(new JListLocator("toto, tata titi"));
		ui.click(new JButtonLocator("Edit"));
		ui.assertThat(new JButtonLocator("Save").isEnabled(false));

	}

}