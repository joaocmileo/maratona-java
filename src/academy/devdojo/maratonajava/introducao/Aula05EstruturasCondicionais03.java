package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;


public class Aula05EstruturasCondicionais03 {
    static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salário");
        double salario = sc.nextDouble();

        String resultado = salario < 3000 ? "Não posso doar" : "Posso doar para o devDejo";
        System.out.println(resultado);

    }
}
