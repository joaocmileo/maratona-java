package academy.devdojo.maratonajava.javacore.Rdates.test;

import java.util.Date;

public class DatesTest01 {
    static void main() {
        Date date = new Date();
        date.setTime(date.getTime()+3_600_000);
        System.out.println(date);
    }

}
