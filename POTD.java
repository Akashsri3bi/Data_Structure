import java.util.PriorityQueue;

public class POTD {

          static void f(Node node , int count , PriorityQueue<Integer> pq){
        if(node==null){
            return ;
        }else if(node.left==null && node.right==null){
            pq.add(count) ;
            return ;
        }
        
        f(node.left , count+1 , pq) ; 
        f(node.right , count+1 , pq) ; 
    }
    public int getCount(Node node, int bud)
    {
        //code here  
        PriorityQueue<Integer> pq = new PriorityQueue<>() ; 
        f(node,1,pq) ;
        int count = 0; 
        while(bud>=0 && !pq.isEmpty()){
            int ele = pq.poll() ; 
            bud = bud-ele ; 
            if(bud>=0){
                count++;
            }
        }
        
        return count ; 
        
    }
      
}
