package String;

import java.util.Calendar;
import java.util.GregorianCalendar;
// import java.util.TimeZone;

public class CalendarExample1 {
  public static void main(String args[]) {
    GregorianCalendar calendar = new GregorianCalendar();
    // TimeZone timeZone = TimeZone.getTimeZone("Europe/London");
    // calendar.setTimeZone(timeZone);
    int year = calendar.get(Calendar.YEAR);
    int month = calendar.get(Calendar.MONTH) + 1;
    int date = calendar.get(Calendar.DATE);
    int amPm = calendar.get(Calendar.AM_PM);
    int hour = calendar.get(Calendar.HOUR);
    int min = calendar.get(Calendar.MINUTE);
    int sec = calendar.get(Calendar.SECOND);
    String sAmPm = amPm == Calendar.AM ? "����" : "����";
    System.out.printf("%d�� %d�� %d�� %s %d�� %d�� %d��", year, month, date, sAmPm, hour, min, sec);
  }
}
