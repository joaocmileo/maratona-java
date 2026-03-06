package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main (String[] args){
        //Operadores aritmeticos + - / *

        float num1 = 10;
        float num2 = 20;
        float resSoma = num1 + num2;
        float resSubtracao = num1 - num2;
        float resDivisao = num1 / num2  ;
        float resMultiplicacao = num1 * num2;

        /*System.out.println(resSoma);
        System.out.println(resSubtracao);
        System.out.println(resDivisao);
        System.out.println(resMultiplicacao);
        */

        //%
        int resto = 10%2;
        System.out.println(resto);

        // < > <= >= !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteQueVinte = 10 != 20;

        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteQueVinte);
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);

        // && (AND) || (OR)  ! (NOT)

        int idade = 18;
        float salario = 3500f;

        boolean IsDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean IsDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("IsDentroDaLeiMenorQueTrinta "+ IsDentroDaLeiMenorQueTrinta);
        System.out.println("IsDentroDaLeiMaiorQueTrinta "+ IsDentroDaLeiMaiorQueTrinta);

        float valorContaInter = 0f;
        float valorContaMercadoPago = 2800f;
        float valorRx9060XT = 2500;

        boolean is9060Compravel = valorContaInter >= valorRx9060XT || valorContaMercadoPago >= valorRx9060XT;

        System.out.println(is9060Compravel);

        // Atribuição = += -= /= */ %=

        float bonus = 1800f;
        bonus += 100;
        System.out.println(bonus);
        bonus -= 100;
        System.out.println(bonus);
        bonus *= 2;
        System.out.println(bonus);
        bonus /= 2;
        System.out.println(bonus);
        bonus %= 2;
        System.out.println(bonus);

        // ++ --

        int contador = 0;
        System.out.println(contador++);
        System.out.println(contador);
        System.out.println(++contador);
        System.out.println(contador--);
        System.out.println(contador);
        System.out.println(--contador);






    }
}
