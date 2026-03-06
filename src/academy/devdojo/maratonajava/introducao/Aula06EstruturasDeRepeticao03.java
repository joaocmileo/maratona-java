package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    static void main() {

        int valorMax = 50;

        for (int i = 0; i < valorMax; i++) {
            if (i <= valorMax/2) {
                System.out.println(i);
            } else {
                break;
            }

        }
    }
}