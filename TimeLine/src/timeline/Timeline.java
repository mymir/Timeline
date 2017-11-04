/**
 * 
 */
package timeline;

import java.util.ArrayList;

import event.Event;

/**
 * @author Rafael Zingle
 *
 */
public class Timeline {
	/** */
	private String title;
	/** */
	private int startDate;
	/** */
	private int endDate;
	/** */
	private ArrayList<Event> events;

	/**
	 * 
	 */
	public Timeline(int start, int end) {
		this(start, end, "My Timeline");
	}
	
	/**
	 * 
	 */
	public Timeline(int start, int end, String title) {
		
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
	public ArrayList<Event> getEvents() {
		return events;
	}

	/**
	 * @param events the events to set
	 */
	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

}
