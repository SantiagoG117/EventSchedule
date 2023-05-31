/**
 * Class EventSchedule demonstrates constructor chaining using "this" keyword.
 * The simpler constructors all call against the more complex one, chaining
 * the calls "upwards" from the default constructor to the one with the most
 * arguments.  The constructors in this code have System.out.println(a-message) in them,
 * for demonstration purposes only
 @author Santiago Garcia
 @see lab3package.TestDemo
 @version 1.0
 @since Java 17.0.6
 */

package lab3package;
import java.time.LocalDate;

public class EventSchedule {
	//Attributes:
	private int year; //year component of the date of EventSchedule.
	private int month; //month component of the date of EventSchedule
	private int day; //day component of the date of EventSchedule
	private LocalDate currentDate = LocalDate.now();


	//Constructors
	/**
	 * The default constructor sets the current date as the default values of
	 * year, month and day.
	 *
	 * EventSchedule() calls EventSchedule(year, month, day), program flow
	 * returns to EventSchedule() and exits the constructor.
	 */
	public EventSchedule() {
		this(2022,9,20);
		System.out.println("EventSchedule() was called");
	}

	/**
	 * This constructor sets the year as passed, month to current month,
	 * and day to current day.
	 * EventSchedule(year) calls EventSchedule(year, month, day), program flow
	 * returns to EventSchedule(year) and exits the constructor
	 * @param year The year of this EventSchedule.
	 */

	public EventSchedule(int year) {
		//code rest of constructor here
		this(year,9,20);
		System.out.println("EventSchedule(int) was called");
	}

	/**
	 * This constructor sets the year as passed, month as passed, and day to
	 * current day.
	 * EventSchedule(year, month) calls EventSchedule(year, month, day),
	 * program flow returns to EventSchedule(year, month) and exits the constructor.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 *
	 */
	public EventSchedule (int year, int month){
		this(year, month,20);
		System.out.println("EventSchedule(int, int) was called");
	}

	/**
	 *
	 * This constructor sets the year as passed, month as passed, and
	 * day as passed.
	 * @param year The year of this EventSchedule.
	 * @param month of this EventSchedule.
	 * @param day of this EventSchedule.
	 */
	public EventSchedule(int year, int month, int day) {
		setYear(year);
		setMonth(month);
		setDay(day);
		System.out.println("EventSchedule(int, int, int) was called");
	}


	//Getters and setters
	/**
	 * @return the year for this EventSchedule.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * Sets the year for this EventSchedule.
	 * @param year The year for this EventSchedule.
	 */
	public void setYear(int year) {
		if (year <= 0)
			throw new IllegalArgumentException();
		this.year = year;
	}

	/**
	 * @return true if this EventSchedule is hybrid, false if it is not.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * 
	 * Sets the month state for this EventSchedule.
	 * @param month this is the month to set for EventSchedule.
	 */

	public void setMonth(int month) {
		if (month <= 0)
			throw new IllegalArgumentException();
		this.month = month;
	}
	
	/**
	 * @return day of this EventSchedule.
	 */
	public double getDay() {
		return day;
	}
	/**
	 * Sets the day of this EventSchedule.
	 * @param day The day of this EventSchedule .
	 */
	public void setDay(int day) {
		if (day <= 0)
			throw new IllegalArgumentException();
		this.day = day;
	}
	
	/**
	 * @return A String representation of this EventSchedule, each field is separated 
	 * by a comma in the order of year, month, day
	 */
	public String createReport() {
		return String.format("EventSchedule, " + "year: %d, Month: %d, Day: %d%n",year,month,day);
	}
}
