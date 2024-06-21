/**Jason Kremhelmer
 * CS-320
 *May 25 2024
 */

 package Tests;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest{

	/**
	 * Test a constructor with good behavior
	 * Jkrem	
	 */
	@DisplayName("Test a valid Constructor")
	@Test
	public void testGoodConstructor() {
        String contactId = "1";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);
        
		assertEquals(1, testContact.getContactID());
		assertEquals(firstName, testContact.getFirstName());
		assertEquals(lastName, testContact.getLastName());
		assertEquals(phoneNumber, testContact.getPhoneNumber());
		assertEquals(address, testContact.getAddress());
	}
	
	/**
	 * Test a constructor with an invalid phone number length
	 * Jkrem
	 */
	@DisplayName("Test an invalid Constructor")
	@Test
	public void testBadConstructor() {
        String contactId = "2";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "19372054";
        String address = "123 Parker Street";       
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	/**
	 * Test the setFirstName with good input
	 * Jkrem 
	 */
	@DisplayName("Test a valid setFirstName")
	@Test
	public void testGoodSetFirst() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setFirstName("Test");        
        assertEquals("Test", testContact.getFirstName());
	}
	
	/**
	 * Test setFirstName with a null string; should throw an error
	 * Jkrem
	 */
	@DisplayName("Test an invalid null setFirstName")
	@Test
	public void testBadSetFirst() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName(null);
        });
	}
	
	/**
	 * Test the setFirstName with length too great; should throw an exception
	 * Jkrem
	 */
	@DisplayName("Test an invalid length setFirstName")
	@Test
	public void testLongSetFirst() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setFirstName("MyFirstNameCanNotBeThisLong");
        });
	}
	
	/**
	 * Test getID by using a good constructor and then evaluate that an integer is returned
	 * Jkrem
	 */
	@DisplayName("Test getID")
	@Test
	public void testGetID() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertEquals(3, testContact.getContactID());
	}
	
	/**
	 * Test getID by using a good constructor and then evaluate that a string IS NOT returned
	 * Jkrem
	 */
	@DisplayName("Test bad getID")
	@Test
	public void testBadGetID() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        assertNotEquals("3", testContact.getContactID());
	}
	
	/**
	 * Test getID by using an ID too long in the constructor
	 * Jkrem
	 */
	@DisplayName("Test too long getID")
	@Test
	public void testlongGetID() {
        String contactId = "12338641953860214";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Contact(contactId, firstName, lastName, phoneNumber, address);
        });
	}
	
	/**
	 * Jkrem
	 * Test setLastName with a null string; should throw an error
	 */
	@DisplayName("Test an invalid null setLastName")
	@Test
	public void testBadSetLast() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName(null);
        });
	}
	
	/**
	 * Test the setLastName with length too large
	 * Jkrem
	 */
	@DisplayName("Test an invalid length setLastName")
	@Test
	public void testLongSetLast() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setLastName("NoWayMyLastNameIsThisLong");
        });
	}
	
	/**
	 * Test the setLastName with good input
	 * Jkrem 
	 */
	@DisplayName("Test a valid setLastName")
	@Test
	public void testGoodsetLast() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        testContact.setLastName("Test");        
        assertEquals("Test", testContact.getLastName());
	}
	
	/**
	 * Test setPhoneNumber with a null string; should throw an error
	 * Jkrem
	 */
	@DisplayName("Test an invalid null setPhoneNumber")
	@Test
	public void testBadSetPhone() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber(null);
        });
        
	}
	
	/**
	 * Test the setPhone with length != 10; should throw an exception
	 * Jkrem
	 */
	@DisplayName("Test an invalid length setPhoneNumber")
	@Test
	public void testWrongLengthPhone() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("4");
        });
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setPhoneNumber("286401648356209158374");
        });
	}
	/**
	 * Test the setPhone with length 10
	 * Jkrem
	 */
	@DisplayName("Test a valid length setPhoneNumber")
	@Test
	public void testGoodPhone() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setPhoneNumber("19792403845");        
        assertEquals("19792403845", testContact.getPhoneNumber());

	}
	
	/**
	 * Test setAddress with a null string; should throw an error
	 * Jkrem
	 */
	@DisplayName("Test an invalid null setAddress")
	@Test
	public void testNullSetAddress() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress(null);
        });
        
	}
	
	/**
	 * Test the setAddress with length > 30; should throw an exception
	 * Jkrem
	 */
	@DisplayName("Test an invalid length setPhoneNumber")
	@Test
	public void testWrongLengthAddress() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   
        
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	testContact.setAddress("894572 My Head Is Killing Me. I Need More Water.");
        });
	}
	/**
	 * Test the setAddress with good input
	 * Jkrem
	 */
	@DisplayName("Test a valid length setAddress")
	@Test
	public void testGoodAddress() {
        String contactId = "3";
      	String firstName = "Steve";
        String lastName = "Thomas";
        String phoneNumber = "1238675309";
        String address = "123 Parker Street";
		
        Contact testContact = new Contact(contactId, firstName, lastName, phoneNumber, address);   

        testContact.setAddress("867 Seems Legit");        
        assertEquals("867 Seems Legit", testContact.getAddress());

	}
	
}
