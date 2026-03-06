package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.testes;

import academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTestes04 {
    static void main() {
        Calculadora calc = new Calculadora();

        int [] arrays = {1,2,3,4,5};

        calc.somaDeArrays(arrays);
        calc.somaDeVarargs(1,2,2,3,3,4,5,5);

    }


}
