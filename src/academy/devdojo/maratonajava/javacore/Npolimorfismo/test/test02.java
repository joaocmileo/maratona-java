package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.MemoriaRam;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.PlacaDeVideo;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.service.RelatorioImposto;

public class test02 {
    static void main() {
        Produto placaDeVideo = new PlacaDeVideo("RX9060xt 16gb", 2699);
        MemoriaRam ram = new MemoriaRam("Juhor 16GB DDR5", 800, "6000Mhz");

        RelatorioImposto.impostoProduto(ram);
        RelatorioImposto.impostoProduto(placaDeVideo);



    }
}
