public class LCS {
      //Longest Common Subsequence in the given String  
      static int lcs(int x, int y, String s1, String s2) {
            //Naive Recursive approach

            /*
            if(x==0 || y==0){
                  return 0 ; 
            }if(s1.charAt(x-1)==s2.charAt(y-1)){
                  return 1 + lcs(x-1, y-1, s1, s2);
            }else{
                  return Math.max(lcs(x-1, y, s1, s2), lcs(x, y-1, s1, s2));
            }*/

            //Using the approach of memoization or Tabulation 
            int[][] L = new int[x+1][y+1] ; 
            for(int i = 0 ; i <=x ; i++){
                  for(int j = 0 ; j<=y ; j++){
                        //Agar hamari ek poori string ki length zero hai ya doosri wali ki length 0 hai
                        //toh usske liye longest common subsequence 0 hoga
                        if(i==0 || j==0){
                              L[i][j]= 0 ;                       
                        }else if(s1.charAt(i-1)==s2.charAt(j-1)){
                              L[i][j] = L[i-1][j-1] + 1 ; 
                        }else{
                              L[i][j] = Math.max(L[i][j-1], L[i-1][j]);

                        }
                  }
            }

            return L[x][y] ;
      }
      public static void main(String[] args) {
            System.out.println(lcs(27, 12, "GEBEOCFUFTSXDIXTIGSIEEHKCHZ", "DFLILRJQFNXZ")) ;
      }
      
}
