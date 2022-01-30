//Rearrange the array in alternating positive and negative elements using O(1) space 
public class Altrenate {
      static void swap(int[] arr ,  int i , int j){
            int temp = arr[i] ; 
            arr[i] = arr[j] ; 
            arr[j] = temp ;
      }
      static void rearrange(int[] arr){
            int i = 0 , j = arr.length-1 ; 
            while(i<j){
                  while(i<=arr.length-1 && arr[i]>0){
                        i+=1 ;
                  }
                  while(j>=0 && arr[j]<0){
                        j-=1 ;
                  }
                  if(i<j){
                        swap(arr , i , j) ;
                  }
            }

            if(i==0 || i==arr.length){
                  return  ;
            }

            int k = 0 ; 
            while(k<arr.length && i<arr.length){
                  swap(arr, k, i);
                  i = i+1 ; 
                  k = k+2 ;
            }
      }
      public static void main(String[] args) {
            int[] arr = {1, 2, 3, -4, -1, 4} ;
            rearrange(arr);
            for(int i = 0 ; i< arr.length ; i++){
                  System.out.print(arr[i] + " ") ;
            }
      }
      
}
