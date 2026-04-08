package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.domain.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest01 {
    static void main() {
        CarroRentavelService carroRentavelService = new CarroRentavelService();
        BarcoRentavelService barcoRentavelService = new BarcoRentavelService();

        Carro carroAlugado = carroRentavelService.alugarCarro();
        System.out.println("-".repeat(25));
        System.out.println("Carro alugado para a temporada:1");
        System.out.println("-".repeat(25));
        carroRentavelService.devolverCarro(carroAlugado);
        System.out.println("-".repeat(25));

       Barco barcoAlugado = barcoRentavelService.alugarBarco();
        System.out.println("-".repeat(25));
        System.out.println("Barco alugado por dia:");
        System.out.println("-".repeat(25));
        barcoRentavelService.devolverBarco(barcoAlugado);
        System.out.println("-".repeat(25));

    }
}
