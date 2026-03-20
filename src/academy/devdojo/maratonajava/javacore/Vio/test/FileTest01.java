package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FileTest01 {
    static void main() {

        File file = new File("arquivo.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("IsCreated: "+isCreated);
            System.out.println("Path: "+file.getPath());
            System.out.println("Path absolute: "+file.getAbsoluteFile());
            System.out.println("IsDirectory: "+file.isDirectory());
            System.out.println("IsFile: "+file.isFile());
            System.out.println("Last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            System.out.println("IsHidden: "+file.isHidden());
            boolean isExists = file.exists();
            if (isExists){
                System.out.println("IsDeleted: "+file.delete());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
