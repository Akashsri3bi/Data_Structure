import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class CommonElements {

          public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        //Your code here
         //Your code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        
        for(int i=0; i<v2.length; i++){
            treeMap.put(v2[i], treeMap.getOrDefault(v2[i], 0)+1);
        }
        
        for(int i=0; i<v1.length; i++){
            
            if(treeMap.containsKey(v1[i]) && treeMap.get(v1[i]) != 0){
                
                // 1. substract it freq by 1
                treeMap.put(v1[i], treeMap.get(v1[i])-1);
                
                // 2. adding that common element into the result list
                list.add(v1[i]);
            }
        }
        
        Collections.sort(list);
        return list; 
 }
      
}
