/*
 * UC-10: Ability to get number of contact by city or state.
 * 
 * @author : Navaya Shree
 * @since : 01-11-21
 */
package com.bridgelab.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class AddressBook {
	private List<ContactPerson> contacts;

	public List<ContactPerson> getContacts() {
		return contacts;
	}

	public void setContacts(List<ContactPerson> contacts) {
		this.contacts = contacts;
	}

}