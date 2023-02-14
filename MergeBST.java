import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeBST {

      static class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }

      static void inorder(Node root , ArrayList<Integer> list){
        if(root==null){
            return ; 
        }
        
        inorder(root.left , list) ; 
        list.add(root.data) ; 
        inorder(root.right , list) ; 
        
        
    }
    public List<Integer> merge(Node root1,Node root2)
    {
        // Write your code here
        ArrayList<Integer> list = new ArrayList<>() ; 
        inorder(root1 , list) ; 
        inorder(root2 , list) ; 
        Collections.sort(list);
        
        return list ; 
        
    }
      
}
