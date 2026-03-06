package exercicios.testes;

import exercicios.dominio.Funcionario;

public class funcionarioTest {
    static void main() {

        Funcionario funcionario = new Funcionario();


        funcionario.setNome("João");
        funcionario.setIdade(18);
        funcionario.setSalario(new double[]{1800,1900,3200});

        funcionario.imprime();
        funcionario.mediaImprimir();
    }

}
