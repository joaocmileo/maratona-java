package academy.devdojo.maratonajava.javacore.URegex.test;

public class ScannerTest01 {
    static void main() {

        String texto = "Lula, Bolsonaro, Lulinha, Flavio Bolsonaro, Vorcaro, Alexandre de Morais, Dilma, Renan Santos, Kim Kataguiri";
        String[] res = texto.split(",");
        for (String i:res){
            System.out.println(i.trim());
        }
    }
}
