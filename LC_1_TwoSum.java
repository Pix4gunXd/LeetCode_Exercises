package LeetCode;
/**
 *
 * @author caiop
*/
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class LC_1_TwoSum {
    
    /*Esse método é do tipo Array, por isso ele deve retornar uma variável também do tipo array;
    ele recebe as variaveis criadas no psvm como nums e target para usar em sua conta e verificar se existe a soma dos numeros;
    */
    private static int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            /* O for de j roda toda vez que o i atualiza, ou seja, ele verifica as combinações de i[0] com todos j[legth],
            e como não se pode repetir a variavel na conta, j = i + 1;
            */
            for (int j = i + 1; j < nums.length; j++){
                if (nums[i] + nums[j] == target){
                    return new int[]{i, j};
                }
            } //End j
        }//End i
                    return new int[]{};
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); // o user determina a quantidade de espaços desejada no array;
        int[] nums = new int[n]; // Definimos que a quantidade escolhida pelo user
        
        //A seguir, o user preenche cada espaço do array de nums
        for(int i = 0; i < n; i++){
            nums[i] = sc.nextInt();
        }
        //User define o objetivo desejado
        int target = sc.nextInt();
        
        sc.close(); // Aqui fechamos o Scanner para não consumir memoria;
        
        int[] sum = twoSum(nums,target); //Utilizamos o método criado no inicio da classe
        
        // Mostramos o resultado ao user
        if (sum.length == 2){
            System.out.println("[" + sum[0] + " " + sum[1] + "]" );
        } else {
            System.out.println("No solution!");
        }
            
        
    }
    
}//End