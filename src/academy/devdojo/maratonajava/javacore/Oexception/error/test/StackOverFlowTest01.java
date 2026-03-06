package academy.devdojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTest01 {
    static void main() {
        stack(1);
    }
    int i =0;

    public static void stack(int i){
        System.out.println(i++);
        stack(i);
    }
}
