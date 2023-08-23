import java.util.ArrayList;

public class GridCheck {
      class Pair{
    int i ;  int j ;
    Pair(int i , int j){
        this.i = i  ;
        this.j = j ; 
    }
}

    static boolean isValid(int r , int c , char[][] grid){
        int n = grid.length ; 
        int m = grid[0].length ; 
        if(r>=0 && r<n && c>=0 && c<m){
            return true ; 
        }else{
            return false ; 
        }
    }
    public int[][] searchWord(char[][] grid, String word)
    {
        // Code here
        ArrayList<Pair> ans = new ArrayList<>()  ; 
        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[]{-1,0,1,0,1,-1,1,-1} ; 
        int[] col = new int[]{0,-1,0,1,1,-1,-1,1} ;
        
        for(int i = 0 ;i<grid.length ; i++){
            for(int j = 0 ;j<grid[0].length ; j++){
                if(grid[i][j]==word.charAt(0)){
                    for(int k = 0 ;k<8 ; k++){
                        int r = i ; 
                        int c = j ; 
                        int l ; 
                        
                        //We cannot go zig zag in every direction we need pure dfs
                        for(l = 1 ; l<word.length();l++){
                            int newrow = r + row[k] ; 
                            int newcol = c + col[k] ; 
                            
                            if( newrow < 0 || newrow >= n || newcol < 0 || newcol >= m || grid[newrow][newcol] != word.charAt(l)){
                                break ;
                            }
                        //If mil gaya toh naya value ussi direction mein nayi row and column se dekhni hogi na  
                        r = newrow ; 
                        c = newcol ;
                        }
                        if(l==word.length()){
                            ans.add(new Pair(i,j));
                            break ;
                        }
                        //Avoid adding duplicates if (0,0) se multiple answer 
                        //possible hain tobhi lenge uske ek baar hi
                        
                       
                    }
                    
                }
            }
        }
        
        
        
        int[][] res = new int[ans.size()][2] ; 
        int i=0;
        for(Pair p : ans){
            res[i][0] = p.i;
            res[i][1] = p.j ; 
            i++;
        }
        return res; 
        
    }
}
      
