package academy.devdojo.maratonajava.javacore.Ycolecoes.domain;

import java.util.Objects;

public class Smartphone {
    private String marca;
    private String numeroDeSerie;

    public Smartphone(String marca, String numeroDeSerie) {
        this.marca = marca;
        this.numeroDeSerie = numeroDeSerie;
    }

    @Override
    // Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null
    //Simétrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // Transitividade: para x,y,z diferentes de null, se x.equals(y) == true e x.equals(z) == true logo, y.equals(z) == true
    //Consistente: x.equals(x) sempre retornar true se x for diferente de null
    //para x diferente de null, x.equals(null) tem que retornar false
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;
        return numeroDeSerie != null && numeroDeSerie.equals(smartphone.numeroDeSerie) && marca != null && marca.equals(smartphone.marca);

    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroDeSerie,marca);
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "marca='" + marca + '\'' +
                ", numeroDeSerie='" + numeroDeSerie + '\'' +
                '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }

    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
}
