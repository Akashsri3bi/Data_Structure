//Program to cyclically Rotate an Array one by one;
public class Cycle {
      static void rotate(int[] arr , int n){
            int lastElement = arr[n-1] ;
            for(int i = n-1 ; i>0 ; i--){
                  arr[i] = arr[i-1] ; 
                  //Last Element Placed on First and the place all the elements starting from last to 
                  //To one position forward 
            }
            arr[0] = lastElement;
      }
      public static void main(String[] args) {
            //Driver Code.
            int arr1[] = { 1, 2, 4, 5, 6 };
            int m = arr1.length;
            rotate(arr1, m);
            for(int i = 0 ; i < arr1.length ; i++){
                  System.out.print(arr1[i]+" ");
            }
            
      }
      
}
