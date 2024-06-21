/**
 * Jason Kremhelmer
 * CS-320
 * 5/31/2024
 */

package Tests;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import TaskClass.Task;

class TaskTest {

	/**
	 * Good constructor
	 */
	@DisplayName("Good constructor")
	@Test
	void goodContsructor() {
		
        String id = "1";
      	String fullName = "Steve Thoams";
        String description = "This is a good description";

		
        Task tempTask = new Task(id, fullName, description);
        
		assertEquals(1, tempTask.getUniqueID());
		assertEquals(fullName, tempTask.getName());
		assertEquals(description, tempTask.getDescription());		
	}
	
	/**
	 * Invalid constructor with description too long
	 */
	@DisplayName("Invalid constructor")
	@Test
	void invalidContsructor() {
		
        String id = "1";
      	String fullName = "Steve Thomas";
        String description = "This is an invalid description";
       
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);
        });		
	}
	
	/**
	 * Invalid constructor with long IDs
	 */
	@DisplayName("Invalid constructor with long ID")
	@Test
	void invalidIDConstruct() {
		
        String id = "12345638610573285";
      	String fullName = "Steve Thomas";
        String description = "description";
       
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);
        });       
	}
	/**
	 * Invalid constructor with null IDs
	 */
	@DisplayName("Invalid constructor with long ID")
	@Test
	void invalidNullConstruct() {
		
        String id = null;
      	String fullName = "Steve Thomas";
        String description = "description";
       
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);
        });       
	}
	
	/**
	 * Test the setFullName with good input 
	 */
	@DisplayName("Test a valid setName")
	@Test
	public void testGoodName() {
        String id = "1";
      	String fullName = "Steve Thomas";
        String description = "This is a good description";
		
        Task tempTask = new Task(id, fullName, description);  
        tempTask.setName("Test Name");        
        assertEquals("Test Name", tempTask.getName());
	}
	
	/**
	 * Test the setFullName with null input 
	 */
	@DisplayName("Test an invalid null setName")
	@Test
	public void testNullName() {
        String id = "1";
      	String fullName = "Steve Thomas";
        String description = "This is a good description";
		
        Task tempTask = new Task(id, fullName, description);         
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tempTask.setName(null); 
        });	
	}
	
	/**
	 * Test the setFullName with long input 
	 */
	@DisplayName("Test an invalid long setName")
	@Test
	public void testLongName() {
        String id = "1";
      	String fullName = "Steve Thomas";
        String description = "This is a good description";
		
        Task tempTask = new Task(id, fullName, description);         
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tempTask.setName("This is a bad description"); 
        });	
	}
	
	/**
	 * Test the setFullName with empty string 
	 */
	@DisplayName("Test an invalid empty setName")
	@Test
	public void testEmptyName() {
        String id = "1";
      	String fullName = "Steve Thomas";
        String description = "This is a good description";
		
        Task tempTask = new Task(id, fullName, description);         
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tempTask.setName(""); 
        });	
	}
	
	/**
	 * Test the setDescription with empty string 
	 */
	@DisplayName("Test an invalid empty description")
	@Test
	public void testEmptyDescription() {
        String id = "1";
      	String fullName = "Steve Thomas";
        String description = "";                 
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);; 
        });	
	}
	
	/**
	 * Test the setDescription with null string 
	 */
	@DisplayName("Test an invalid null description")
	@Test
	public void testNullDescription() {
        String id = "1";
      	String fullName = "Steve Thomas";
        String description = null;
		
        Task tempTask = new Task(id, fullName, "test");                
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            tempTask.setDescription(null); 
        });	
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
        	new Task(id, fullName, description);; 
        });	
        
	}
	

}
