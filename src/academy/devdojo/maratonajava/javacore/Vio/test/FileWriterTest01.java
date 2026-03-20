package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.*;
// File
// FileWriter
// FileReader
// BufferedWrite
// BufferedReader
public class FileWriterTest01 {
    static void main() {
        File file = new File("arquivo.txt");
        try(FileWriter fw = new FileWriter(file,true)) {
            boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: "+isCreated);
            fw.write("DEVDOJO É FODAAAA\n");
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileReader fr = new FileReader(file)){
            String texto = String.valueOf(fr.readAllLines());
            System.out.println(texto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
