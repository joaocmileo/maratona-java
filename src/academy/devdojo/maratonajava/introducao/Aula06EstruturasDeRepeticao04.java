package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    static void main() {
        double valorDoCarro = 40000;
        double valorParcela = 0;
        for (int parcelas = 1; parcelas < valorDoCarro; parcelas++) {

            if (valorDoCarro/parcelas >= 1000){
                valorParcela = valorDoCarro/parcelas;
                System.out.println("Quantidades de Parcelas: "+parcelas+" Valor de cada parcela: "+valorParcela);
            }else {break;}
        }

    }
}
