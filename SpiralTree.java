import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class SpiralTree {

          ArrayList<Integer> findSpiral(Node root) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>() ; 
        if(root==null){
            return ans ;
        }
        
        Queue<Node> q = new LinkedList<>() ; 
        int count = 0 ; 
        q.add(root) ; 
        
        while(!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>() ; 
            int size = q.size() ; 
            for(int i = 0 ;i<size ;i++){
                Node top = q.poll() ; 
                list.add(top.data) ; 
                
                if(top.left!=null){
                    q.add(top.left) ; 
                    
                }
                if(top.right!=null){
                    q.add(top.right) ; 
                }
                
            }
            
            if(count%2==0){
               Collections.reverse(list);
            }
            
            for(int i : list){
                ans.add(i) ; 
            }
            
            count++; 
        }
        
        return ans ;
    }
      
}
