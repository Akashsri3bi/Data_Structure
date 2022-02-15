import java.util.HashMap;
import java.util.Map;

//Element common in all row in the matrix 
public class CommonRowElement {
      static void printCommonElements(int mat[][]){
            HashMap<Integer , Integer> map = new HashMap<>() ; 
            for(int j = 0 ; j < mat[0].length ; j++){
                  map.put(mat[0][j], 1) ;
            }

            for(int i =1 ; i < mat.length ; i++){
                  for(int j = 0 ; j < mat[0].length ; j++){
                        if(map.get(mat[i][j])!=null && map.get(mat[i][j])==i){
                              map.put(mat[i][j], i+1) ; 
                        }
                  }
            }

            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                  if(entry.getValue()==mat.length){
                        System.out.print(entry.getKey()+" ");
                  }
            }
      }
      public static void main(String[] args) {
            int mat[][] = {
                        { 1, 2, 1, 4, 8 },
                        { 3, 7, 8, 5, 1 },
                        { 8, 7, 7, 3, 1 },
                        { 8, 1, 2, 7, 9 },
            };

            printCommonElements(mat);
      }
      
}
