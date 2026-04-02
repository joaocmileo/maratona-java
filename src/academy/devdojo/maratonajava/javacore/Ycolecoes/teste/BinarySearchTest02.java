package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest02 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Nanatsu Taisai",19));
        mangas.add(new Manga(4L,"Demon's Slayer",15));
        mangas.add(new Manga(2L,"Attack on Titan",5));
        mangas.add(new Manga(3L,"Pokemon",55));
        mangas.add(new Manga(5L,"Naruto",90));
        mangas.add(new Manga(5L,"Dragon ball Z",32));
        mangas.add(new Manga(5L,"Spy family",142));
        mangas.add(new Manga(5L,"My hero Academy",20));
        mangas.sort(new MangaSortPrice());
        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        Manga mangaSearch = new Manga(5L,"Naruto",90);
        System.out.println(Collections.binarySearch(mangas,mangaSearch, new MangaSortPrice()));
    }
}
