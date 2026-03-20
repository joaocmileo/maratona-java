package academy.devdojo.maratonajava.javacore.URegex.test;

import java.util.Scanner;

public class ScannerTest02 {
    static void main() {

        String texto = "Lula, 13, 14, 17, 18, Bolsonaro, Lulinha, Flavio Bolsonaro, Vorcaro, Alexandre de Morais, Dilma, Renan Santos, Kim Kataguiri";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(",\\s*");

        while(sc.hasNext()){
            if (sc.hasNextInt()){
                int i = sc.nextInt();
                System.out.println("Int: "+i);
            }else {
            System.out.println(sc.next());}
        }
    }
}
