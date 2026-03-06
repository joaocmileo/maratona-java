package exercicios.Zsimples;
import java.util.Scanner;
public class exercicio01 {
    static void main() {
        /* Exemplo de output
            Idade: 25
            Altura: 1.75
            Estudante: true
            Nome: João
         */


        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("Qual seu nome?");
        String nome = sc.nextLine();
        System.out.println("Qual sua altura? (Ex: 1.75)");
        double altura = sc.nextDouble();
        System.out.println("Você é estudande? (1 para sim/ 0 para não)");
        int estudante = sc.nextInt();
        boolean isStudent;
        switch (estudante){
            case 1:
                isStudent = true;
                break;
            default:
                isStudent = false;
                break;
        }
        sc.close();
        System.out.println("Nome: "+nome+"\nIdade: "+idade+"\nAltura: "+altura+"\nÉ estudante: "+isStudent);



    }
}
