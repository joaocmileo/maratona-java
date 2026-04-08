package academy.devdojo.maratonajava.javacore.Zgenerics.service;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;

import java.util.ArrayList;
import java.util.List;


    public class BarcoRentavelService {
        List<Barco> BarcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Iate")));

        public Barco alugarBarco(){
            Barco Barco = BarcosDisponiveis.removeFirst();

            System.out.println("Barco alugado: "+ Barco.getMarca());
            System.out.println("Barcos Disponíveis: ");
            System.out.println(BarcosDisponiveis);
            return Barco;
        }
        public void devolverBarco(Barco Barco){
            System.out.println("Devolvendo Barco: "+ Barco.getMarca());
            System.out.println("Lista de Barcos disponíveis antiga: "+ BarcosDisponiveis);
            BarcosDisponiveis.add(Barco);
            System.out.println("Lista de Barcos disponíveis atual: "+ BarcosDisponiveis);
        }
    }

