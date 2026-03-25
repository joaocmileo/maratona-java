package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;

public class BasicFilesAtributtesTest01 {
    static void main() throws IOException {

    File file = new File("teste/testando.txt");
    file.createNewFile();
    LocalDateTime ld = LocalDateTime.now();

    file.setLastModified(ld.toInstant(ZoneOffset.UTC).getEpochSecond());
        System.out.println(ld.toEpochSecond(ZoneOffset.UTC));


    Path path = Paths.get("teste/test.txt");
    Instant instant = Instant.now().plus(10, ChronoUnit.DAYS);


    FileTime ft = FileTime.from(instant);
    Files.setLastModifiedTime(path,ft);


    }
}
