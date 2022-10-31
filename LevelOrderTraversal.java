import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

class LevelOrderTraversal{

      class Node{
           Node left , right ; 
           int data ; 

           Node(int item){
            data = item ;
            left = right = null ; 
      }

      }

      static ArrayList<Integer> levelOrder(Node node) {
            ArrayList<Integer> list = new ArrayList<>() ; 
            Queue<Node> q = new LinkedList<Node>() ; 
            
            q.add(node) ; 

            while(!q.isEmpty()){
                  Node curr = q.poll();
                  list.add(curr.data) ; 

                  if(curr.left!=null){
                        q.add(curr.left) ; 
                  }
                  if(curr.right!=null){
                        q.add(curr.right) ; 
                  }

            }
            return list  ; 
      }
      public static void main(String[] args) {
            
      }
}