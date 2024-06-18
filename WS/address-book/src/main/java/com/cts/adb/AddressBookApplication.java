package com.cts.adb;

import com.cts.adb.dao.ContactDAO;
import com.cts.adb.dao.ContactDAOInMemImpl;
import com.cts.adb.service.ContactService;
import com.cts.adb.service.ContactServiceImpl;
import com.cts.adb.ui.ContactUI;

public class AddressBookApplication {

	public static void main(String[] args) {
		ContactDAO contactDao = new ContactDAOInMemImpl();
		ContactService contactService = new ContactServiceImpl(contactDao);
		ContactUI contactUI = new ContactUI(contactService);
		contactUI.run();
	}

}
