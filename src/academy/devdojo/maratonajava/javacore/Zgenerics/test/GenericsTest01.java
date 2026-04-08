package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest01 {
    static void main() {

        List<String> lista = new ArrayList<>();

        lista.add("Marcelinho Carioca");
        lista.add("Ronaldo Fenomeno");
        lista.add("Neto");
        for (String s : lista) {
            System.out.println(s);
        }
        System.out.println("-".repeat(20));
        adicionarNaLista(lista,new Manga(412L,"Spy Family",33));
        for (String s : lista) {
            System.out.println(s);
        }



//        lista.add(512L);
//        lista.add("Corinthians");
//        lista.add(new Manga(412L,"Spy Family",33));
//
//        for (Object object : lista) {
//            if (object instanceof Manga){
//                System.out.println(((Manga) object).getNome());
//            }
//            if (object instanceof Long){
//                System.out.println(object);
//            }
//            if (object instanceof String){
//                System.out.println(object);
//            }
//        }


    }
    static void adicionarNaLista(List list ,Object o){
        list.add(o);
    }
}
