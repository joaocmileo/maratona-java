package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    static void main(String[] args) {
        Path dir = Paths.get("/home/joao/dev");
        Path testando = Paths.get("/home/joao/dev/arquivosConfidenciais/meudeus.png");
        System.out.println(dir.relativize(testando));
        System.out.println(testando.relativize(dir));

        Path absolute0 = Paths.get("/home/joao");
        Path absolute1 = Paths.get("/home/joao/dev");
        Path absolute2 = Paths.get("/user/system/x86");
        Path absolute3 = Paths.get("/attackShark");
        Path relativos0 = Paths.get("temp");
        Path relativos1 = Paths.get("temp/temp.248120");
        
        System.out.println("-".repeat(50));
        System.out.println(absolute0.relativize(absolute1));
        System.out.println(absolute1.relativize(absolute0));
        System.out.println(absolute1.relativize(absolute2));
        System.out.println(absolute2.relativize(absolute1));
        System.out.println(absolute3.relativize(absolute2));
        System.out.println(relativos0.relativize(relativos1));
        System.out.println(relativos1.relativize(relativos0));

    }
}
