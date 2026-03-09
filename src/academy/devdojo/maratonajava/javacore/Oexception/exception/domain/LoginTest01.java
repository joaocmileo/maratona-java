package academy.devdojo.maratonajava.javacore.Oexception.exception.domain;

import java.util.Scanner;

public class LoginTest01 {
    static void main() {
        try {
            logar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }

    }
    public static void logar() throws LoginInvalidoException{
        Scanner teclado = new Scanner(System.in);
        String usuarioDB = "Joao";
        String senhaDB = "2409";
        System.out.println("Login");
        String usarnameDigita = teclado.nextLine();
        System.out.println("Senha");
        String senhaDigitada = teclado.nextLine();
        if (!usuarioDB.equals(usarnameDigita) || !senhaDB.equals(senhaDigitada) ){
            throw new LoginInvalidoException("Usuario ou Senha invalida!");
        }
        System.out.println("Logado com sucesso");


    }
}
