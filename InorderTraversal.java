import java.util.Stack;
public class InorderTraversal {

      
      class Node{
            int val ; 
            Node left , right ; 
            Node(int data){
                  val = data ; 
                  left = null ; 
                  right = null ; 
            }
      }

      // 1st Approach which is recursive
      public static void inorderTraversal(Node root){
            if(root==null){
                  return ; 
            }

            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right) ; 
      }

      // 2nd Approach which is iterative 
      public static void iterativeInorder(Node root){
            Stack<Node> s = new Stack<>() ; 

            Node curr = root ; 
            while(!s.isEmpty() || curr!=null){
                  if(curr!=null){
                        s.push(curr) ;
                        curr = curr.left ; 
                  }else{
                        curr = s.pop() ; 
                        System.out.print(curr.val + " ") ; 
                        curr = curr.right; 
                  }
            }
      }
      
}
