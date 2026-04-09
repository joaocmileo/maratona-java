package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class AnonymousClassTest01 {

     static class Animal{
        public void walk(){
            System.out.println("Animal walking");
        }
    }


    static void main() {
        Animal dog = new Animal(){
            @Override
            public void walk() {
                System.out.println("Dog walking");
            }
        };

        dog.walk();

    }
}
