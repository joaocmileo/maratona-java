package academy.devdojo.maratonajava.javacore.Gassociacao.testes;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    static void main() {
        Time corinthians = new Time("Corinthians");
        Jogador jogador1 = new Jogador("Yuri Alberto",corinthians);
        Jogador jogador2 = new Jogador("Hugo Souza",corinthians);
        Jogador jogador3 = new Jogador("Gabriel Paulista",corinthians);
        Jogador jogador4 = new Jogador("Carrilo",corinthians);

        Jogador[] jogadores = {jogador1,jogador2,jogador3,jogador4};

        corinthians.setJogadores(jogadores);

        corinthians.imprime();


    }
}
