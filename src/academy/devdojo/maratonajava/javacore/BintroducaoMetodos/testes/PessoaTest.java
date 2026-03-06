package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.testes;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTest {
    static void main() {
        Pessoa ps = new Pessoa();

        ps.setIdade(18);
        ps.setNome("João");


        ps.imprime();

        System.out.println(ps.getNome());
        System.out.println(ps.getIdade());

    }
}
