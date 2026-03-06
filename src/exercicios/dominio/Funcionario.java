package exercicios.dominio;

public class Funcionario {
    /* Crie uma classe funcionário com os seguintes atributos
        nome
        idade
        salario// três salários devem ser guardados

        Crie dois metodos

        1- Para imprimir os dados
        2- Para tirar a média dos salários e imprimir o resultado
     */
    private String nome;
    private int idade;
    private double[] salario = new double[3];
    private double media;


    public void imprime(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        for (int i = 0; i < this.salario.length; i++) {
            System.out.println("Mês "+(i+1)+" Salário: "+this.salario[i]);
        }
    }

    public void mediaImprimir(){
        for (double i: this.salario){
            media+=i;
        }
        System.out.println(media /= this.salario.length);

    }

    //Setters


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    //Getters


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public double getMedia() {
        return media;
    }
}
