
//Rotate a matrix by 90 degrees in clockwise direction 
public class RotateMatrix {
      //We can acheive this in two steps first doing transpose of matrix ; 
      public static int[][] rotate(int[][] arr){
            // We can acheive this in two steps first doing transpose of matrix ;
            for(int i = 0 ; i < arr.length ; i++){
                  for(int j = i ; j < arr[0].length ; j++){
                        if(i!=j){
                              //Swapping of diagonal elements 
                              int temp = arr[i][j] ;
                              arr[i][j] = arr[j][i] ; 
                              arr[j][i] = temp ;  
                        }
                  }
            }

            //Now swapping first and last elements of each row in the transposed matrix ;
            for(int i = 0 ; i < arr.length ; i++){
                  for(int j = 0  ; j < arr[0].length/2 ; j++){
                        int temp = arr[i][j] ; 
                        arr[i][j] = arr[i][arr[0].length-j-1] ; 
                        arr[i][arr[0].length-j-1] = temp ; 
                  }
            }

            return arr ;
      }

      static void printMatrix(int arr[][]) {
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < n; j++)
                        System.out.print(arr[i][j] + " ");
                  System.out.println();
            }
      }
      public static void main(String[] args) {
            int arr[][] = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
            rotate(arr);
            printMatrix(arr);
      }
      
}
