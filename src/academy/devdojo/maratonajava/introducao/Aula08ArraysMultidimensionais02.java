package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    static void main() {

        int[][] array01 = new int[3][];
        int[][] array02 = {{1,2,3,4},{23,2,32,}};


        int[] array = {1,2,3,4,5,6};

        array01[0] = new int[3];
        array01[1] = new int[]{1,2,3};
        array01[2] = array;

        for (int[] arrayBase: array01){
            for (int num:arrayBase){
                System.out.print(num+",");
            }
            System.out.println("\n---------------------------");


        }

        for (int[] arrayBase: array02){
            for (int num: arrayBase){

                System.out.print(num+",");
            }
            System.out.println("\n--------------------");

        }


    }


}
