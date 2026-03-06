package exercicios.testes;

public class Duplicatas {
    static void main() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int quantidade = 1;
        for(int i = 1; i < nums.length; i++){
            if (nums[i] != nums[i-1]){
                nums[quantidade] = nums[i];
                i++;
            }


        }
        System.out.println(quantidade);
        for (int j:nums){
            System.out.println(j);
        }
    }
}
