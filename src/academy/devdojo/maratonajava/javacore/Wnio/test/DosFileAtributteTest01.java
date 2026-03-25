package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DosFileAtributteTest01 {
    static void main() throws IOException {
        Path path = Paths.get("teste/dosFile.txt");
        if (Files.notExists(path))Files.createFile(path);
        Files.setAttribute(path,"dos:hidden",true);
        Files.setAttribute(path,"dos:readonly",true);
        System.out.println(Files.getAttribute(path,"dos:hidden"));
        System.out.println(Files.getAttribute(path,"dos:readonly"));
        Files.setAttribute(path,"dos:hidden",false);
        Files.setAttribute(path,"dos:readonly",false);
        System.out.println(Files.getAttribute(path,"dos:hidden"));
        System.out.println(Files.getAttribute(path,"dos:readonly"));


    }
}
