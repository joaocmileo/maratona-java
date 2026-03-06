package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    static void main() {

        int [][] meses = new int[4][3];

        meses[0][0] = 31;
        meses[0][1] = 28;
        meses[0][2] = 31;

        meses[1][0] = 30;
        meses[1][1] = 31;
        meses[1][2] = 30;

        meses[2][0] = 28;
        meses[2][1] = 29;
        meses[2][2] = 21;

        meses[3][0] = 21;
        meses[3][1] = 22;
        meses[3][2] = 24;


       for (int []arrayBase: meses){
           for (int num: arrayBase){
               System.out.println(num);
           }
           System.out.println("---------------------------------");
        }




    }
}
