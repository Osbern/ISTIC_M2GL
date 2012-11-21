package com.sun.demo.addressbook.db;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllDataTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllDataTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(AddContactDataTest.class);
		//$JUnit-END$
		return suite;
	}

}
