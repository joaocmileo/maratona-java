package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class CarroRentavelService {
    List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Fiat"),new Carro("Volvo")));

    public Carro alugarCarro(){
        Carro carro = carrosDisponiveis.removeFirst();

        System.out.println("Carro alugado: "+ carro.getMarca());
        System.out.println("Carros Disponíveis: ");
        System.out.println(carrosDisponiveis);
        return carro;
    }
    public void devolverCarro(Carro carro){
        System.out.println("Devolvendo carro: "+ carro.getMarca());
        System.out.println("Lista de carros disponíveis antiga: "+ carrosDisponiveis);
        carrosDisponiveis.add(carro);
        System.out.println("Lista de carros disponíveis atual: "+ carrosDisponiveis);
    }


}
