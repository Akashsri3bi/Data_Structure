public class Negative {
      //Shifting process 
      static int[] shiftNegative(int[] arr , int n){
            int j = 0  , temp;  
            //Array ke jth pe bhi toh ek element jayega toh usko bhi to kisi se change karenge 
            //Toh vo element jisse se change karenge vo komsa hoga ,  i wala hoga
            for(int i = 0 ; i < n ; i++){
                  if(arr[i]<0){
                        if(i!=j){
                              temp = arr[i] ; 
                              arr[i] = arr[j] ;
                              arr[j] = temp ; 
                        }
                        j++;
                  }
            }
            return arr; 
      }

      static void printArray(int arr[], int n) {
            for (int i = 0; i < n; i++)
                  System.out.print(arr[i] + " ");
      }
      public static void main(String[] args) {
            int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
            int n = arr.length;
            int[] newarr  = shiftNegative(arr, n);
            printArray(newarr, n);
      }
      
}
