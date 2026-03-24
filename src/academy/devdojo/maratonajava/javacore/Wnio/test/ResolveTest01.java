package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest01 {
    static void main() {
        Path path = Paths.get("/pasta");
        Path path1 = Paths.get("subpasta");
        Path path2 = Paths.get("subsubpasta/arquivo.txt");
        Path path3 = path1.resolve(path2);
        System.out.println(path.resolve(path3));
        System.out.println(path1.resolve(path2));
    }
}
