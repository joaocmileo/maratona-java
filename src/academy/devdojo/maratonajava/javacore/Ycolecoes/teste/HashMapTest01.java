package academy.devdojo.maratonajava.javacore.Ycolecoes.teste;

import java.util.HashMap;
import java.util.Map;


public class HashMapTest01 {
    static void main() {
        HashMap<String,String> hashMap = new HashMap<>();

        hashMap.put("vc","Você");
        hashMap.put("sccp","Sport Club Corinthians Paulista");
        hashMap.put("tbm","Também");

        for (String s : hashMap.keySet()){
            System.out.println(s + " -- " +hashMap.get(s));


        }
        IO.println("-".repeat(30));

        for (String res : hashMap.values()){
            System.out.println(res);
        }

        IO.println("-".repeat(30));

        for (Map.Entry<String, String> stringStringEntry : hashMap.entrySet()) {
            System.out.println(stringStringEntry.getKey() + " ---" + stringStringEntry.getValue());
        }


    }
}
