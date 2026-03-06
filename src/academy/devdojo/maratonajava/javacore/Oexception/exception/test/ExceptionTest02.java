package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    static void main() throws IOException{
        criarArquivo();
    }
    public static void criarArquivo() throws IOException {
        File file = new File("arquivo\\arquivotest.txt");
        try {
           boolean isCreate = file.createNewFile();
            System.out.println("Arquivo criado "+isCreate);
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }
}
