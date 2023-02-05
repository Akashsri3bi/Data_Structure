import java.util.*;

public class DuplicateSubTree1 {

      class Node {
            int data;
            Node left, right;

            public Node(int data) {
                  this.data = data;
            }
      }

      public static void main(String[] args) {
            
      }

      public List<Node> printAllDups(Node root) {
            // code here
            HashMap<String , Integer> map = new HashMap<>() ; 
            List<Node> result = new ArrayList<>() ;

            traverse(root,map,result) ;
            Collections.sort(result, (node1 , node2)->node1.data - node2.data);
            return result ; 

      }

      public static String traverse(Node root, HashMap<String, Integer> map,List<Node> result) {
            if(root==null){
                  return "$" ; 
            }

            String subpath = root.data + "," + traverse(root.left, map, result)  + "," + traverse(root.right, map, result) ; 
            map.put(subpath, map.getOrDefault(subpath , 0)+1) ;
            
            if(map.get(subpath)==2){
                  result.add(root) ;
            }

            return subpath ; 
      }

      
      
}
