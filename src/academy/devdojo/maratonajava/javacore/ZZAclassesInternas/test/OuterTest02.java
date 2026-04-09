package academy.devdojo.maratonajava.javacore.ZZAclassesInternas.test;

public class OuterTest02 {

     static String name = "Anya";

    static void print( String param){
        class LocalClass{
            public void printLocal(){
                System.out.println(name);
            }
        }
        new LocalClass().printLocal();
    }


    static void main() {
        print("a");
    }
}
