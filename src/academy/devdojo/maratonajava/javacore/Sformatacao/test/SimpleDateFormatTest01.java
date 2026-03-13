package academy.devdojo.maratonajava.javacore.Sformatacao.test;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class SimpleDateFormatTest01 {
    static void main() {
        Locale locale = Locale.of("pt","BR");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("'Curiúva' dd 'de' MMMM 'de' yyyy",locale);
        System.out.println(simpleDateFormat.format(new Date()));
    }

}
