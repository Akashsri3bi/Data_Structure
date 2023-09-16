import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class SnakeNLadder {

          static int minThrow(int N, int arr[]){
        // code here
        Map<Integer , Integer> map = new HashMap<>() ; 
        Queue<Integer> q = new LinkedList<>() ; 
        for(int i = 0 ; i<2*N ; i+=2){
            map.put(arr[i] , arr[i+1]) ; 
        }
        
        q.add(1) ;
        Set<Integer> visited = new HashSet<>() ; 
        visited.add(1); 
        int steps = 0 ;
        while(!q.isEmpty()){
            
            int n = q.size() ; 
            for(int i = 0 ;i<n ;i++){
            int curr = q.poll() ; 
            if(curr==30){
                return steps;
            }
            for(int k = 1 ; k<=6 ; k++){
                int newV = curr + k ; 
                if(map.containsKey(newV)){
                    newV = map.get(newV) ; 
                }
                if(newV<=30 && !visited.contains(newV)){
                    q.add(newV) ; 
                    visited.add(newV) ; 
                }
            }
            }
            steps++;
            
        }
        
        return -1 ;
    }
      
}
