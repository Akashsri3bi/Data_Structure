import java.util.ArrayList;
import java.util.Collections;

public class WordBoggle {

          static boolean isValid(int r, int c,char[][] board){
        if(r>=0 && r<board.length && c>=0 && c<board[0].length){
            return true ;
        }
        return false;
    }
        
    static boolean dfs(char board[][] , String s,int i,int j,boolean[][] vis , int idx){
        if(idx==s.length()){
            return true ; 
        }
        
        int[] row = new int[]{1,0,0,-1,1,-1,-1,1} ; 
        int[] col = new int[]{0,1,-1,0,1,-1,1,-1};
        
        if(isValid(i,j,board) && !vis[i][j] && board[i][j] == s.charAt(idx)){
            vis[i][j] = true ; 
            for(int k = 0 ;k<8;k++){
                int newr = i + row[k] ; 
                int newc = j + col[k] ; 
                
                if(dfs(board,s,newr,newc,vis,idx+1)){
                    return true; 
                }
            }
            
            vis[i][j] = false ; 
        }
        
        return false;
    }
    static boolean check(char board[][] , String s){
        
        int n = board.length ; 
        int m = board[0].length ; 
        
        boolean[][] vis = new boolean[n][m] ; 
        int idx = 0 ;
        for(int r = 0 ; r<n ;r++){
            for(int c=0;c<m;c++){
                if(board[r][c]==s.charAt(idx)){
                    if(dfs(board,s,r,c,vis,idx)){
                        return true ; 
                    }
                }
            }
        }
        
        return false ; 
        
    }
    public String[] wordBoggle(char board[][], String[] dictionary)
    {
        // Write your code here
        ArrayList<String> list = new ArrayList<>() ;
        
        for(String s : dictionary){
            if(check(board,s)){
                list.add(s) ; 
            }
        }
        
        Collections.sort(list) ; 
        
        String[] ans = new String[list.size()]; 
        int i = 0 ; 
        for(String s :  list){
            ans[i] = s;
            i++;
        }
        
        return ans ; 
        
    }
      
}
