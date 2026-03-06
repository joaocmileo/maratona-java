package academy.devdojo.maratonajava.javacore.Minterfaces.test;

import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataBaseLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.DataLoader;
import academy.devdojo.maratonajava.javacore.Minterfaces.domain.FileLoader;

public class DataLoaderTest01 {
    static void main() {
        DataBaseLoader dbl = new DataBaseLoader();
        FileLoader fl = new FileLoader();

        DataBaseLoader.retrivemaxDataSize();
        DataLoader.retriveMaxDataSize();

    }
}
