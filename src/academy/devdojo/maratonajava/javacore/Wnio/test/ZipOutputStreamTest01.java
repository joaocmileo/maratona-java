package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    static void main() {
        Path arquivoZip = Paths.get("/pasta/arquivoZipado.zip");
        Path arquivosParaZipar = Paths.get("/pasta/subpasta2/subsubpasta2");
        zip(arquivoZip,arquivosParaZipar);
    }
    public static void zip(Path arquivoZip, Path arquivosParaZipar){
        if (Files.notExists(arquivoZip)) {
            try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
                 DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {
                for (Path arquivos : directoryStream) {
                    ZipEntry zipEntry = new ZipEntry(arquivos.getFileName().toString());
                    zipOutputStream.putNextEntry(zipEntry);
                    Files.copy(arquivos, zipOutputStream);
                    zipOutputStream.closeEntry();
                }
                System.out.println("Arquivo criado com sucesso!");

            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }else System.out.println("Arquivo já existe.");
    }
}
