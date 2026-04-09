package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterTest01 {
     String name = "Kenzo Vinicius";

     class Inner{
        public void printOuterClassAtributte(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterTest01.this);
        }
    }

    static void main() {
        OuterTest01 ot = new OuterTest01();
        Inner inner = ot.new Inner();
        inner.printOuterClassAtributte();
    }
}
