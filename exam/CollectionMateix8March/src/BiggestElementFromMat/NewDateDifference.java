package BiggestElementFromMat;
import java.util.Calendar;

public class NewDateDifference {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = Calendar.getInstance();
		cal1.set(2006, Calendar.DECEMBER, 30);
		cal2.set(2007, Calendar.MAY, 3);
		long millis1 = cal1.getTimeInMillis();
		long millis2 = cal2.getTimeInMillis();

		long diff = millis2 - millis1;
		long diffDays = diff / (24 * 60 * 60 * 1000);
		System.out.println("In days: " + diffDays + " days.");
	}
}