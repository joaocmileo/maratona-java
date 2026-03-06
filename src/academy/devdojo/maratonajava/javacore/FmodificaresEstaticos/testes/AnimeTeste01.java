package academy.devdojo.maratonajava.javacore.FmodificaresEstaticos.testes;

import academy.devdojo.maratonajava.javacore.FmodificaresEstaticos.dominio.Anime;
import java.util.Arrays;


public class AnimeTeste01 {
    static void main() {
        Anime anime1 = new Anime("Attack on Titan");
        Anime anime2 = new Anime("One piece");
        Anime anime3 = new Anime("Nanatsu Taisai");

        System.out.println(Arrays.toString(anime1.getEpisodios()));

    }


}
