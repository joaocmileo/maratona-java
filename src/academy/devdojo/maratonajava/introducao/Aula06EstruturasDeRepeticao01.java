package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    static void main(String[] args){
        int count = 0;


        while(count < 10){
            System.out.println(count++);
        }

        do{
            System.out.println(count);
            break;
        }while(count == 10);

        for (int i = 0;i <= 1000000;i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }


    }


}




