import java.util.ArrayList;
import java.util.List;

public class LetterCollection {
          static boolean isSafe(int[][] mat , int i , int j){
        return i>=0 && j>=0 && i<mat.length && j<mat[0].length ; 
    }
    static int f(int mat[][],int r , int c , int dis){
        int sum = 0 ;
        for(int i = r-dis ; i<=r+dis ; i++){
            for(int j = c-dis ; j<=c+dis ; j++){
                if(isSafe(mat,i,j)){
                    sum+=mat[i][j] ; 
                }
            }
        }
        return sum - mat[r][c] ; 
    }
    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][])
    {
        // code here
        List<Integer> ans = new ArrayList<>() ; 
        for(int i = 0 ;i<q;i++){
            if(queries[i][0]==1){
                ans.add(f(mat,queries[i][1],queries[i][2],1)) ;
            }else{
                int d = f(mat,queries[i][1],queries[i][2],2) ;
                int g = f(mat,queries[i][1],queries[i][2],1) ; 
                ans.add(d-g) ; 
            }
        }
        return ans; 
    }
      
}
