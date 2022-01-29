//To find the Kth smallest numbe in a given array which means we need to find the element in the array which is at kth position
//smallest like the 3rd smallest or the 4th smallest number .
public class K {

      static int smallest(int[] arr , int k){
            int count=0 ; 
            int[] sorted = sort(arr)  ;
            return arr[k-1] ; 
      }

      static int[] sort(int[] arr){
            for(int i = 0 ; i < arr.length -1 ; i++){
                  if(arr[i]>arr[i+1]){
                        int temp = arr[i] ; 
                        arr[i] = arr[i+1]  ; 
                        arr[i+1] = temp  ; 
                  }
            }
            return arr  ;
      }
      public static void main(String[] args) {
            int arr[] = {7, 10, 4, 20, 15};
            int min = smallest(arr, 4); 
            System.out.printf("%d th smallest element in the given array is ",4) ; 
            System.out.print(min) ;
      }
}
