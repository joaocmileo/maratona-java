package academy.devdojo.maratonajava.javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest02 {
    static void main() {
        //d = Todos os Dígitos
        //D = Tudo que não for dígito
        //s = Espaços em branco /t /n /f /r
        //S = Todos os caracteres excluindo os brancos
        //w = a-z, A-Z, dígitos, _
        //W = Tudo que não está no /w
        // []
        // ()
        // ? zero ou uma
        // + uma ou mais
        // * zero ou mais
        //{n, m} de n até m
        // |
        // $

        //String regex = "0[xX]([0-9a-fA-F])+\\b";
        //String texto = "0xABCj,0xABC,0x123G,0xFFF";
        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z]{2,})+)+";
        String texto = "joao@gmail. seloco@gmail.br, roberto@gmail.c.....br, tchetche@gamil@gmail.com.br, 231@gmail.escola.pr.gov@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto original: "+texto);
        System.out.println("Regex: "+ regex);
        System.out.println("Posições encontradas: ");
        while(matcher.find()){
            System.out.println(matcher.group());

    }
}}
