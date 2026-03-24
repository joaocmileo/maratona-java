package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    static void main() throws IOException {
        Path d1 = Paths.get("pasta");
        Path subPasta = Paths.get("pasta/subpasta/subsubpasta");
        // if (Files.notExists(subPasta)){
        // Files.createDirectory(subPasta);
        // }
        Files.createDirectories(subPasta);
        Path arquivo = Paths.get(subPasta.toString(),"arquivo.txt");
        if (Files.notExists(arquivo)){
            Files.createFile(arquivo);
        }
        Path source = Paths.get(arquivo.toString());
        Path target = Paths.get(arquivo.getParent().toString(),"arquivo_renomeado.txt");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);

    }
}
