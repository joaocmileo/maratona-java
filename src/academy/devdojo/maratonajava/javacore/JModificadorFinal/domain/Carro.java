package academy.devdojo.maratonajava.javacore.JModificadorFinal.domain;

public  class Carro {
    public static final int  VELOCIDADE_MAXIMA = 250;
    public static final Comprador COMPRADOR = new Comprador();

    public final void imprime(){
        System.out.println("Carro");
    }


}
