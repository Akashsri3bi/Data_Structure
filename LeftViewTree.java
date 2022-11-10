import java.util.ArrayList;

public class LeftViewTree {

      class Node {
            int val;
            Node left, right;

            Node(int data) {
                  val = data;
                  left = null;
                  right = null;
            }
      }

      ArrayList<Integer> leftView(Node root) {
            ArrayList<Integer> list = new ArrayList<>() ; 
            leftCheck(root , list , 0) ; 
            return list ; 
      }

      public static void leftCheck(Node root , ArrayList<Integer> list , int level){
            if(root==null){
                  return ; 
            }
            if(level==list.size()){
                  list.add(root.val) ; 
            }

            leftCheck(root.left, list, level+1);
            leftCheck(root.right, list, level+1);
      }


      public static void main(String[] args) {
            
      }
      
}
