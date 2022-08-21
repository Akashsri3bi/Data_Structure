import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kickstart3 {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ; 
            int t = sc.nextInt() ;
            int n = sc.nextInt();
            int m = sc.nextInt() ; 
            int i =1 ; 
            while(i<=t){
                  int[]  arr = new int[n] ; 
                  for(int k = 0 ; k < n ;k++){
                        int a = sc.nextInt() ; 
                        arr[k] = a ;  
                  }

                  Arrays.sort(arr);
                  int size = n-m+1 ; 
                  
                  double firstHalfMedian =  -1 ;
                  if(size%2==0){
                        int index1 = size/2 ; 
                        int index2 = index1-1 ; 
                        firstHalfMedian = (arr[index1] + arr[index2])/2.0 ;  
                  }else{
                        int dividingIndex = size-1 ; 
                        int original = dividingIndex/2 ;
                        firstHalfMedian= arr[original] ; 
                  }
                  while(size< n){
                        firstHalfMedian = firstHalfMedian + arr[size] ;
                        size++ ;        
                  } 

                  System.out.println("Case #"+i+": "+firstHalfMedian);
                  i++ ; 
            }
      }
      
}
