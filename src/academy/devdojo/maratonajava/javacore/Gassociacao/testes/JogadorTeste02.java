package academy.devdojo.maratonajava.javacore.Gassociacao.testes;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    static void main() {
        Time time = new Time("Corinthians");
        Jogador jogador = new Jogador("YURIIII ALBERTOOO");
        jogador.imprime();
        jogador.setTime(time);
        jogador.imprime();

    }
}
