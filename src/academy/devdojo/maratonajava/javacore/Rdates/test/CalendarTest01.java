package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarTest01 {
    static void main() {
        Calendar calendar = Calendar.getInstance();
        Date date1 = new Date();


        System.out.println(calendar);
        Date date = calendar.getTime();
        System.out.println(date);
        System.out.println(calendar.getCalendarType());
        System.out.println(calendar.getFirstDayOfWeek());
        if (calendar.getFirstDayOfWeek() == Calendar.MONDAY){
            System.out.println("Segunda é o primeiro dia da semana bb");
        }
        System.out.println(calendar.getWeekYear());
        calendar.set(2025,Calendar.APRIL,3);
        System.out.println(calendar.getTime());


    }
}
