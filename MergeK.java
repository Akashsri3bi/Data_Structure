import java.util.* ; 

public class MergeK {

    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        // Write your code here.
        ArrayList<Integer> list = new ArrayList<>() ; 
        for(int i = 0  ; i<K ; i++){
            for(int j = 0 ; j<K ; j++){
                list.add(arr[i][j]) ; 
            }
        }
        Collections.sort(list) ; 
        return list ; 
    }
      
}
