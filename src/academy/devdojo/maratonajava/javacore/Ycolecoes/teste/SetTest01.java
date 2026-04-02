package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetTest01 {
    static void main() {

        Set<Manga> mangas = new LinkedHashSet<>();

        mangas.add(new Manga(1L,"Nanatsu Taisai",19,2));
        mangas.add(new Manga(4L,"Demon's Slayer",15,4));
        mangas.add(new Manga(2L,"Attack on Titan",5,0));
        mangas.add(new Manga(3L,"Pokemon",55,10));
        mangas.add(new Manga(5L,"Naruto",90,0));
        mangas.add(new Manga(5L,"Naruto",90,3));





    }
}
