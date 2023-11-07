import java.util.ArrayList;

public class TriangleSum {

          //Function to return sum of upper and lower triangles of a matrix.
static ArrayList<Integer> sumTriangles(int matrix[][], int n){
        // code here
        int sum1=0,sum2=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<n;i++){
            for(int j = i ;j<n;j++){
                sum1+=matrix[i][j] ; 
            }
        }
        for(int i = 0 ;i<n;i++){
            for(int j = 0;j<=i;j++){
                sum2+=matrix[i][j] ; 
            }
        }
        list.add(sum1) ; 
        list.add(sum2) ; 
        return list;
    }
      
}
