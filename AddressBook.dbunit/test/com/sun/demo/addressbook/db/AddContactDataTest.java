package com.sun.demo.addressbook.db;

import com.windowtester.runtime.swing.condition.WindowDisposedCondition;
import com.windowtester.runtime.swing.locator.JButtonLocator;
import com.windowtester.runtime.swing.UITestCaseSwing;
import com.windowtester.runtime.IUIContext;
import com.windowtester.runtime.swing.locator.LabeledTextLocator;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;

import org.dbunit.Assertion;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.Column;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.ITable;
import org.dbunit.dataset.filter.DefaultColumnFilter;
import org.dbunit.dataset.xml.FlatXmlDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;

import com.windowtester.runtime.WT;

/**
 * To the generated class by WindowTesterPro, you have to override setUp() to
 * establish the connection to the DB in order to test it.
 * 
 * @author Juan
 * 
 */
public class AddContactDataTest extends UITestCaseSwing {

	private FlatXmlDataSet expected;
	private IDatabaseConnection connection;
	private JdbcDatabaseTester tester;
	private IDataSet actual;

	@Override
	protected void setUp() throws Exception {
		
		WT.setLocaleToCurrent();
				
		String dbName = "DefaultAddressBook";
		FlatXmlDataSet initialData = new FlatXmlDataSetBuilder()
				.build(new FileInputStream("data/dataset1address.xml"));
		expected = new FlatXmlDataSetBuilder().build(new FileInputStream(
				"data/dataset2addresses.xml"));
		new AddressDao();
		tester = new JdbcDatabaseTester(
				"org.apache.derby.jdbc.EmbeddedDriver", "jdbc:derby:" + dbName,
				"addressuser", "addressuser", "APP");
		connection = tester.getConnection();
		DatabaseOperation.CLEAN_INSERT.execute(connection, initialData);
		//run();
	}

	/**
	 * Create an Instance
	 */
	public AddContactDataTest() {
		super(com.sun.demo.addressbook.AddressFrame.class);
	}

	/**
	 * Main test method.
	 */
	public void testAddContactData() throws Exception {
		IUIContext ui = getUI();
		ui.click(new JButtonLocator("New"));
		ui.click(new LabeledTextLocator("Last Name"));
		ui.enterText("LECRIVAIN");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("Benoit");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("Alexandre");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("0225688722");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("benoit.lecrivain@hotmail.com");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("Chateau d Apigne");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("Porte 4");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("Apigne");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("Bretagne");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("35650");
		ui.keyClick(KeyEvent.VK_TAB);
		ui.enterText("France");
		ui.click(new JButtonLocator("Save"));
		
		
		actual = connection.createDataSet();
		String tableName = "Address";
		ITable expectedTable = expected.getTable(tableName);
		ITable actualTable = actual.getTable(tableName);
		Column[] filter = expected.getTableMetaData(tableName).getColumns();
		ITable actualFilteredTable = DefaultColumnFilter.includedColumnsTable(actualTable, 
	            filter);
		Assertion.assertEquals(expectedTable, actualFilteredTable);
		//ui.wait(new WindowDisposedCondition("Address Book Demo"));
	}

	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
		connection = tester.getConnection();
		DatabaseOperation.DELETE_ALL.execute(connection, actual);
		connection.close();
	}

}