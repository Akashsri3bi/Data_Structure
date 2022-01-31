import java.io.CharArrayReader;

//Factorial of large number
public class Fact {

      static void fact(int n){
            //Initializing a very large array
            int[] res = new int[500];
            //Because multiplication of any number with 1 is that number only 
            res[0]=1 ; 

            //Our result number
            int res_size = 1 ; 

            //Simple factorial formula to multiply all numbers less than it one by one
            for(int i = 2 ; i<=n ; i++){
                  res_size = multiply(i , res , res_size);
            }

            //Print the number so formed in the array
            for(int i = res_size-1 ; i>=0 ; i--){
                  System.out.print(res[i]);
            }

            System.out.print(res_size);

      }

      private static int multiply(int x, int[] res, int res_size) {
            //Carry 
            int carry = 0 ;
            for(int i = 0 ; i<res_size ; i++){
                  int product  = res[i]*x + carry ; 
                  res[i] = product%10 ; 
                  carry = product/10 ; 
            } 

            while(carry!=0){
                  res[res_size] = carry ; 
                  carry = carry/10 ; 
                  res_size++ ; 
            }

            return res_size ; 
      }

      public static void main(String[] args) {
            fact(100);
      }
      
}
