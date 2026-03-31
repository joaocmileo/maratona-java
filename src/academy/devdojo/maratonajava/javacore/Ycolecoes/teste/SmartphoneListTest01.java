package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    static void main() {
        Smartphone s1 = new Smartphone("iPhone","IM19J");
        Smartphone s2 = new Smartphone("Samsung","OXWB6");
        Smartphone s3 = new Smartphone("Alcatel","SV07F");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(s3);
        for (int i = 0; i < smartphones.size(); i++) {
            System.out.println(smartphones.get(i));
        }
        Smartphone s4 = new Smartphone("Alcatel","SV07F");
        Smartphone s5 = new Smartphone("Motorola","UASD2");


        System.out.println(smartphones.contains(s5));
        System.out.println(smartphones.indexOf(s4));


    }
}
