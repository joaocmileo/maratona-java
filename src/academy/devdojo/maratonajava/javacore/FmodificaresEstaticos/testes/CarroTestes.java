package academy.devdojo.maratonajava.javacore.FmodificaresEstaticos.testes;

import academy.devdojo.maratonajava.javacore.FmodificaresEstaticos.dominio.Carro;

public class CarroTestes {
    static void main() {

        Carro car1 = new Carro("Fiat",320);
        Carro car2 = new Carro("Bmw",290);
        Carro car3 = new Carro("Volkswagen",160);

        car1.imprime();
        car2.imprime();
        car3.imprime();
                
        Carro.setVelocidadeLimite(180);
        System.out.println(Carro.getVelocidadeLimite());
        car1.imprime();
        car2.imprime();
        car3.imprime();

    }
}
