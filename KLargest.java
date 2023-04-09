public class KLargest {

      int[] kLargest(int[] arr, int n, int k) {
        // code here
      Arrays.sort(arr) ; 
        int[] newarr = new int[k] ; 
        int j = 0 ; 
        for(int i = arr.length-1 ; i>=0 ; i--){
            newarr[j] = arr[i]  ; 
            j++; 
            if(j==k){
                break ;
            }
        }
        
        return newarr ; 
    }
      
}
