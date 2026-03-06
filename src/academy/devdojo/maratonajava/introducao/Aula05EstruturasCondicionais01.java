package academy.devdojo.maratonajava.introducao;
import java.util.Scanner;

public class Aula05EstruturasCondicionais01 {
    static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        if(idade >= 18){
            System.out.println("Ta podendo comprar bebida alcoolica");
        }else {
            System.out.println("Pode não bb");
        }



    }

}
