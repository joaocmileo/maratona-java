package academy.devdojo.maratonajava.javacore.Pwrappers.test;

public class WrappersTest01 {
    static void main() {
        // Tipos Primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        float floatP = 1F;
        double doubleP = 10d;
        boolean booleanP = true;
        char charP = 'M';

        // Wrappers Objetos
        // AutoBoxing
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Float floatW = 1F;
        Double doubleW = 10d;
        Boolean booleanW = true;
        Character charW = 'M';

        // UnBoxing
        int int1 = intW;

        System.out.println(Character.isUpperCase('b'));
        System.out.println(Character.isLowerCase('B'));
        System.out.println(Integer.parseInt("1910")+1);
        
    }


}
