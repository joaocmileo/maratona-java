package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class ListAllFiles extends SimpleFileVisitor<Path>{
    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (file.getFileName().toString().endsWith(".java")){
           // System.out.println(file.getFileName());
        }
        return FileVisitResult.CONTINUE;
    }

    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
        System.out.println("Pre: "+dir.getFileName());
        return FileVisitResult.SKIP_SUBTREE;
    }

    @Override
    public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
        return super.visitFileFailed(file, exc);
    }

    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
       // System.out.println("Post: "+dir.getFileName());
        return FileVisitResult.CONTINUE;
    }
}

public class SimpleFileVisitorTest02 {
    static void main() throws IOException {

        Path path = Paths.get(".");
        Files.walkFileTree(path, new ListAllFiles() );
    }
}
