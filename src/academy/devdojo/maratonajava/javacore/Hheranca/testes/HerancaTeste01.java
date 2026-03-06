package academy.devdojo.maratonajava.javacore.Hheranca.testes;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    static void main() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua edmundo mercer");
        endereco.setCep("84280-056");
        Pessoa pessoa = new Pessoa("João Paulo Cruz Mileo");
        pessoa.setCpf("10779030907");
        pessoa.setEndereco(endereco);
        Funcionario func = new Funcionario("João paulo");
        func.setCpf("10779030907");
        func.setEndereco(endereco);
        func.setSalario(18000);

        pessoa.imprime();
        System.out.println("-".repeat(30));
        func.imprime();


    }
}
