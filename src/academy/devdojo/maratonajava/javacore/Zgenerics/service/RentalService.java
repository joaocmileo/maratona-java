package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;

import java.util.ArrayList;
import java.util.List;

public class RentalService<T> {
    private List<T> objetosDisponiveis = new ArrayList<>();

    public RentalService(List<T> objetosDisponiveis) {
        this.objetosDisponiveis = objetosDisponiveis;
    }

    public T alugarObjeto(){
        T t = objetosDisponiveis.removeFirst();

        System.out.println("Carro alugado: "+ t);
        System.out.println("Carros Disponíveis: ");
        System.out.println(objetosDisponiveis);
        return t;
    }
    public void devolverObjeto(T t){
        System.out.println("Devolvendo carro: "+ t);
        System.out.println("Lista de carros disponíveis antiga: "+ objetosDisponiveis);
        objetosDisponiveis.add(t);
        System.out.println("Lista de carros disponíveis atual: "+ objetosDisponiveis);
    }

}
