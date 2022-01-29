import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

public class Inersion {
      static void swap(int[] arr , int i , int j){
            int temp = arr[i] ; 
            arr[i] = arr[j] ; 
            arr[j] = temp ; 
      }
      //Time complexed Solution 
      static int count(int[] arr , int n ){
            int count = 0 ;
            for(int  i = 0 ; i < n-1 ;i++){
                  for(int j = i+1 ; j<n ;j++){
                        if(arr[i]>arr[j]){
                              count++ ; 
                        }
                  }
            }
            return count ; 
      }



      //Time mangaged solution 
      //mergeSort gives you O(nlogn) solution sorting
      static int mergeAndCount(int[] arr , int l , int mid , int r){
            //division of the array 
            int[] left = Arrays.copyOfRange(arr, l, mid+1);
            int[] right = Arrays.copyOfRange(arr, mid+1, r+1) ;

            int i = 0 , j = 0 , k = l , count = 0 ;

            while(i<left.length && j<right.length){
                  if(left[i]<=right[j]){
                        arr[k] = left[i];
                        k++ ; 
                        i++ ; 
                  }else{
                        arr[k] = right[j] ; 
                        k++ ; j++ ; 
                        count+=(mid+1)-(l+i);
                  }
            }

            while(i<left.length){
                  arr[k++] = arr[i++] ; 
            }

            while(r<right.length){
                  arr[k++] = arr[r++];
            }

            return count ; 

      }
      static int mergeSortandCount(int[] arr , int  l  , int r){
            int count = 0 ; 
            if(l<r){
                  int mid = (l+r)/2 ; 
                  count+= mergeSortandCount(arr, l, mid);
                  count+= mergeSortandCount(arr, mid+1, r);
                  count+=mergeAndCount(arr,l,mid,r);
            }
            return count ; 
      }





      public static void main(String[] args) {
            int[] arr = { 2, 3, 4, 5, 6};
            int count = mergeSortandCount(arr, 0,arr.length-1);
            System.out.print(count);
      }
}