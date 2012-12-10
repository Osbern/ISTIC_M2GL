package addressbookonline.selenium;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.SeleneseTestCase;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverBackedSelenium;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.regex.Pattern;

public class AddAndDeleteAddress extends SeleneseTestCase {
	@Before
	public void setUp() throws Exception {
		WebDriver driver = new FirefoxDriver();
		String baseUrl = "http://localhost:8080/";
		selenium = new WebDriverBackedSelenium(driver, baseUrl);
	}

	@Test
	public void testAddAndDeleteAddress() throws Exception {
		selenium.open("/AddressBookOnline/");
		selenium.click("link=Create new Address");
		selenium.waitForPageToLoad("30000");
		selenium.click("id=_firstname_id");
		selenium.type("id=_firstname_id", "KeyTest001");
		selenium.click("id=proceed");
		selenium.waitForPageToLoad("30000");
		selenium.click("link=List all Addresses");
		selenium.waitForPageToLoad("30000");
		verifyTrue(selenium.isTextPresent("KeyTest001"));
		selenium.click("css=input.image");
		//assertTrue(selenium.getConfirmation().matches("^Are you sure want to delete this item[\\s\\S]$"));
		verifyTrue(!selenium.isTextPresent("KeyTest001"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
