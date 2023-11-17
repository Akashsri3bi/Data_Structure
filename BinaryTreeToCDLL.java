import java.util.ArrayList;

public class BinaryTreeToCDLL {

          Node head = null , prev = null ;
    Node bTreeToClist(Node root)
    {
        //your code here
        ArrayList<Node> al = new ArrayList<>() ;
        inorder(root,al) ; 
        int n = al.size() ; 
        for(int i = 0;i<n;i++){
            Node curr = al.get(i) ; 
            if(head==null){
                head = prev = curr ; 
            }else{
                prev.right = curr ; 
                curr.left = prev ; 
            }
            prev = curr;
        }
        head.left = prev; 
        prev.right = head ; 
        return head ; 
        
    }
    static void inorder(Node root,ArrayList<Node> al){
        if(root==null){
            return ;
        }
        inorder(root.left,al) ; 
        al.add(root) ; 
        inorder(root.right,al); 
    }
      
}
