package exercicios.testes;

public class RemoverDuplicatas {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        // O primeiro elemento (índice 0) sempre é único.
        // Começamos o "Escritor" no índice 1.
        int i = 1;

        // O "Explorador" j percorre o resto do array
        for (int j = 1; j < nums.length; j++) {
            // Se o número atual for diferente do anterior (nums[j-1])
            if (nums[j] != nums[j - 1]) {
                // Colocamos esse novo número único na posição do "Escritor"
                nums[i] = nums[j];
                // E avançamos o Escritor para a próxima vaga
                i++;
            }
        }

        // Retornamos i, que é a quantidade de elementos únicos
        return i;
    }

    public static void main(String[] args) {
        int[] num = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int k = removeDuplicates(num);

        System.out.println("Quantidade de únicos: " + k);
        System.out.print("Array resultante: ");
        for (int i:num){
            System.out.println(i);
        }
    }
}
