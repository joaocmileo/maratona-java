package academy.devdojo.maratonajava.javacore.Gassociacao.testes;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;

public class JogadorTeste01 {
    static void main() {


        Jogador jg1 = new Jogador("Hugo Souza");
        Jogador jg2 = new Jogador("Matheus Bidu");
        Jogador jg3 = new Jogador("Matheuzinho");
        Jogador jg4 = new Jogador("Gustavo Henrique");
        Jogador jg5 = new Jogador("Gabriel Paulista");
        Jogador jg6 = new Jogador("Raniele");
        Jogador jg7 = new Jogador("Carrilo");
        Jogador jg8 = new Jogador("Matheus Pereira");
        Jogador jg9 = new Jogador("Breno Bidon");
        Jogador jg10 = new Jogador("Memphis Depay");
        Jogador jg11 = new Jogador("Yuri Alberto");

        Jogador[] timeCorinthians = {jg1,jg2,jg3,jg4,jg5,jg6,jg7,jg8,jg9,jg10,jg11};

        for (Jogador jogador: timeCorinthians){
            jogador.imprime();
        }


    }

}
