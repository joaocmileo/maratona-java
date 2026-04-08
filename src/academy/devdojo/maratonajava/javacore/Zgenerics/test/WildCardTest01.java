package academy.devdojo.maratonajava.javacore.Zgenerics.test;

public class WildCardTest01 {

   static abstract class Animal{
       public abstract void consulta();
   }
  static class Cachorro extends Animal{

       @Override
       public void consulta() {
           System.out.println("Cachorro na consulta");
       }
   }
  static class Gato extends Animal{

       @Override
       public void consulta() {
       System.out.println("Gato na consulta");
       }
   }

    static void main() {

       Gato[] gatos = {new Gato(),new Gato()};
       Cachorro[] cachorros = {new Cachorro(),new Cachorro()};

       imprimirConsulta(gatos);
       imprimirConsulta(cachorros);
       Animal[] animals = {new Cachorro(), new Gato()};
        System.out.println("-".repeat(21));
        imprimirConsulta(animals);

    }
    private static void imprimirConsulta(Animal[] animals){
        for (Animal animal : animals) {
            animal.consulta();

        }

    }
}
