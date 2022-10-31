import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseLevelOrderTraversal {
      class Node{
           Node left , right ; 
           int data ; 

           Node(int item){
            data = item ;
            left = right = null ; 
      }
}
      public ArrayList<Integer> reverseLevelOrder(Node node) {
            ArrayList<Integer> list = new ArrayList<>() ; 
            Queue<Node> q = new LinkedList<Node>() ; 
            
            q.add(node) ; 

            while(!q.isEmpty()){
                  Node curr = q.poll();
                  list.add(curr.data) ; 

                  if(curr.right!=null){
                        q.add(curr.right) ; 
                  }
                  if(curr.left!=null){
                        q.add(curr.left) ; 
                  }

            }

            Collections.reverse(list) ;
            return list ;  
            
      }
      public static void main(String[] args) {
            
      }
      
}
