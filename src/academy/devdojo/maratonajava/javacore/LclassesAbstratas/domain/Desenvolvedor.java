package academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome,double salario){
        super(nome,salario);
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
    public void calculaBonus(){
        this.salario = this.salario+ this.salario*0.05;
    }

}
