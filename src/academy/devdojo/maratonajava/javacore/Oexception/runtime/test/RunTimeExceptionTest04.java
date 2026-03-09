package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.*;
import java.sql.SQLDataException;

public class RunTimeExceptionTest04 {
    static void main() {
        try {
            throw new ArithmeticException("Eita");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do Array");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro do index");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do Illegal");
        }catch (RuntimeException e){
            System.out.println("Dentro do runTime");
        }

        try{
            talvezLanceExcecao();
        }catch (SQLDataException | FileNotFoundException e){
            System.out.println("Deu erro");
        }

    }
    public static void talvezLanceExcecao() throws SQLDataException, FileNotFoundException {
        try {
            throw new SQLDataException("Eita");
        }catch ( IndexOutOfBoundsException | IllegalArgumentException e){
            System.out.println("Dentro do multi catch que faz a mesma coisa");
        }catch (RuntimeException e ){
            System.out.println("Dentro do runTime");
        }
    }
}
