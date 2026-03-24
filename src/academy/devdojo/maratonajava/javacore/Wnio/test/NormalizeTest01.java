package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    static void main() throws IOException {
        String dir = ("home/./joao/./dev/./test.txt");
        String dir2 = ("/../../teste.txt");
//        if(!Files.exists(dir)){Files.createFile(dir);}
//        Files.delete(dir);
        Path path = Paths.get(dir,dir2);
        System.out.println(path.normalize());

    }
}
