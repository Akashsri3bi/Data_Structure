import java.util.Arrays;

public class Permutation {

      public static int[] swap(int data[], int left, int right) {

            // Swap the data
            int temp = data[left];
            data[left] = data[right];
            data[right] = temp;

            // Return the updated array
            return data;
      }

      public static int[] reverse(int data[], int left, int right) {

            // Reverse the sub-array
            while (left < right) {
                  int temp = data[left];
                  data[left++] = data[right];
                  data[right--] = temp;
            }

            // Return the updated array
            return data;
      }
      static int[] nextPermutation(int[] arr , int n){
            if(n==0){
                  return arr; 
            }

            int idx1=Integer.MIN_VALUE ; 
            //We need to traverse from last of the array because then only we will able to find lexicographically 
            //smaller greater number in the order 
            for(int i = n-2 ; i>=0 ; i--){
                  if(arr[i]<arr[i+1]){
                        idx1 = i ; 
                        break ; 
                  }
            }

            if(idx1<0){
                  Arrays.sort(arr);
            }else{
                  int idx2 = Integer.MIN_VALUE; 
                  for(int i = n-1 ; i>=0 ; i--){
                        if(arr[i]>arr[idx1]){
                              idx2 = i ; 
                              break ; 
                        } 
                  }

                  arr = swap(arr, idx1, idx2);

                  arr = reverse(arr, idx1+1, n-1);
            }

            return arr ; 
      }
      public static void main(String[] args) {
            int[] arr = {1,2,3} ; 
            int[] nextPermutation = nextPermutation(arr, arr.length) ;
            for(int i = 0 ; i < nextPermutation.length ; i++){
                  System.out.print(nextPermutation[i]+" ");
            }
      }
      
}
