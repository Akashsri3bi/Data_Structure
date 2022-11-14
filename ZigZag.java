import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class ZigZag {

      class Node {
            int val;
            Node left, right;

            Node(int data) {
                  val = data;
                  left = null;
                  right = null;
            }
      }
      
      ArrayList<Integer> zigZagTraversal(Node root) {
            ArrayList<Integer> list = new ArrayList<>() ; 
            if(root==null){
                  return list ; 
            }
            Queue<Node> q = new ArrayDeque<>() ;
            q.add(root) ; 
            boolean flag = true ; 
            while(!q.isEmpty()){
                  int size = q.size() ; 
                  ArrayList<Integer> res = new ArrayList<>() ; 
                  
                  for(int i = 0 ; i < size  ; i++){
                        Node curr = q.poll() ; 
                        if(curr.left!=null){
                              q.add(curr.left) ; 
                        } 
                        if(curr.right!=null){
                              q.add(curr.right) ; 
                        }
                        
                        res.add(curr.val) ; 
                  }

                  if(!flag){
                        Collections.reverse(res);
                  }

                  for(int i = 0 ; i<res.size() ; i++){
                        list.add(res.get(i)) ; 
                  }
                  flag = !flag ;
            }

            return list ; 
      }
      
}
