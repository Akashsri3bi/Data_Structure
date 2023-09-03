import java.util.ArrayList;

public class SerializeDeserialize {

      	public void serialize(Node root, ArrayList<Integer> A) 
	{
	    //code here
	    if(root==null){
	        A.add(-1) ;
	        return;
	    }
	    A.add(root.data) ;
	    serialize(root.left,A) ;
	    serialize(root.right,A) ; 
	}
	
	//Function to deserialize a list and construct the tree.
	int i = 0 ;
    public Node deSerialize(ArrayList<Integer> A)
    {
        //code here
        if(i==A.size()){
            return null ; 
        }
        
        int val = A.get(i) ; 
        i++;
        if(val==-1){
            return null; 
        }
        Node parent = new Node(val) ; 
        parent.left = deSerialize(A);
        parent.right = deSerialize(A) ; 
        return parent ; 
    }
      
}
