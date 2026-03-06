package academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.Exercicio.domain.Seminario;

public class Testes {
    static void main() {
        Local local = new Local("Rua edmundo mercer");
        Aluno aluno = new Aluno("João Paulo",18);
        Aluno aluno01 = new Aluno("Gabriel",18);
        Professor professor = new Professor("Marcio","Geografia");
        Aluno[] alunos = {aluno01,aluno};
        Seminario seminario = new Seminario("Geografia do Paraná",alunos,local);
        Seminario[] seminarios = {seminario};

        professor.setSeminario(seminarios);

        professor.relatorio();




    }
}
