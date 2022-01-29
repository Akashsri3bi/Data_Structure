public class withoutSort {

      void sort(int[] arr){
            for(int i = 0 ; i< arr.length-1 ; i++){
                  if(arr[i]>arr[i+1]){
                        int temp = arr[i] ; 
                        arr[i] = arr[i+1]; 
                        arr[i+1]= temp ; 
                  }
            }
      }
      public static void main(String[] args) {
            //Driver code as you wish
      }
}
