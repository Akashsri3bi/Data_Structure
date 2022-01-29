import java.util.Scanner ;
public class ArraySum {
      public static void main(String[] args) {
             
            Scanner sc = new Scanner(System.in) ;
            System.out.println("Enter number of rows") ;
            int row = sc.nextInt() ;
            System.out.println("Enter number of columns");
            int column = sc.nextInt() ; 
            int[][] arr = new int[row][column];
            for (int i = 0 ; i < row ; i++){
                  for(int j = 0 ; j < column ; j++){
                        arr[i][j] = sc.nextInt() ;
                  }
            }
            System.out.println() ;
            for(int i = 0  ; i < row ; i++){
                  for (int j = 0 ; j < column ; j++){
                        System.out.print(arr[i][j] + " ") ;
                  }
                  System.out.println() ;
            }
      }
}
