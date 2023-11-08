public class SnakePattern {
      static ArrayList<Integer> snakePattern(int matrix[][])
    {
        // code here 
        int n = matrix.length ; 
        ArrayList<Integer> ans = new ArrayList<>();
        boolean flag = true ; 
        for(int i = 0 ;i<n;i++){
            if(flag){
                for(int j = 0 ;j<n;j++){
                    ans.add(matrix[i][j]) ; 
                }
                flag = false ; 
            }else{
                for(int j = n-1 ;j>=0;j--){
                    ans.add(matrix[i][j]) ; 
                }
                flag = true ;
            }
        }
        return ans ;
    }
      
}
