package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest02 {
    static void main() {
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"),new Barco("Iate")));
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("Fiat"),new Carro("Volvo")));

        RentalService<Carro> rentalServiceCarro = new RentalService<>(carrosDisponiveis);
        RentalService<Barco> rentalServiceBarco = new RentalService<>(barcosDisponiveis);

        Carro carroAlugado =  rentalServiceCarro.alugarObjeto();
        System.out.println("_".repeat(25));
        rentalServiceCarro.devolverObjeto(carroAlugado);
        System.out.println("_".repeat(25));
        Barco barcoAlugado =  rentalServiceBarco.alugarObjeto();
        System.out.println("_".repeat(25));
        rentalServiceBarco.devolverObjeto(barcoAlugado);
        System.out.println("_".repeat(25));


    }
}
