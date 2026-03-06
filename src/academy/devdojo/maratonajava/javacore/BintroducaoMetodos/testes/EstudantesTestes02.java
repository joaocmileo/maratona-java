package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.testes;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;

public class EstudantesTestes02 {
    static void main() {

        Estudante est = new Estudante();

        est.nome = "João Paulo";
        est.idade = 18;
        est.sexo = 'M';

        est.imprime();


    }
}
