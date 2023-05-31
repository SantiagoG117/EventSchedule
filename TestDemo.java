/**
 *This is the driver class for this program. This means that it just runs the application with a method main.
 @author Santiago Garcia
 @version 1.0
 @since Java 17.0.6
 */

package lab3package;
import java.sql.SQLOutput;


public class TestDemo {

	/**
	 * This is the entry point for the application, it instantiates 4 EventSchedule
	 * objects to show-case the constructors. Anonymous objects are used and
	 * each one is only retained long enough to call method create report on
	 * each. No variable names were used, just new Constructor().methodCall().
	 * @param args Command line arguments are not used by this program.
	 */

	public static void main(String[] args) {
		System.out.println("EventSchedule1");
		System.out.println(new EventSchedule().createReport());

		System.out.println("EventSchedule2");
		System.out.println(new EventSchedule(2023).createReport());

		System.out.println("EventSchedule3");
		System.out.println(new EventSchedule(2023,12).createReport());

		System.out.println("EventSchedule4");
		System.out.println(new EventSchedule(2023,12,15).createReport());


	}
}
