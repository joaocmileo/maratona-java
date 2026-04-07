package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapTest03 {
    static void main() {

        Consumidor consumidor1 = new Consumidor("John Paul");
        Consumidor consumidor2 = new Consumidor("William Suane");

        Manga nanatsuTaisai = new Manga(1L, "Nanatsu Taisai", 10, 2);
        Manga demons = new Manga(4L, "Demon's Slayer", 20, 4);
        Manga attackOnTitan = new Manga(2L, "Attack on Titan", 30, 0);
        Manga pokemon = new Manga(3L, "Pokemon", 40, 10);
        Manga naruto = new Manga(5L, "Naruto", 50, 25);


        List<Manga> mangasCons1 = new ArrayList<>(List.of(naruto,nanatsuTaisai));
        List<Manga> mangasCons2 = new ArrayList<>(List.of(pokemon,demons,attackOnTitan));

        HashMap<Consumidor,List<Manga>> consumidorMangasList = new HashMap<>();
        consumidorMangasList.put(consumidor1,mangasCons1);
        consumidorMangasList.put(consumidor2,mangasCons2);

        for (Map.Entry<Consumidor, List<Manga>> consumidorListEntry : consumidorMangasList.entrySet()) {
            System.out.println("-------" + consumidorListEntry.getKey().getName());
            for (Manga manga : consumidorListEntry.getValue()){
                System.out.println("----"+ manga.getNome());
            }
        }


    }
}
