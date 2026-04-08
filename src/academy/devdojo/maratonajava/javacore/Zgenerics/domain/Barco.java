package academy.devdojo.maratonajava.javacore.Zgenerics.domain;

public class Barco {

    private String marca;

    public Barco(String nome) {
        this.marca = nome;
    }

    public String getMarca() {
        return marca;
    }

    @Override
    public String toString() {
        return "Barco{" +
                "marca='" + marca + '\'' +
                '}';
    }
}

