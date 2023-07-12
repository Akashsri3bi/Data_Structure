public class FloydWarshall {

          public void shortest_distance(int[][] matrix)
    {
        // Code here  
        
        // put 0 on node to node dist because distance from node to itself
        // will always be 0
        
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                if(matrix[i][j]==-1){
                    matrix[i][j] = (int)(1e9); 
                }
                if(i==j){
                    matrix[i][j] = 0 ; 
                }
            }
        }
        
        
        for(int via = 0 ; via < matrix.length ; via++){
            for(int i = 0 ; i < matrix.length ; i++){
                for(int  j = 0 ; j < matrix[i].length ; j++){
                    matrix[i][j] = Math.min(matrix[i][j] , matrix[i][via] + matrix[via][j]);
                    
                }
            }
        }
        
        
        for(int i = 0 ; i < matrix.length ; i++){
            for(int j = 0 ; j < matrix.length ; j++){
                if(matrix[i][j]==(int)(1e9)){
                    matrix[i][j] = -1 ;
                }
                
            }
        }
        
    }
      
}
