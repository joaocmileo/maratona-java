package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("home/joaop/texto.txt");
        PosixFileAttributeView pw = Files.getFileAttributeView(path, PosixFileAttributeView.class);
        Set<PosixFilePermission> permissoes = PosixFilePermissions.fromString("rw-rw-rw-");
        pw.setPermissions(permissoes);
        PosixFileAttributes ps = Files.readAttributes(path,PosixFileAttributes.class);
        System.out.println(ps.permissions());
    }
}
