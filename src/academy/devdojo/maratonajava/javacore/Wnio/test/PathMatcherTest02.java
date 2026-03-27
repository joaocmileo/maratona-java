package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class PathMatcherTest02 {
    static void main() throws IOException {
        Path path1 = Paths.get(".");
        Files.walkFileTree(path1,new FindFiles());
    }
    static class FindFiles extends SimpleFileVisitor<Path> {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:**/*Test*.{java,class}");

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
            if (matcher.matches(file)){
                System.out.println(file.getFileName());
            }
            return FileVisitResult.CONTINUE;
        }
    }
}
