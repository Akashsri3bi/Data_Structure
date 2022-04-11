public class NumberofString2DArray {
      //Count the number of given string in the 2D Array
      static int solve(int i , int j ,String pattern ,char hay[][] , int size , int idx){
            int found = 0 ; 
            if(i>=0 &&  j>=0 && i<hay.length && j<hay.length && pattern.charAt(idx)==hay[i][j]){
                  char temp = pattern.charAt(idx) ; 
                  hay[i][j] = 0 ; 
                  idx+=1 ;
                  if(idx==size){
                        found=1 ; 
                  }else{
                        found+=solve(i+1, j, pattern, hay, size, idx);
                        found+=solve(i-1, j, pattern, hay, size, idx) ;
                        found += solve(i, j+1 , pattern, hay, size, idx);
                        found += solve(i, j-1, pattern, hay, size, idx);

                  }

                  hay[i][j] = temp ; 
            }

            return found ; 
      }

      static int Count(char hay[][] , String s){
            int ans =  0 ; 
            int size = s.length() ; 
            //first loops to search the whole array of character 
            for(int i = 0 ; i  <= size  ; i++){
                  for(int j = 0  ;  j <= size ; j++){
                        ans+=solve(i, j, s, hay, size, 0) ; //idx is the start position for our pattern String
                  }
            }

            return ans ; 
      }
      public static void main(String[] args) {
            String s = "GEEKS" ;
            char[][] hay = {
            {'D','D','D','G','D','D'},
            {'B','B','D','E','B','S'},
            {'B','S','K','E','B','K'},
            {'D','D','D','D','D','E'},
            {'D','D','D','D','D','E'},
            {'D','D','D','D','D','G'}
           } ; 
            System.out.println(Count(hay, s));
      }
      
}
