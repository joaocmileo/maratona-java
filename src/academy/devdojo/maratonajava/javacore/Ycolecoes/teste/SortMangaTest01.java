package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MangaSortPrice implements Comparator<Manga> {

    @Override
    public int compare(Manga o1, Manga o2) {
        return Double.compare(o1.getPreco(),o2.getPreco());
    }
}

public class SortMangaTest01 {
    static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(1L,"Nanatsu Taisai",19));
        mangas.add(new Manga(4L,"Demon's Slayer",15));
        mangas.add(new Manga(2L,"Attack on Titan",5));
        mangas.add(new Manga(3L,"Pokemon",55));
        mangas.add(new Manga(5L,"Naruto",90));

        for (Manga manga: mangas){
            System.out.println(manga);
        }
        System.out.println("-".repeat(25));

        Collections.sort(mangas);
        for (Manga manga: mangas){
            System.out.println(manga);
        }
        System.out.println("-".repeat(25));
        Collections.sort(mangas);
        mangas.sort(new MangaSortPrice());
        for (Manga manga: mangas){
            System.out.println(manga);
        }
    }
}
