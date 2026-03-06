package academy.devdojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.IOException;

public class RunTimeExceptionTest03 {
    static void main() {
        abreConexao();

    }
    public static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Alterando dados do Arquivo");
            throw new IOException("Testando caso ocorra uma Exception");
            // return "Conexão aberta";
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando conexão");
        }
        return null;
    }
}
