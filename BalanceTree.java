import java.util.ArrayList;
import java.util.Collections;

public class BalanceTree {
          static void fill(ArrayList<Integer> list , Node root){
        if(root==null){
            return  ;
        }
        list.add(root.data);
        fill(list , root.left);
        fill(list , root.right) ; 
    }
    static Node build(ArrayList<Integer> list , int start , int end){
        if(start>end){
            return null ;
        }
        int mid = (start+end)/2 ; 
        Node root = new Node(list.get(mid)) ;
        root.left = build(list , start , mid-1) ; 
        root.right = build(list , mid+1,end) ; 
        return root ; 
    }
    Node buildBalancedTree(Node root) 
    {
        //Add your code here.
        ArrayList<Integer> list = new ArrayList<>() ; 
        fill(list , root) ; 
        Collections.sort(list) ; 
        Node root1 = build(list,0,list.size()-1) ; 
        return root1 ; 
    }
      
}
