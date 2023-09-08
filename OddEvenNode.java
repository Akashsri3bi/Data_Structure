import java.util.LinkedList;
import java.util.Queue;

public class OddEvenNode {
      	int getLevelDiff(Node root)
	{
	    //code here
	    boolean flag = false ;
	    int sum = 0 ;
	    Queue<Node> q = new LinkedList<>() ;
	    q.add(root) ; 
	    while(!q.isEmpty()){
	        int n = q.size() ; 
	        for(int i = 0 ;i<n ; i++){
	            Node curr = q.poll() ; 
	            if(flag){
	                sum-= curr.data ; 
	            }else{
	                sum+= curr.data ; 
	            }
	            if(curr.left!=null){
	                q.add(curr.left) ; 
	            }
	            if(curr.right!=null){
	                q.add(curr.right) ; 
	            }
	        }
	        if(flag){
	            flag = false ; 
	        } else{
	            flag = true ; 
	        }
	    }
	    
	    return sum ; 
	}
      
}
