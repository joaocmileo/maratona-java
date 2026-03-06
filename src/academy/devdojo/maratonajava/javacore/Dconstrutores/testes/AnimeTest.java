package academy.devdojo.maratonajava.javacore.Dconstrutores.testes;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    static void main() {
        Anime anime = new Anime("Demon slayer","TV",63,"Ação");
        Anime anime2 = new Anime("Nanatsu Taisai","TV",96,"Aventura-Fantasia","Studio Deen");

        anime.imprime();
        System.out.println("-".repeat(50));
        anime2.imprime();
    }



}
