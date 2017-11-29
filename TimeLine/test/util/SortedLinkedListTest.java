/**
 * 
 */
package util;

import static org.junit.Assert.*;

import org.junit.Test;

import event.Event;

/**Tests the SortedLinkedList class to make sure the elements are sorted properly. 
 * @author rafaelzingle
 *
 */
public class SortedLinkedListTest {

	/**
	 * Test method for {@link util.SortedLinkedList#add(java.lang.Comparable)}.
	 */
	@Test
	public void testAddE() {
		SortedLinkedList<String> list = new SortedLinkedList<String>();
		assertEquals(0, list.size());
		
		list.add("Sat");
		assertEquals("Sat",list.get(0));
		list.add("Bat");
		assertEquals("Bat",list.get(0));
		assertEquals("Sat",list.get(1));
		list.add("Cat");
		assertEquals("Bat",list.get(0));
		assertEquals("Cat",list.get(1));
		assertEquals("Sat",list.get(2));
		list.add("Hat");
		assertEquals("Bat",list.get(0));
		assertEquals("Cat",list.get(1));
		assertEquals("Hat",list.get(2));
		assertEquals("Sat",list.get(3));
		
		SortedLinkedList<Integer> intList = new SortedLinkedList<Integer>();
		assertEquals(0, intList.size());
		
		intList.add(3);
		intList.add(5);
		intList.add(4);
		intList.add(1);
		intList.add(2);
		assertEquals(5, intList.size());
		assertEquals("[1,2,3,4,5]", intList.toString());
		
		SortedLinkedList<Event> eventList = new SortedLinkedList<Event>();
		assertEquals(0, eventList.size());
		
		Event newYears = new Event("New Years Day", "The first day of 1996.", 
				"Time square New York City.", 1996, 1, 1);
		Event halloween = new Event("Halloween", "Halloween in 1978", 
				"Town's Ville Ohio.", 1978, 10, 31);
		Event valentine = new Event("Valentines Day", "Valentines day in 2001.", 
				"Washington D.C.", 2001, 2, 14 );
		
		eventList.add(newYears);
		eventList.add(halloween);
		eventList.add(valentine);
		assertEquals(halloween,eventList.get(0));
		assertEquals(newYears,eventList.get(1));
		assertEquals(valentine,eventList.get(2));
		
		eventList = new SortedLinkedList<Event>();
		assertEquals(0, eventList.size());
		
		newYears = new Event("New Years Day", "The first day of 2005.", 
				"Time square New York City.", 2005, 1, 1);
		halloween = new Event("Halloween", "Halloween in 2005", 
				"Town's Ville Ohio.", 2005, 10, 31);
		valentine = new Event("Valentines Day", "Valentines day in 2005.", 
				"Washington D.C.", 2005, 2, 14 );
		
		eventList.add(newYears);
		eventList.add(halloween);
		eventList.add(valentine);
		assertEquals(newYears,eventList.get(0));
		assertEquals(valentine,eventList.get(1));
		assertEquals(halloween,eventList.get(2));
		
		eventList = new SortedLinkedList<Event>();
		assertEquals(0, eventList.size());
		
		Event birdthday1 = new Event("Jen's B-Day", "Jen's B-Day.", 
				"Time square New York City.", 2005, 10, 13);
		Event birdthday2 = new Event("Mark's B-Day", "Mark's B-Day.", 
				"Town's Ville Ohio.", 2005, 10, 21);
		Event birdthday3 = new Event("Paul's B-Day", "Paul's B-Day.", 
				"Washington D.C.", 2005, 10, 3 );
		
		eventList.add(birdthday1);
		eventList.add(birdthday2);
		eventList.add(birdthday3);
		assertEquals(birdthday3,eventList.get(0));
		assertEquals(birdthday1,eventList.get(1));
		assertEquals(birdthday2,eventList.get(2));
	}

}
