import java.math.BigInteger;
import java.util.Arrays;

//Maximum Product subArray Problem 
public class Product {

      static int maxproduct(int[] arr , int n){
            int max = Integer.MIN_VALUE ; 
            int product = 1 ; 
            for(int i = 0 ; i < n ; i++){
                  product = product*arr[i] ; 
                  if(product==0){
                        product = 1 ;
                  }else{
                  max = Math.max(product , max)  ;
                  }

            }

            product = 1 ;
            for(int i = n-1 ; i>=0 ; i--){
                  product = product*arr[i] ;
                  if(product==0){
                        product = 1 ; 
                  }else{
                        max = Math.max(product, max) ;
                  }
            }
            return max ; 
      }
      public static void main(String[] args) {
            int[] arr = {-8,5,3,2,1}; //15492708000000
            System.out.println(maxproduct(arr, arr.length));
      }
      
}
