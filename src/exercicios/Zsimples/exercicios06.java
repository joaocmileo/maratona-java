package exercicios.Zsimples;
import java.util.Scanner;

public class exercicios06 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] arrays = new int[5];

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Digite um número para salva-lo na array");
            arrays[i] = sc.nextInt();
        }
        for (int i = arrays.length-1; i >= 0 ; i--) {
            System.out.print(arrays[i]+",");

        }
        sc.close();
    }
}
