package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest02 {
    static void main() {

        Manga nanatsuTaisai = new Manga(1L, "Nanatsu Taisai", 10, 2);
        Manga demons = new Manga(4L, "Demon's Slayer", 20, 4);
        Manga attackOnTitan = new Manga(2L, "Attack on Titan", 30, 0);
        Manga pokemon = new Manga(3L, "Pokemon", 40, 10);
        Manga naruto = new Manga(5L, "Naruto", 50, 25);

        Consumidor consumidor1 = new Consumidor("John Paul");
        Consumidor consumidor2 = new Consumidor("William Suane");

        HashMap<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1,nanatsuTaisai);
        consumidorManga.put(consumidor2,attackOnTitan);

        for (Consumidor cons : consumidorManga.keySet()){
            System.out.println(cons.getName()+ " --- " + consumidorManga.get(cons).getNome());
        }


        System.out.println("-".repeat(25));
        for (Map.Entry<Consumidor, Manga> consumidorMangaEntry : consumidorManga.entrySet()) {
            System.out.println(consumidorMangaEntry.getKey().getName() + " --- "+consumidorMangaEntry.getValue().getNome());
        }


    }
}
