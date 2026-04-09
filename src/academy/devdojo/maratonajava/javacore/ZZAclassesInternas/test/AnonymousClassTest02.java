package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClassTest02 {

    static class BarcoNameComparator implements  Comparator<Barco>{
        @Override
        public int compare(Barco o1, Barco o2) {
            return o1.getNome().compareTo(o2.getNome());
        }
    }

    static void main() {
        List<Barco> barcos = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Iate")));
        System.out.println(barcos);

        //barcos.sort(new BarcoNameComparator());

        barcos.sort(new Comparator<Barco>() {
            @Override
            public int compare(Barco o1, Barco o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });


        System.out.println(barcos);
    }


}
