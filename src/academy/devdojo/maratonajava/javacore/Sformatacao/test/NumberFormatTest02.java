package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    static void main() {
        Locale localeGER = Locale.GERMANY;
        Locale localeIT = Locale.ITALY;
        Locale localeCH = Locale.CHINA;
        Locale localeKOR = Locale.KOREA;
        Locale locateBR = Locale.of("pt","BR");
        NumberFormat[] df = new NumberFormat[5];
        df[0] = NumberFormat.getInstance(localeGER);
        df[1] =NumberFormat.getInstance(localeKOR);
        df[2] =NumberFormat.getInstance(localeCH);
        df[3] =NumberFormat.getInstance(localeIT);
        df[4] =NumberFormat.getInstance(locateBR);
        double valor = 22.22;
        for (NumberFormat numberFormat:df){
            numberFormat.setMaximumFractionDigits(20);
            System.out.println(numberFormat.format(valor));
        }
        String texto = "22.23";
        try {
            System.out.println(df[2].parse(texto));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
}
