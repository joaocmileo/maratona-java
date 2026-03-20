package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterTest01 {
    static void main() {
        File file = new File("arquivo.txt");

        try(FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("DevDojo É PICAAAA NEGUUINNN");
            bw.newLine();
            bw.flush();
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
