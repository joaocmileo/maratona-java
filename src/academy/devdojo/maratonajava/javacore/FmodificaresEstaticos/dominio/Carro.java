package academy.devdojo.maratonajava.javacore.FmodificaresEstaticos.dominio;

public class Carro {
    private String marca;
    private int velocidadeMaxima;
    private static int velocidadeLimite = 290;

    public Carro(String marca,int velocidadeMaxima){
        this.marca = marca;
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public Carro(){
    }

    public void imprime(){
        System.out.println("-".repeat(50));
        System.out.println(this.marca);
        System.out.println(this.velocidadeMaxima);
        System.out.println(velocidadeLimite);
    }


    public static void setVelocidadeLimite(int velocidadeLimite){
        Carro.velocidadeLimite = velocidadeLimite;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public static int getVelocidadeLimite(){
        return velocidadeLimite;
    }

    public String getMarca(){
        return this.marca;
    }
}
