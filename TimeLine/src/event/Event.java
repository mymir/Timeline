/**
 * 
 */
package event;

/**Events hold data about an event and their position in time.
 * @author Rafael Zingle
 *
 */
public class Event implements Comparable<Event> {
	/** The name of the event. */
	private String name;
	/** The description of the event. */
	private String description;
	/** The physical location of the event. */
	private String location;
	/** The year the event took place. */
	private int year;
	/** The month the event took place. */
	private int month;
	/** The day the event took place. */
	private int day;


	/**Creates a new event.
	 * 
	 * @param name the event's name
	 * @param description the event's description
	 * @param location the event's location
	 * @param year the event's year
	 * @param month the event's month
	 * @param day the event's day
	 */
	public Event(String name, String description, String location, int year, int month, int day) {
		setName(name);
		setDescription(description);
		setLocation(location);
		setYear(year);
		setMonth(month);
		setDay(day);
	}
	
	/**Creates a new event.
	 * 
	 * @param name the event's name
	 * @param description the event's description
	 * @param location the event's location
	 * @param year the event's year
	 * @param month the event's month
	 */
	public Event(String name, String description, String location, int year, int month) {
		this(name, description, location, year, month, 0);
	}
	
	/**Creates a new event.
	 * 
	 * @param name the event's name
	 * @param description the event's description
	 * @param location the event's location
	 * @param year the event's year
	 */
	public Event(String name, String description, String location, int year) {
		this(name, description, location, year, 0, 0);
	}

	/**Returns the name of the event.
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**Sets the name of the event.
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**Returns the description of the event.
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**Sets the description of the event.
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**Returns the location of the event.
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}


	/**Sets the location of the event.
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}


	/**Returns the year of the event.
	 * @return the year
	 */
	public int getYear() {
		return year;
	}


	/**Sets the year of the event.
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}


	/**Returns the month of the event.
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}


	/**Sets the month of the event.
	 * @param month the month to set
	 */
	public void setMonth(int month) {
		this.month = month;
	}


	/**Returns the day of the event.
	 * @return the day
	 */
	public int getDay() {
		return day;
	}


	/**Sets the day of the event.
	 * @param day the day to set
	 */
	public void setDay(int day) {
		this.day = day;
	}

	/**Compares events using their dates.
	 * 
	 * @param other the other event
	 * @return 1 if the current event has a later date,
	 * -1 if the event has an earlier date, and 0 if both
	 * events have the same day.
	 */
	@Override
	public int compareTo(Event other) {
		if(year > other.getYear()) {
			return 1;
		}
		if(year < other.getYear()) {
			return -1;
		}
		if(month > other.getMonth()) {
			return 1;
		}
		if(month < other.getMonth()) {
			return -1;
		}
		if(day > other.getDay()) {
			return 1;
		}
		if(day < other.getDay()) {
			return -1;
		}
		return 0;
	}

}
