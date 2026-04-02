package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableTest01 {
    static class SmartphoneMarcaComparator implements Comparator<Smartphone>{
        @Override
        public int compare(Smartphone o1, Smartphone o2) {
            return o1.getMarca().compareTo(o2.getMarca());
        }
    }
    static class MangasPrecoComparator implements Comparator<Manga>{
        @Override
        public int compare(Manga o1, Manga o2) {
            return Double.compare(o1.getPreco(),o2.getPreco());
        }
    }

    static void main() {
        NavigableSet<Smartphone> smartphones = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("Asangue suga", "123A");
        Smartphone smartphone2 = new Smartphone("Csanguesuga", "123A");
        Smartphone smartphone3 = new Smartphone("Zi fome ", "123A");
        smartphones.add(smartphone);
        smartphones.add(smartphone2);
        smartphones.add(smartphone3);

        NavigableSet<Manga> mangas = new TreeSet<>(new MangasPrecoComparator());

        mangas.add(new Manga(1L,"Nanatsu Taisai",10,2));
        mangas.add(new Manga(4L,"Demon's Slayer",20,4));
        mangas.add(new Manga(2L,"Attack on Titan",30,0));
        mangas.add(new Manga(3L,"Pokemon",40,10));
        mangas.add(new Manga(5L,"Naruto",50,25));
        mangas.add(new Manga(5L,"Naruto",60,100));

        mangas.forEach(System.out::println);

        System.out.println("-".repeat(25));
        Manga naruto = new Manga(5L,"Naruto",30,25);

        // Lower <
        // Floor <=
        // higher >
        // ceiling >=

        System.out.println(mangas.lower(naruto));
        System.out.println(mangas.floor(naruto));
        System.out.println(mangas.ceiling(naruto));
        System.out.println(mangas.higher(naruto));


        System.out.println(mangas.size());
        System.out.println(mangas.pollLast());
        System.out.println(mangas.size());
    }
}
