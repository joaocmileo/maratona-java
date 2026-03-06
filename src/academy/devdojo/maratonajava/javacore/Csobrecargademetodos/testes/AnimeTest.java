package academy.devdojo.maratonajava.javacore.Csobrecargademetodos.testes;

import academy.devdojo.maratonajava.javacore.Csobrecargademetodos.dominio.Anime;

public class AnimeTest {
    static void main() {
        Anime anime = new Anime();

        anime.init("Demon slayer","TV",63,"Ação");
        anime.imprime();
    }


}
