package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.*;
import java.util.regex.Matcher;

public class PathMatcherTest01 {
    static void main() {
        Path path1 = Paths.get("testando/testes/testadores.txt");
        Path path2 = Paths.get("testando/testes/testadores.java");
        Path path3 = Paths.get("testando/testes/testadores.exe");
        Path path4 = Paths.get("testando/testes/testadores.lgbt");
        String glob = "glob:**.???";

        matches(path1,glob);
        matches(path2,glob);
        matches(path3,glob);
        matches(path4,glob);
    }
    private static void matches(Path path,String glob){
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(glob);
        System.out.println(glob + ": "+matcher.matches(path));
    }
}
