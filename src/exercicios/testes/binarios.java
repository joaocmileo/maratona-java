package exercicios.testes;

import exercicios.dominio.TransformarBinario;

public class binarios {
    static void main() {
        int num1 = 10;
        TransformarBinario bin = new TransformarBinario(10);
        int[] res = bin.binarios();





        System.out.println(Integer.bitCount(num1));
        int primo = 0;
        for (int i:res){
            if(i == 1){
                primo +=1;
            }
        }
        System.out.println();
    }

}
