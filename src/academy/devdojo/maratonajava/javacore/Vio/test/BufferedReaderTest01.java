package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest01 {
    static void main() {
        File file = new File("arquivo.txt");
        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr)){
            String texto;
            while ((texto = br.readLine()) != null){
                System.out.println(texto);
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
