package academy.devdojo.maratonajava.javacore.Npolimorfismo.domain;

public class MemoriaRam extends Produto {

    public static final double IMPOSTO = 0.25;
    protected String mhz;

    public MemoriaRam(String nome, double valor,String mhz) {
        super(nome, valor);
        this.mhz = mhz;
    }

    @Override

    public double calcularImposto(){
        return this.valor * IMPOSTO;
    }

    public String getMhz() {
        return mhz;
    }
}

