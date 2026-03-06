package exercicios.Zsimples;

import java.util.Scanner;





public class Exercicio02 {

    static void main() {

/*

Soma: 15

Subtração: -3

Multiplicação: 50

Média: 12.5

*/

        Scanner sc = new Scanner(System.in);

        double num1 = 0;

        double num2 = 0;

        double res = 0;

        int exit = 0;

        String textNum1 = "Digite o primeiro número";

        String textNum2 = "Digite o segundo número";


        System.out.println("Qual operação deseja? (1- Soma/2-Subtração/3-Multiplicação/4-Média/5-Sair)");

        int operacao = sc.nextInt();


        while (exit == 0) {

            switch (operacao) {

                case 1:

                    System.out.println(textNum1);

                    num1 = sc.nextDouble();

                    System.out.println(textNum2);

                    num2 = sc.nextDouble();

                    res = num1 + num2;

                    System.out.println(res);

                    break;

                case 2:

                    System.out.println(textNum1);

                    num1 = sc.nextDouble();

                    System.out.println(textNum2);

                    num2 = sc.nextDouble();

                    res = num1 - num2;

                    System.out.println(res);

                    break;

                case 3:

                    System.out.println(textNum1);

                    num1 = sc.nextDouble();

                    System.out.println(textNum2);

                    num2 = sc.nextDouble();

                    res = num1 * num2;

                    System.out.println(res);

                    break;

                case 4:

                    System.out.println(textNum1);

                    num1 = sc.nextDouble();

                    System.out.println(textNum2);

                    num2 = sc.nextDouble();

                    res = (num1 + num2) / 2;

                    System.out.println(res);

                    break;

                default:

                    exit = 1;

                    break;

            }

            System.out.println("Qual operação deseja? (1- Soma/2-Subtração/3-Multiplicação/4-Média/5-Sair)");

            operacao = sc.nextInt();


        }

        sc.close();


    }
}