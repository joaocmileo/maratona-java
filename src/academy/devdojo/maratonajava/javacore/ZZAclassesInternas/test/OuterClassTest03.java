package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterClassTest03 {
    private String name = "Joao";
    static class Nested{
        private String lastName = "Paulo";
        void print(){
            System.out.println(new OuterClassTest03().name+" "+ lastName);
        }
    }


    static void main() {
        Nested nested = new Nested();
        nested.print();
    }
}
