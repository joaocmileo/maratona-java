package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.testes;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.ImprimeEstudante;

public class EstudantesTestes01 {

    static void main() {
        ImprimeEstudante imp = new ImprimeEstudante();
        Estudante estudante01 = new Estudante();

        estudante01.nome = "João";
        estudante01.idade = 18;
        estudante01.sexo = 'm';

        imp.imprimeEstudante(estudante01);


        System.out.println(estudante01.nome);


    }




}
