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

      static void merging(int[] nums1 ,int m ,int[] nums2 , int n ){
            int original = m+n ; 
            int i = original-n ; 
            int  j =0 ;
            while(i<original && j<n){
                  nums1[i] = nums2[j];
                  j++ ;
                  i++;
            }
            Arrays.sort(nums1);
      }
      public static void main(String[] args) {
            int[] arr1 = { 1, 2, 3, 0, 0, 0 };
            int[] arr2 = { 2, 5, 6 };
            merging(arr1 , 3 ,  arr2 , arr2.length) ;
            for(int i = 0 ; i < arr1.length ; i++ ){
                  System.out.print(arr1[i]+" ");
            }

            /*for (int i = 0; i < arr2.length; i++){
                  System.out.print(arr2[i]+" ");
            }*/
      }
      
}
