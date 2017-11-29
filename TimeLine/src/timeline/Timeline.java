/**
 * 
 */
package timeline;

import event.Event;
import util.SortedLinkedList;

/**
 * @author Rafael Zingle
 *
 */
public class Timeline {
	/** The timeline's title. */
	private String title;
	/** The timeline's start date. */
	private int startDate;
	/** The timeline's end date. */
	private int endDate;
	/** A list of the timeline's events. */
	private SortedLinkedList<Event> events;
	
	/**Creates a new Timeline.
	 * 
	 * @param start the timeline's start date
	 * @param end the timeline's end date
	 * @param title the timeline's title
	 */
	public Timeline(int start, int end, String title) {
		setStartDate(start);
		setEndDate(end);
		setTitle(title);
		events = new SortedLinkedList<Event>();
	}
	
	/**Creates a new Timeline.
	 * 
	 * @param start the timeline's start date
	 * @param end the timeline's end date
	 */
	public Timeline(int start, int end) {
		this(start, end, "My Timeline");
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the startDate
	 */
	public int getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public int getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the events
	 */
	public SortedLinkedList<Event> getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
	 */
	public void setEvents(SortedLinkedList<Event> events) {
		this.events = events;
	}

}
