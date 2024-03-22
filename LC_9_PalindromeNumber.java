package LeetCode;

import java.util.Scanner;
/**
 *
 * @author caiop
 */
class LC_9_PalindromeNumber {
    
    int reversed = 0;
    
    public boolean isPalindrome(int x){
     
        //Verify if the number is Negative
        if(x<0){
         return false;
     }  
     
     
     int y = x;
     
     //While Y is not 0
     while(y != 0){
         int pop = y % 10; //Get the last number of y, for example 123 / 10 = 12,3. It takes the N° 3
         y /= 10; //remove the last number
         
         //Check if when reversing the number will be an integer overflow 
         if(reversed > Integer.MAX_VALUE/10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7)){
             return false;
         }
         //Add the last digit to the reversed number
         reversed = reversed * 10 + pop;
     
     }//End While
     
     if(reversed == x){
         return true;
     }else{
     return false;     
     }
     
    } //End isPalindrome
    
    
    //Method just for TestZone
   public void getReversed(){
       System.out.println(reversed);
   }
    
   
   //TestZone. Just to see the code working
   public static void main(String[] args) {
    
        LC_9_PalindromeNumber test = new LC_9_PalindromeNumber();
        
        Scanner sc = new Scanner(System.in);
        
        
        int n = sc.nextInt();
        System.out.println("Input: " + n);
       
        boolean teste = test.isPalindrome(n);
        
       
        if(teste == false){
            System.out.println("Output: False");
            System.out.println("Reversed = " );
            test.getReversed();
       }else if(teste == true){
            System.out.println("Output: True");
            System.out.println("Reversed = " );
            test.getReversed();
       }
    }
   
   
}
