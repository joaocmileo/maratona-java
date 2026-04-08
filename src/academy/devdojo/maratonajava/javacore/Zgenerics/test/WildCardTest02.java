package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildCardTest02 {

    static void main() {
        List<WildCardTest01.Animal> animals = new ArrayList<>();
        animals.add(new WildCardTest01.Gato());
        animals.add(new WildCardTest01.Cachorro());
        List<WildCardTest01.Cachorro> cachorros = new ArrayList<>(List.of(new WildCardTest01.Cachorro()));
        imprimirConsulta(animals);


    }

    // Somente leitura, ele nao aceita adicionar itens na lista.
    private static void imprimirConsulta(List<? extends WildCardTest01.Animal> animals){
        for (WildCardTest01.Animal animal : animals) {
            animal.consulta();
        }
}
    private static void imprimirConsultaAnimal(List<? super WildCardTest01.Animal> animals){
        animals.add(new WildCardTest01.Cachorro());
        animals.add(new WildCardTest01.Gato());

    }
}
