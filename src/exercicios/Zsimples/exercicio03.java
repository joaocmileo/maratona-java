package exercicios.Zsimples;
import java.util.Scanner;


public class exercicio03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double num1;
        boolean isContinue = true;

        while(isContinue){
            System.out.println("O que deseja fazer? (1- Par/Impar || 2- sair)");
            int opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("Digite um número:");
                    num1 = sc.nextDouble();
                    if (num1%2 == 0){
                        System.out.println("Número: "+num1+" é par!");
                    }else {
                        System.out.println("Número: "+num1+" é impar!");
                    }break;
                case 2:
                    System.out.println("Saindo...");
                    isContinue = false;
                    break;
                default:
                    System.out.println("Opção invalida");

            }


        }



    }

}
