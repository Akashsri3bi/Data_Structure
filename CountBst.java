public class CountBst {

          
    
    int getCount(Node root,int l, int h)
    {
        //Your code here
        if(root==null){
            return 0 ; 
        }
        boolean flag = false; 
        int x = getCount(root.left , l,h) ; 
        if(root.data>=l && root.data<=h){
            flag = true ; 
        }
        int y = getCount(root.right , l , h) ; 
        if(flag==true){
            return x+y+1 ;
        }
        
        return x+y ; 
    }
      
}
