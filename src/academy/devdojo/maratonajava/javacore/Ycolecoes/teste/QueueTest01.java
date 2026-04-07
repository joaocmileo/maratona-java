package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import academy.devdojo.maratonajava.javacore.Ycolecoes.domain.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest01 {


    static void main() {
        Queue<Manga> mangas = new PriorityQueue<>(new MangaSortPrice().reversed());
//        fila.add("A");
//        fila.add("D");
//        fila.add("C");
//        fila.add("B");
//
//        for (String s : fila) {
//            System.out.println(s);
//        }
//        System.out.println("-".repeat(25));
//        while (!fila.isEmpty()){
//            System.out.println(fila.poll());
//        }

        mangas.add(new Manga(1L,"Nanatsu Taisai",10,2));
        mangas.add(new Manga(4L,"Demon's Slayer",20,4));
        mangas.add(new Manga(2L,"Attack on Titan",30,0));
        mangas.add(new Manga(3L,"Pokemon",40,10));
        mangas.add(new Manga(5L,"Naruto",50,25));

        while(!mangas.isEmpty()){
            System.out.println(mangas.poll());

        }


    }

}
