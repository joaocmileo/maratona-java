package exercicios.dominio;

import java.util.Arrays;

public class TransformarBinario {
    int num1;
    int[] res = new int[8];

    public TransformarBinario(int num1) {
        this.num1 = num1;
    }

    public int[] binarios(){
        // i = 8 se i menor ou igual a 8
        for(int i = res.length-1; i > 0; i--){
            int binario = num1%2;
            num1 = num1/2;
            res[i] = binario;
        }

            return res;
        }




}
