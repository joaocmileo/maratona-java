package academy.devdojo.maratonajava.javacore.Zgenerics.domain;

public class Carro {
    private String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }
}
