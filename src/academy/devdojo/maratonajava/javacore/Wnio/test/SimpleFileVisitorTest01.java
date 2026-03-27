package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class ListJavaFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith(".java")){
            System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest01 {
    static void main() throws IOException {

        Path path = Paths.get(".");
        Files.walkFileTree(path, new ListJavaFiles() );
    }
}
