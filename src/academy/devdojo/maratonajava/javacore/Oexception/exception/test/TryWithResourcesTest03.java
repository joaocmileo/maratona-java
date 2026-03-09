package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor01;
import academy.devdojo.maratonajava.javacore.Oexception.exception.domain.Leitor02;

import java.io.*;

public class TryWithResourcesTest03 {
    static void main() {

        lerArquivo2();
        lerArquivo();

    }

    public static void lerArquivo2(){
        try(Leitor01 leitor01 = new Leitor01();
            Leitor02 leitor02 = new Leitor02()){

        }catch (IOException e){
            System.out.println("Corrigindo");
        }
    }

    public static void lerArquivo(){
        Reader reader = null;
        try{
            reader = new BufferedReader(new FileReader("Arquivo.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                if (reader != null){
                    reader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
