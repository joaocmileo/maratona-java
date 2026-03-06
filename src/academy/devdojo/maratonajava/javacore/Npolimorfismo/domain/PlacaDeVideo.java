package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class PlacaDeVideo extends Produto{

    public static final double IMPOSTO = 0.21;

    public PlacaDeVideo(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto(){
        return this.valor * IMPOSTO;
    }

}
