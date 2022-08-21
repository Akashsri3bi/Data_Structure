public class KElement {

      public long kthElement(int arr1[], int arr2[], int n, int m, int k) {
            int i = 0 ; 
            int j = 0  ;  int l = 0 ;
            int result = -1 ;
            while(i<k && j < arr1.length && l < arr2.length){
                  if(arr1[j]<=arr2[l]){
                        result = arr1[j] ; 
                        j++ ; 
                  }else{
                        result = arr2[l] ; 
                        l++ ; 
                  }
                  i++;
            }

            while(i<k && j < arr1.length){
                  result = arr1[j] ; 
                  j++ ; 
                  i++ ; 
            }

            while (i < k && l < arr2.length) {
                  result = arr1[j];
                  j++;
                  i++;
            }

            return result ; 

      }

      public static void main(String[] args) {
            
      }
      
}
