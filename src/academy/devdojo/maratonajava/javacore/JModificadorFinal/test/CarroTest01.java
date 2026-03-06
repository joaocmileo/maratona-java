package academy.devdojo.maratonajava.javacore.JModificadorFinal.test;

import academy.devdojo.maratonajava.javacore.JModificadorFinal.domain.Carro;
import academy.devdojo.maratonajava.javacore.JModificadorFinal.domain.Comprador;

public class CarroTest01 {
    static void main() {
        Carro carro = new Carro();
        Comprador comprador = new Comprador();
        System.out.println(Carro.VELOCIDADE_MAXIMA);
        System.out.println(Carro.COMPRADOR.getNome());
        Carro.COMPRADOR.setNome("João Paulo");
        System.out.println(Carro.COMPRADOR.getNome());
    }
}
