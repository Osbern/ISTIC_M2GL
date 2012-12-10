package addressbookonline.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.thoughtworks.selenium.DefaultSelenium;
import com.thoughtworks.selenium.SeleneseTestCase;

public class AddAddress extends SeleneseTestCase {
	
	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost:8080/");
		selenium.start();
	}

	@Test
	public void testAddAddress() throws Exception {
		selenium.open("http://localhost:8080/AddressBookOnline/addresses?form&lang=fr_FR");
		selenium.type("_firstname_id", "someFirstname1");
		selenium.type("_middlename_id", "someMiddlename1");
		selenium.type("_lastname_id", "someLastname1");
		selenium.type("_phone_id", "somePhone1");
		selenium.type("_email_id", "some@email.com");
		selenium.type("_address1_id", "someAddress11");
		selenium.type("_address2_id", "someAddress21");
		selenium.type("_city_id", "someCity1");
		selenium.type("_addressState_id", "someAddressState1");
		selenium.type("_postalCode_id", "somePostalCode1");
		selenium.type("_country_id", "someCountry1");
		selenium.click("//input[@id = 'proceed']");
		selenium.waitForPageToLoad("30000");
		verifyEquals("someFirstname1", selenium.getText("_s_addressbookonline_domain_Address_firstname_firstname_id"));
		verifyEquals("someMiddlename1", selenium.getText("_s_addressbookonline_domain_Address_middlename_middlename_id"));
		verifyEquals("someLastname1", selenium.getText("_s_addressbookonline_domain_Address_lastname_lastname_id"));
		verifyEquals("somePhone1", selenium.getText("_s_addressbookonline_domain_Address_phone_phone_id"));
		verifyEquals("some@email.com", selenium.getText("_s_addressbookonline_domain_Address_email_email_id"));
		verifyEquals("someAddress11", selenium.getText("_s_addressbookonline_domain_Address_address1_address1_id"));
		verifyEquals("someAddress21", selenium.getText("_s_addressbookonline_domain_Address_address2_address2_id"));
		verifyEquals("someCity1", selenium.getText("_s_addressbookonline_domain_Address_city_city_id"));
		verifyEquals("someAddressState1", selenium.getText("_s_addressbookonline_domain_Address_addressState_addressState_id"));
		verifyEquals("somePostalCode1", selenium.getText("_s_addressbookonline_domain_Address_postalCode_postalCode_id"));
		verifyEquals("someCountry1", selenium.getText("_s_addressbookonline_domain_Address_country_country_id"));
		selenium.click("xpath=(//input[@value='Delete Address'])[1]");
		assertTrue(selenium.getConfirmation().matches("^Are you sure want to delete this item[\\s\\S]$"));
	}

	@After
	public void tearDown() throws Exception {
		selenium.stop();
	}
}
