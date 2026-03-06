package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais02 {
    static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        String categoria;
        System.out.println("Qual sua idade?");
        int idade = sc.nextInt();

        if(idade <15){
            categoria = "Infantil";
        } else if (idade >= 15 && idade < 18 ) {
            categoria = "Juvenil";
        }else {
            categoria = "adulto";
        }
        String texto = "Sua categoria é " + categoria;

        System.out.println(texto);
    }
}
