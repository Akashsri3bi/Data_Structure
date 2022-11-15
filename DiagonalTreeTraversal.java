import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class DiagonalTreeTraversal {

      class Node {
            int val;
            Node left, right;

            Node(int data) {
                  val = data;
                  left = null;
                  right = null;
            }
      }

      public ArrayList<Integer> diagonal(Node root) {
            // add your code here.
            ArrayList<Integer> ans = new ArrayList<>();
            Queue<Node> q = new ArrayDeque<>() ;  
            q.add(root) ; 
            while(!q.isEmpty()){
                  
                  Node curr = q.poll() ; 
                  
                  while(curr!=null){
                        ans.add(curr.val);
                        if(curr.left!=null){
                              q.add(curr.left) ; //This is our new head for second traversals
                        }
                        curr = curr.right ; //Our diagonal traversal requirement 

                  }
            
            }
            return ans;
      }
      
}
