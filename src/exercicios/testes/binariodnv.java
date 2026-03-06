package exercicios.testes;


public class binariodnv {
    static void main() {
        int[] res = new int[10];
        int num1 = 136;
        int counter = 0;
        int pos1 =0;
        int pos2 = 0;
        int resposta = 0;
        int vez = 0;
        for(int i = res.length-1; i > 0; i--){
            int binario = num1%2;
            num1 = num1/2;
            res[i] = binario;
        }
        for (int i = 0; i < res.length; i++){
            if (res[i] == 1){
                counter++ ;
                if (counter == 1){
                    pos1 = i;

                }
                if (counter == 2){
                    if (vez >= 1){
                        pos1 = pos2;
                    }
                    pos2 = i;
                    counter = 1;
                    if (vez >= 1){
                        if (resposta < pos2 - pos1){
                            resposta = pos2 - pos1;
                        }
                    }else  resposta = pos2 - pos1;
                    vez++;

                }

            }
        }
        System.out.println(resposta);
    }
}
