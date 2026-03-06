package academy.devdojo.maratonajava.javacore.LclassesAbstratas.test;

import academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.LclassesAbstratas.domain.Gerente;

public class FuncionarioTest01 {
    static void main() {
        Desenvolvedor dev = new Desenvolvedor("João Paulo", 12000);
        Gerente gerente = new Gerente("Gabriel",10000);
        int[] test = {1,2,34};



        dev.calculaBonus();
        gerente.calculaBonus();
        System.out.println(dev);
        System.out.println(gerente);
    }


}
