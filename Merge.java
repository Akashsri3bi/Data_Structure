import java.util.Arrays;

//Merge 2 sorted arrays without using Extra Space .
public class Merge {

      static void merge(int[] arr1 , int[] arr2){
            int i = 0 , j = 0  , k = arr1.length-1 ;
            while(i<=k && j<arr2.length){
                  if(arr1[i]<arr2[j]){
                        i++ ; 
                  }else{
                        int temp = arr2[j];
                        arr2[j] = arr1[k];
                        arr1[k] = temp ; 
                        j++ ; 
                        k-- ; 
                  }
            } 
            Arrays.sort(arr1);
            Arrays.sort(arr2);
      }
      public static void main(String[] args) {
            int arr1[] = {1, 3, 5, 7} ; 
            int arr2[] = {0, 2, 6, 8, 9} ; 
            merge(arr1 , arr2) ;
            for(int i = 0 ; i < arr1.length ; i++ ){
                  System.out.print(arr1[i]+" ");
            }

            for (int i = 0; i < arr2.length; i++){
                  System.out.print(arr2[i]+" ");
            }
      }
      
}
