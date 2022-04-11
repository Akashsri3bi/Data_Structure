import java.util.ArrayList;
public class StringinGrid {

      // For searching in all 8 direction
      static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
      static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };

      static boolean search(char[][] grid , int row , int column , String word){
            
            if (grid[row][column] != word.charAt(0)) {
                return false ;
            }

            int len = word.length() ;

            for(int dir = 0 ;  dir < 8 ; dir++){
                  int k ; 
                  int rd = row + x[dir] ;
                  int cd = column + y[dir] ; 
            for(k = 1 ; k<=len ; k++){
                  //Boudary condition check 
                  if(rd<0 || rd>=grid.length || cd<0 || cd>=grid[0].length){
                        break ; 
                  }
                  if(grid[rd][cd]!=word.charAt(k)){
                        break ; 
                  }

                  //Else we will move into that particular direction ;
                  rd+=x[dir] ;
                  cd+=y[dir] ; 
            }

            if(k==len){
                  return true  ;
            }
      }

      return false ; 
      }

      public int[][] searchWord(char[][] grid, String word) {
            ArrayList<int[]> list = new ArrayList<>();
            int n = grid.length ;
            int m = grid[0].length ; 
            for(int i = 0 ; i <n ; i++){
                  for(int j = 0 ; j < m ; j++){
                        if(grid[i][j]==word.charAt(0) && search(grid , i , j , word)){
                              list.add(new int[] { i, j });
                        }
                  }
            }

            int[][] out = new int[list.size()][2] ;
            for(int i = 0 ; i < list.size() ; i++){
                  out[i][0] = list.get(i)[0] ;
                  out[i][1] = list.get(i)[1] ;
            }

            return out ;
      }
      public static void main(String[] args) {
            
      }
      
}
