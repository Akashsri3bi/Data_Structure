import java.util.Arrays;

public class MergeTwoArrays {

      //Merge two sorted arrays without using extra space
      
      public void merge(int arr1[], int arr2[], int n, int m) {
            int i = 0   , j = 0  , k = arr1.length-1;

            while(i<=k && j<arr2.length){
                  if(arr1[i]<arr2[j]){
                        i++ ; 
                  }else{
                        int temp = arr2[j] ; 
                        arr2[j] = arr1[k]; //IMP STEP
                        arr1[k] = temp ;    
                        j++ ; 
                        k--; 
                  }
            }

            Arrays.sort(arr1);
            Arrays.sort(arr2);
      }

      public static void main(String[] args) {
            
      }
      
}
