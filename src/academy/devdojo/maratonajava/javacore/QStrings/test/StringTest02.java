package academy.devdojo.maratonajava.javacore.QStrings.test;

public class StringTest02 {
    static void main() {
        String nome = "       Eu quero toma Negroni, Para com isso agora, perereca                      ";
        System.out.println(nome.replace("r","l"));

        System.out.println(nome.charAt(1));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.substring(9));
        System.out.println(nome.length());
        System.out.println(nome.trim().charAt(1));


    }
}
