package exercicios.testes;

public class Test {
    static void main() {
        int right = 10;
        int left = 6;
        int counter = 0;
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19};
        for (int i = left; i <= right; i++){
            int primo = Integer.bitCount(i);
            System.out.println(primo);
            for (int j:primos){
                if (primo == j){
                    counter++;
                }
            }

        }
        System.out.println(counter);
        
        System.out.println(Integer.highestOneBit(22));

    }
}
