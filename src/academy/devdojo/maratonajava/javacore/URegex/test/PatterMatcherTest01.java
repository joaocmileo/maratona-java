package academy.devdojo.maratonajava.javacore.URegex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatterMatcherTest01 {
    static void main() {
        //d = Todos os Dígitos
        //D = Tudo que não for dígito
        //s = Espaços em branco /t /n /f /r
        //S = Todos os caracteres excluindo os brancos
        //w = a-z, A-Z, dígitos, _
        //W = Tudo que não está no /w


        String regex1 = "(?i)Corinthian[as|o|s]?";
        String regex = "\\S";
        String texto = "O Corinthians: Um Estado de Espírito\n" +
                "Fundado em 1910 sob a luz de um lampião no bairro do Bom Retiro, o Corinthians nasceu com o DNA da resistência. Criado por operários, ele foi o primeiro clube de São Paulo a abrir as portas para as classes populares, desafiando a elite da época. Desde aquele 1º de setembro, ficou claro: o \"Timão\" não seria escolhido por quem buscava apenas troféus, mas por quem se identificava com a luta diária.\n" +
                "\n" +
                "A Mística do Sofrimento e a Redenção\n" +
                "Para o corinthiano, o sofrimento não é um peso, é um combustível. O período de 23 anos sem títulos (entre 1954 e 1977) não diminuiu a torcida; pelo contrário, a multiplicou. Foi nesse intervalo que nasceu o mito da \"Fiel\", uma torcida que não torce por vitórias, mas torce pelo clube. A quebra desse jejum com o gol de Basílio, em 77, é talvez o momento mais catártico da história do esporte brasileiro — a libertação de um povo.\n" +
                "\n" +
                "Democracia e Identidade\n" +
                "Nenhum outro clube se envolveu tanto com o tecido social do país quanto o Corinthians. Nos anos 80, a Democracia Corinthiana, liderada por figuras icônicas como Sócrates, Casagrande e Wladimir, mostrou que um time de futebol poderia ser o epicentro de um movimento político pelo fim da ditadura militar. O Corinthians não jogava apenas bola; ele pedia \"Diretas Já\".\n" +
                "\n" +
                "O Topo do Mundo\n" +
                "Depois de décadas de espera pela glória continental, o Corinthians provou que sabe fazer as coisas do seu jeito: com drama. A conquista da Libertadores invicta em 2012 e o subsequente Mundial de Clubes no Japão foram o ápice técnico e emocional. Ver 30 mil loucos atravessarem o planeta para invadir Yokohama é a prova definitiva de que a lógica geográfica não se aplica a essa torcida.\n" +
                "\n" +
                "\"Ser corinthiano é ir além de ser ou não ser o primeiro. É ser o único.\" — Adaptado de diversas vozes da Fiel.\n" +
                "\n" +
                "O que define o Corinthians hoje:\n" +
                "A Neo Química Arena: Um caldeirão moderno que mantém a pressão de um terreiro de jogo.\n" +
                "\n" +
                "O \"Jogar à Corinthians\": Aquela vitória por 1 a 0, aos 48 do segundo tempo, com um gol de canela, que dá mais prazer do que uma goleada fácil.\n" +
                "\n" +
                "A Camisa: Que, segundo o ditado popular, \"não se bate, se lava com suor\".\n" +
                "\n" +
                "Ser Corinthians é entender que o domingo é mais feliz quando o preto e branco prevalece, e que, independentemente da fase, a frase \"Vai Corinthians!\" é um cumprimento, uma despedida e uma oração.";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Texto original: "+texto);
       // System.out.println("Indices:        0123456789");
        System.out.println("Regex: "+ regex);
        System.out.println("Posições encontradas: ");
        while(matcher.find()){
            //System.out.println("Índice: " + matcher.start() + " | Valor: " + matcher.group()+"| Final: "+matcher.end());
            System.out.print(matcher.group());


    }
}}
