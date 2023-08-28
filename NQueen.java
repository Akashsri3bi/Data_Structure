import java.util.ArrayList;

public class NQueen {

          
    static boolean isSafe(int[][] board , int row , int col){
        
        //Checking col in left side 
        //checking for row
        int n=board.length;
        for(int i=0;i<n;i++){
            if(board[i][col]==1){
                return false;
            }
        }
        //checking for column
        for(int i = 0 ;i<col;i++){
            if(board[row][i]==1){
                return false ;
            }
        }
        //checking for North West
        int i=row;
        int j=col;
        while(i>=0 && j>=0){
            if(board[i][j]==1)return false;
            i--;
            j--;
        }
        //checking for North East
        i=row;
        j=col;
        while(i>=0 && j<n){
            if(board[i][j]==1)return false;
            i--;
            j++;
        }
        //checking for South East
        i=row;
        j=col;
        while (i<n && j<n){
            if(board[i][j]==1)return false;
            i++;
            j++;
        }
        //checking for South West
        i=row;
        j=col;
        while (i<n && j>=0){
            if(board[i][j]==1) return false;
            i++;
            j--;
        }

        return true;
        
    }
    static void helper(int[][] board,int row,ArrayList<ArrayList<Integer>> ans){
        int n = board.length ; 
        if(row==n){
            //Something to be done
            ArrayList<Integer> temp = new ArrayList<>() ; 
            for(int i = 0 ;i<n;i++){
                for(int j = 0; j<n;j++){
                    if(board[i][j]==1){
                        temp.add(j+1) ; 
                    }
                }
            }
            
            ans.add(temp) ; 
            return  ;
            
        }
        
        for(int i = 0 ;i<n;i++){
            if(isSafe(board,row,i)){
                board[row][i] = 1 ; 
                helper(board,row+1,ans) ;
                //Keep the board at initial state 
                board[row][i] = 0 ;
            }
        }
    }
    static ArrayList<ArrayList<Integer>> nQueen(int n) {
        
        // code here
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ; 
        
        if(n==1){
            ArrayList<Integer> temp = new ArrayList<>() ; 
            temp.add(1) ; 
            ans.add(temp) ; 
            return ans;
        }
        
        int[][] board = new int[n][n] ; 
        helper(board,0,ans) ; 
        return ans ; 
    }
      
}
