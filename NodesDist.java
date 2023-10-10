import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

class Node  
{ 
     int data; 
     Node left, right;
}
public class NodesDist {

          static void markParents(Node root, Map<Node , Node> parent_track , Node target){
        Queue<Node> q = new LinkedList<>(); 
        q.add(root) ; 
        while(!q.isEmpty()){
            Node curr = q.poll() ; 
            if(curr.left!=null){
                parent_track.put(curr.left , curr) ; 
                q.add(curr.left) ; 
            }
            if(curr.right!=null){
                parent_track.put(curr.right , curr) ; 
                q.add(curr.right) ; 
            }
        }
    }
    public static Node findNode(Node root , int target){
        if(root == null || root.data == target)
        return root;
        
        Node left = findNode(root.left , target);
        Node right = findNode(root.right , target);
        
        return left != null ? left : right;
    } 
    public static ArrayList<Integer> KDistanceNodes(Node root, int target , int k)
    {
        // return the sorted list of all nodes at k dist
        Map<Node , Node> parent_track = new HashMap<>() ; 
        markParents(root,parent_track,root) ; 
        
        Map<Node,Boolean> visited = new HashMap<>()  ;
        Queue<Node> q = new LinkedList<>() ; 
        q.offer(findNode(root,target)) ; 
        visited.put(findNode(root,target),true) ; 
        
        int curr_level = 0 ; 
        while(!q.isEmpty()){
            int q_size = q.size() ; 
            if(curr_level==k){
                break ; 
            }
            curr_level++;
            for(int i = 0 ;i<q_size ; i++){
                Node curr = q.poll() ; 
                if(curr.left!=null && visited.get(curr.left)==null){
                    q.offer(curr.left) ; 
                    visited.put(curr.left,true) ; 
                }
                if(curr.right!=null && visited.get(curr.right)==null){
                    q.offer(curr.right) ; 
                    visited.put(curr.right,true) ; 
                }
                if(parent_track.get(curr)!=null && visited.get(parent_track.get(curr))==null){
                    q.offer(parent_track.get(curr)) ; 
                    visited.put(parent_track.get(curr) , true) ; 
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>() ; 
        while(!q.isEmpty()){
            Node curr = q.poll() ; 
            list.add(curr.data) ; 
        }
        Collections.sort(list) ; 
        return list ; 
    }
      
}
