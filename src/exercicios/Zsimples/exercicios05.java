package exercicios.Zsimples;
import java.util.Scanner;

public class exercicios05 {
    static void main() {
        Scanner sc =new Scanner(System.in);
        double res = 0;

        while (true){

            System.out.println("Digite um número (Digite 0 para sair): ");
            double num1 = sc.nextDouble();
            if (num1 == 0 ){
                break;
            }else {
                res += num1;
            }


        }
        System.out.println("Resultado das somas de todos os números digitados é: "+res);
        sc.close();
    }
}
