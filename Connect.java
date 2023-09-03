import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Pair{
    Node node ; 
    int level ; 
    Pair(Node node , int level){
        this.node = node ;
        this.level = level;
    }
}
public class Connect {
          public void connect(Node root)
    {
        // Your code goes here.
        Queue<Node> q = new LinkedList<>() ; 
        ArrayList<Pair> list = new ArrayList<>() ;
        int level = 0 ; 
        q.add(root) ; 
        while(!q.isEmpty()){
            int n = q.size() ; 
            while(n>0){
                Node curr = q.poll() ;
                list.add(new Pair(curr , level)) ; 
                if(curr.left!=null){
                q.add(curr.left) ; 
                }
                if(curr.right!=null){
                q.add(curr.right) ; 
                }
                n--;
            }
            level++;
        }
        
        for(int i = 0 ;i<list.size()-1;i++){
                Pair curr = list.get(i) ; 
                Pair next = list.get(i+1) ; 
                if(curr.level==next.level){
                    curr.node.nextRight = next.node ; 
                }
            }
            
        
    }
      
}
