import java.util.ArrayList;
import java.util.List;

public class ConvertBSTToMaxHeap {
      
      static List<Integer> list = new ArrayList<>() ; 
      static int index = 0 ; 
      
      static class Node {
            int data;
            Node left, right;
      };
      public static void convertToMaxHeapUtil(Node root){
            inorder(root) ; 
            postorder(root) ; 
      }

      public static void inorder(Node root){
            if(root==null){
                  return  ; 
            }
            inorder(root.left);
            list.add(root.data);
            inorder(root.right) ; 
      }

      public static void postorder(Node root) {
            if (root == null) {
                  return;
            }
            postorder(root.left);
            postorder(root.right);
            root.data = list.get(index++) ;
      }
      
}
