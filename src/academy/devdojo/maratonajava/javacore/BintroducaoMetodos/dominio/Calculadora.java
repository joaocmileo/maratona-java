package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Calculadora {

    public void somaDoisNumeros(int i, int j){
        System.out.println(i+j);
    }
    public void subtraiDoisNumeros(int i, int j){
        System.out.println(i-j);

    }
    public double multiplicaDoisNumeros(double i, double j){
        if (j == 0){
            return 0;
        }

        return i/j;
    }

    public void imprimeDoisNumuros(int i, int j){

        if (j  != 0 ){
            System.out.println(i + j);
            return;
        }
        System.out.println("Não é possivel dividir por 0 ");

    }
    public void somaDeArrays(int[] array){
        int soma = 0;
        for (int i: array){
            soma += i;

        }
        System.out.println(soma);
    }
    public void somaDeVarargs(int... arrays){
        int soma = 0;
        for (int i: arrays){
            soma += i;

        }
        System.out.println(soma);
    }


}
