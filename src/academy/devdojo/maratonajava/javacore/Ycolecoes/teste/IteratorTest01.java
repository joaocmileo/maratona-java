package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorTest01 {
    static void main() {

        List<Manga> mangas = new LinkedList<>();

        mangas.add(new Manga(1L,"Nanatsu Taisai",19,2));
        mangas.add(new Manga(4L,"Demon's Slayer",15,4));
        mangas.add(new Manga(2L,"Attack on Titan",5,0));
        mangas.add(new Manga(3L,"Pokemon",55,10));
        mangas.add(new Manga(5L,"Naruto",90,0));
        mangas.add(new Manga(5L,"Naruto",90,3));

//        for (Manga manga : mangas) {
//            if (manga.getQuantidade() == 0){
//                mangas.remove(manga);
//            }
//        }
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        System.out.println("-".repeat(25));
        Iterator<Manga> mangaIterator = mangas.iterator();

//        while (mangaIterator.hasNext()){
//            if (mangaIterator.next().getQuantidade() == 0){
//                mangaIterator.remove();
//            }
//        }
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
