/**
 * 
 */
package event;

import static org.junit.Assert.*;

import org.junit.Test;

/**Tests the Event class to make sure only valid information can be added.
 * @author rafaelzingle
 *
 */
public class EventTest {

	/**
	 * Test method for {@link event.Event#Event(java.lang.String, java.lang.String, java.lang.String, int, int, int)}.
	 */
	@Test
	public void testEventStringStringStringIntIntInt() {
		try {
			Event validEvent1 = new Event("Name","Description","Location", 2000, 5, 21);
			assertEquals("Name", validEvent1.getName());
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		try {
			Event validEvent2 = new Event("Name","Description","Location", 2000, 5);
			assertEquals("Name", validEvent2.getName());
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		try {
			Event validEvent3 = new Event("Name","Description","Location", 2000);
			assertEquals("Name", validEvent3.getName());
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		try {
			Event validEvent4 = new Event("Name","Description","Location", 2000, 5, 21);
			assertEquals("Name", validEvent4.getName());
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		try {
			Event validEvent5 = new Event("Name","Description","Location", 2000, 5);
			assertEquals("Name", validEvent5.getName());
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		try {
			Event validEvent6 = new Event("Name","Description","Location", 2000, 3, 31);
			assertEquals("Name", validEvent6.getName());
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		try {
			Event validEvent7 = new Event("Name","Description","", 2000, 9, 30);
			assertEquals("Name", validEvent7.getName());
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		try {
			Event validEvent8 = new Event("Name","","Location", 2000, 2, 28);
			assertEquals("Name", validEvent8.getName());
		} catch (IllegalArgumentException e) {
			fail();
		}
		
		Event invalidEvent = null;
		try {
			invalidEvent = new Event("","Description","Location", 2000);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Name cannot be empty.", e.getMessage());
			assertNull(invalidEvent);
		}
		
		try {
			invalidEvent = new Event("Name",null,"Location", 2000);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Description cannot be null.", e.getMessage());
			assertNull(invalidEvent);
		}
		
		try {
			invalidEvent = new Event("Name","Description","Location", -2000);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Year.", e.getMessage());
			assertNull(invalidEvent);
		}
		
		try {
			invalidEvent = new Event("Name","Description","Location", 1876, 15);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Month.", e.getMessage());
			assertNull(invalidEvent);
		}
		
		try {
			invalidEvent = new Event("Name","Description","Location", 1889, 12, 32);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Day.", e.getMessage());
			assertNull(invalidEvent);
		}
		
		try {
			invalidEvent = new Event("Name","Description","Location", 1884, 4, 31);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Day.", e.getMessage());
			assertNull(invalidEvent);
		}
		
		try {
			invalidEvent = new Event("Name","Description","Location", 1772, 2, 29);
			fail();
		} catch (IllegalArgumentException e) {
			assertEquals("Invalid Day.", e.getMessage());
			assertNull(invalidEvent);
		}
	}

}
