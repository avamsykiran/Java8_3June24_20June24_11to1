package com.cts.adb;

import com.cts.adb.dao.ContactDAO;
import com.cts.adb.dao.ContactDAOJDBCImpl;
import com.cts.adb.exceptions.AddressBookException;
import com.cts.adb.service.ContactService;
import com.cts.adb.service.ContactServiceImpl;
import com.cts.adb.ui.ContactUI;

public class AddressBookApplication {

	public static void main(String[] args) {

		// ContactDAO contactDao = new ContactDAOInMemImpl();
		// ContactDAO contactDao = new ContactDAOFileSystemImpl();
		ContactDAO contactDao = new ContactDAOJDBCImpl();
		ContactService contactService = new ContactServiceImpl(contactDao);
		ContactUI contactUI = new ContactUI(contactService);
		contactUI.run();

	}

}
