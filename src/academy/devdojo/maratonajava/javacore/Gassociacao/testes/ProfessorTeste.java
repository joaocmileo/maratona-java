package academy.devdojo.maratonajava.javacore.Gassociacao.testes;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class ProfessorTeste {
    static void main() {
        Professor prof01 = new Professor("Márcio");
        Professor[] professores = {prof01};
        Escola escola = new Escola("Jose de Alencar",professores);

        escola.imprime();

    }

}
