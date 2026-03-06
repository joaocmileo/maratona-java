package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RunTimeExceptionTest02 {
    static void main() {

        System.out.println(DividirPrimeiroJeito(10,0));
        System.out.println("Dividir primeiro continua");

       try {
           System.out.println(DividirTerceiroJeito(10,0));
       }catch (IllegalArgumentException e){
           e.printStackTrace();
       }
        System.out.println("Agora sim continua por que você tratou certo");
        System.out.println(DividirSegundoJeito(10,0));
        System.out.println("Dividir segundo não continua");


    }


    public static int DividirPrimeiroJeito(int a, int b){
        try {
            return a/b;
        }catch (RuntimeException e){
            e.printStackTrace();
        }return 0;
    }
    public static int DividirSegundoJeito(int a,int b){
        if (b == 0){
           throw  new IllegalArgumentException("Argumento ilegal, pode ser ser 0");
        }
        return a/b;
    }
    public static int DividirTerceiroJeito(int a, int b)throws IllegalArgumentException {
        if (b == 0){
            throw  new IllegalArgumentException("Argumento ilegal, pode ser ser 0");
        }
        return a/b;
    }
}
