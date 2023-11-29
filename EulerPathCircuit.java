import java.util.List;

public class EulerPathCircuit {
          public int isEulerCircuit(int V, List<Integer>[] adj) 
    {
        // code here
        int even= 0 ; 
        int odd =0 ;
        for(int i = 0 ;i<V;i++){
            if(adj[i].size()%2==0){
                even++;
            }else{
                odd++;
            }
        }
        return even==V?2 : odd>0 && odd==2 ? 1 : 0 ; 
    }
}
