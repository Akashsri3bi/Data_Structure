public class CountLeave {

          int countLeaves(Node node) 
    {
        // Your code  
        int count = 0 ;
        if(node==null){
            return 0 ; 
        }
        if(node.left==null && node.right==null){
            return 1 ; 
        }
        count+=countLeaves(node.left) ; 
        count+=countLeaves(node.right) ;
        
        return count ; 
        
    }
      
}
