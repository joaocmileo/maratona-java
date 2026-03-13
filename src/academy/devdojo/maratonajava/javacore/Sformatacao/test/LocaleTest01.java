package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    static void main() {
        Calendar calendar = Calendar.getInstance();

        Locale  localeJapao = Locale.of("ja","JP");
        Locale localeAngola = Locale.of("ao","AGO");
        Locale localeBrasil = Locale.of("pt","BR");
        Locale localeArabia = Locale.of("ar","SA");
        Locale localeGrecia = Locale.of("el","GR");
        Locale localeIsrael = Locale.of("he","IL");

        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL,localeJapao);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL,localeAngola);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL,localeBrasil);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL,localeArabia);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL,localeGrecia);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL,localeIsrael);

        System.out.println("Japão: "+df1.format(calendar.getTime()));
        System.out.println("Angola: "+df2.format(calendar.getTime()));
        System.out.println("Brasil: "+df3.format(calendar.getTime()));
        System.out.println("Arabia: "+df4.format(calendar.getTime()));
        System.out.println("Grecia: "+df5.format(calendar.getTime()));
        System.out.println("Israel: "+df6.format(calendar.getTime()));
        System.out.println(Locale.getDefault());
    }
}
