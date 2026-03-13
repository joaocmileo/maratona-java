package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    static void main() {
        Locale localeGER = Locale.GERMANY;
        Locale localeIT = Locale.ITALY;
        Locale localeCH = Locale.CHINA;
        Locale localeKOR = Locale.KOREA;
        Locale locateBR = Locale.of("pt","BR");
        NumberFormat[] df = new NumberFormat[5];
        df[0] = NumberFormat.getCurrencyInstance(localeGER);
        df[1] =NumberFormat.getCurrencyInstance(localeKOR);
        df[2] =NumberFormat.getCurrencyInstance(localeCH);
        df[3] =NumberFormat.getCurrencyInstance(localeIT);
        df[4] =NumberFormat.getCurrencyInstance(locateBR);
        double valor = 2600.50;
        for (NumberFormat numberFormat:df){
            System.out.println(numberFormat.format(valor));
        }
        String texto = "2.600,50 €\n";
        try {

            System.out.println(df[0].parse(texto));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
