import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class CommonNodes {

          static void insert(Node root , Set<Integer> a){
        if(root==null){
            return  ; 
        }
        insert(root.left , a) ; 
        a.add(root.data) ; 
        insert(root.right , a) ; 
    }
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        Set<Integer> a = new HashSet<>() ; 
        Set<Integer> b = new HashSet<>() ; 
        insert(root1 , a) ; 
        insert(root2 , b) ; 
        
        ArrayList<Integer> ans = new ArrayList<>() ; 
        for(int i : a){
            if(b.contains(i)){
                ans.add(i) ; 
            }
        }
        Collections.sort(ans) ; 
        return ans ; 
    }
      
}
