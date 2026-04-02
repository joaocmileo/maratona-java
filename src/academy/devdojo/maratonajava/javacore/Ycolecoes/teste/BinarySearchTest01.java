package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    static void main() {

        List<Integer> numbers = new ArrayList<>(List.of(3, 1, 51, 512, 32, 6));
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.println(Collections.binarySearch(numbers,0));

    }
}
