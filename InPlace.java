public class InPlace {

      static void merge(int[] arr  , int left , int mid , int right){
            int start2 = mid + 1  ; 
            if(arr[mid] <= arr[start2]){
                  return  ; 
            }

            while(left<=mid && start2<=right){
                  //Base case 
                  if(arr[left]<=arr[start2]){
                        left++ ; 
                  }else{
                      int value = arr[start2] ; 
                      int index = start2 ; 

                      while(index!=left){
                        arr[index] = arr[index-1] ; 
                        index--; 
                      }

                      arr[left] = value ;  


                      //Updating the pointers; 
                      left++ ; 
                      mid++ ; 
                      start2++ ; 
                  }
            }
      }

      static void mergeSort(int[] arr , int l , int r){
            if(l<r){
                  int mid = l + (r-l)/2 ; 
                  mergeSort(arr, l, mid);
                  mergeSort(arr, mid+1, r);
                  merge(arr, l,mid ,r);
            }
      }
      public static void main(String[] args) {
            
      }
}
