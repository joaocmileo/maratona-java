package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    static void main() {


        NavigableMap<String,String> navigableMap = new TreeMap<>();
        navigableMap.put("A","Letra A");
        navigableMap.put("D","Letra D");
        navigableMap.put("C","Letra C");

        for (Map.Entry<String,String> s : navigableMap.entrySet()){
            System.out.println(s.getKey()+" - "+s.getValue());
        }
        System.out.println(navigableMap.headMap("C"));
        System.out.println(navigableMap.higherEntry("B"));

    }
}
