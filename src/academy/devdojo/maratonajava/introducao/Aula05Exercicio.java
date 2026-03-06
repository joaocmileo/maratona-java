package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;
public class Aula05Exercicio {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu salário");
        double salario = sc.nextInt();
        double salarioTaxado;
        if (salario < 34713){
            salarioTaxado = salario * 0.0970;
            salarioTaxado = salario - salarioTaxado;
        } else if (salario < 68508) {
            salarioTaxado = salario * 0.3735;
            salarioTaxado = salario - salarioTaxado;

        }else {
            salarioTaxado = salario * 0.4950;
            salarioTaxado = salario - salarioTaxado;

        }

        System.out.println("Seu salario era "+salario+" Mas depois das taxas ficaram "+salarioTaxado);



    }
}
