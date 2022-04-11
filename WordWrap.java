class WordWrap{
      //Word wrap problem very Imp .
      static int max = Integer.MAX_VALUE ; 

      static void printSolution(int[] p , int n){
            if(p[n]==1){
                  System.out.print(p[n]+" "+ n + "  ") ; 
            }else{
                  printSolution(p, p[n]-1);
                  System.out.print(p[n] + " " + n + "  ");
            }
      }

      static void solveWordWrap(int[] arr , int n , int M){
            //This array will have value of extra spaces if words are put in a single line
            int extras[][] = new int[n+1][n+1] ;
            
            //This array will contain the value of cost of each line which is calculated using the given n*n formula

            int lc[][] = new int[n+1][n+1] ; 

            //This will contain cost of optimal arrangment of the words from i to j
            int c[] = new int[n+1] ; 

            //p[] this array will contain the solution to be printed 
            int p[] = new int[n+1] ; 

            //Filling our extra space array -->
            for(int i = 1 ; i <=n ; i++){
                  extras[i][i] = M-arr[i-1];
                  for(int j = i+1 ; j<=n ; j++){
                        extras[i][j] = extras[i][j-1] - arr[j-1] - 1 ; 
                  }
            }

            //Calculating the line costs related to above calculated spaces 
            for(int i =1 ; i<=n ; i++){
                  for(int j =i ; j<=n ; j++){
                        if(extras[i][j]<0){
                              lc[i][j] = max ; 
                        }else if(j==n && extras[i][j]>=0){
                              lc[i][j] = 0 ; 
                        }else{
                              lc[i][j] = extras[i][j]*extras[i][j] ;
                        }
                  }
            }

            //Calculate the minimum cost and find the minimum cost arrangement 
            //The value c[j] indicates optimized cost to arrange words from number 1 to j

            c[0] = 0 ; 
            for(int j = 1 ; j<=n ; j++){
                  c[j] = max ; 
                  for(int i = 1 ; i <=j ; i++){
                        if(c[i-1]!=max && lc[i][j]!=max && lc[i][j]+c[i-1]<c[j]){
                              c[j] = lc[i][j]+c[i-1] ; 
                              p[j] = i ; 
                        }
                  }
            }

            printSolution(p, n);

            

      }
      public static void main(String[] args) {
            int[] arr = {3,2,2,5} ; 
            int n = arr.length ; 
            int M = 6 ; 
            solveWordWrap(arr, n, M);

      }
}