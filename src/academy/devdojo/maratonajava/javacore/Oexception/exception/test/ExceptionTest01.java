package academy.devdojo.maratonajava.javacore.Oexception.exception.test;


import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    static void main() {

        CriarArquivo();


    }
    public static void CriarArquivo(){
        File file = new File("arquivo\\arquivo.txt");

        try {
            boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado!");
        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("Teste que o código continuou por aqui");
    }

}
