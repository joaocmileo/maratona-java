package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.testes;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    static void main() {

        Carro car = new Carro();
        Carro car2 = new Carro();

        car.nome = "Siena";
        car.modelo = "ELX";
        car.ano = 2001;

        car2.nome = "Sandero";
        car2.modelo = "RS";
        car2.ano = 2018;

        System.out.println("Nome: "+car.nome+ " Modelo: "+car.modelo+ " Ano: "+car.ano);
        System.out.println("Nome: "+car2.nome+ " Modelo: "+car2.modelo+ " Ano: "+car2.ano);

    }

}
