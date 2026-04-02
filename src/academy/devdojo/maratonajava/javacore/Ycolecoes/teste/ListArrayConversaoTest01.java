package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        Integer[] listToArray = numbers.toArray(new Integer[0]);

        System.out.println(Arrays.toString(listToArray));
        System.out.println("-".repeat(25));
        Integer[] arrayInteger = {1,2,3,4};


        List<Integer> list = Arrays.asList(arrayInteger);

        list.set(2,1);
        System.out.println(list);
        for (Integer i : arrayInteger) {
            System.out.println(i);
        }

        System.out.println("-".repeat(25));

        List<Integer> arrayToList = new ArrayList<>(Arrays.asList(arrayInteger));
        arrayToList.add(1);
        System.out.println(arrayToList);
        for (Integer i : arrayInteger) {
            System.out.println(i);
        }
    }

}
