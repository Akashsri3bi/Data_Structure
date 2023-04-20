public class MinToMaxHeap {

      static void maxHeapify(int[] arr , int i , int N){
            int l = 2*i+1 ; 
            int r = 2*i+2 ; 
            int largest = i ; 
            if(l<N && arr[l]>arr[i]){
                  largest = l ;
            }
            if(r< N &&  arr[r]>arr[largest]){
                  largest = r ; 
            }

            if(largest!=i){
                  int temp = arr[i] ; 
                  arr[i] = arr[largest] ; 
                  arr[largest] = temp ; 
                  maxHeapify(arr, largest, N);
            }
      }

      static void convertMaxHeap(int[] arr , int N){
            for(int i = (N-1)/2 ; i>=0 ; i--){
                  maxHeapify(arr, i, N);
            }
      }
      
}
