package exercicios.Zsimples;
import java.util.Scanner;

public class exercicios04 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Até que número deseja que seja contado apenas em numeros pares?");
        double number = sc.nextDouble();

        for (int i =0;i <= number;i++){
            if (i%2!=0){
                continue;
            }
            System.out.println(i);
        }

        sc.close();
    }
}
