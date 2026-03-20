package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    static void main() {
        File folder = new File("Arquivos");
        boolean isFolderCreated = folder.mkdir();
        System.out.println(isFolderCreated);

        File file = new File(folder, "testando.txt");

        try {
            boolean isFileCreated = file.createNewFile();
            System.out.println(isFileCreated);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        File fileRenomed = new File(folder, "arquivoRenomed.txt");
        boolean isRenomedFile = file.renameTo(fileRenomed);
        System.out.println(isRenomedFile);
        File folderRenomed = new File("ArquivosRenomed");
        boolean isRemoedFolder = folder.renameTo(folderRenomed);
    }
}
