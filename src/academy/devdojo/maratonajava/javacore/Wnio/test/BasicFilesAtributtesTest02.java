package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

public class BasicFilesAtributtesTest02 {
    static void main() throws IOException {
        Path path = Paths.get("teste/atributes.txt");
        if (!Files.exists(path)){
            Files.createFile(path);
        }
        BasicFileAttributes bs = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(bs.lastAccessTime());
        System.out.println(bs.lastModifiedTime());
        System.out.println(bs.creationTime());
        System.out.println("-".repeat(100));
        BasicFileAttributeView bv = Files.getFileAttributeView(path,BasicFileAttributeView.class);
        FileTime lastAcess = FileTime.fromMillis(System.currentTimeMillis());


        bv.setTimes(bs.lastModifiedTime(),bs.lastAccessTime(),lastAcess);
        bs = Files.readAttributes(path, BasicFileAttributes.class);
        System.out.println(bs.lastAccessTime());
        System.out.println(bs.lastModifiedTime());
        System.out.println(bs.creationTime());

    }
}
