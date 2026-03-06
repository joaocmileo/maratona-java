package academy.devdojo.maratonajava.javacore.Npolimorfismo.service;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.MemoriaRam;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.domain.Produto;

public abstract class RelatorioImposto {

    public static void impostoProduto(Produto produto){
        System.out.println("-".repeat(30));
        System.out.println("Produto: "+produto.getNome());
        if (produto instanceof MemoriaRam){
            System.out.println("Mhz:"+((MemoriaRam) produto).getMhz());
        }
        System.out.println("Valor do Produto (isento de imposto): "+produto.getValor());
        double valorImposto = produto.calcularImposto();
        double valorTotal = produto.getValor()+valorImposto;
        System.out.println("Valor do imposto a ser pago: "+valorImposto);
        System.out.println("Valor total a ser pago: "+valorTotal);
        System.out.println("-".repeat(30));
    }


}
