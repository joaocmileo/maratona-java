package academy.devdojo.maratonajava.javacore.Gassociacao.testes;

import java.util.Scanner;

public class TesteScanner {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("O grande Programa que preve o futuro");
        String pergunta = sc.nextLine();

        if (Character.isUpperCase(pergunta.charAt(0))){
            System.out.println("Sim");
        }else{
            System.out.println("Não");
        }
    }

}
