public class LeftMostNRightMost {

          public static void printCorner(Node node)
    {
        
        // add your code here   
        Queue<Node> q = new LinkedList<>() ; 
        q.add(node) ; 
        while(!q.isEmpty()){
            int n = q.size() ; 
            ArrayList<Integer> list = new ArrayList<>() ; 
            while(n>0){
                Node curr = q.poll() ;
                list.add(curr.data) ; 
                if(curr.left!=null){
                    q.add(curr.left) ; 
                }
                if(curr.right!=null){
                    q.add(curr.right) ; 
                }
                n--;
            }
            if(list.size()==1){
                    System.out.print(list.get(0)+" ");
                }else{
                    System.out.print(list.get(0)+" "+list.get(list.size()-1)+" ");
                }
        }
    }
      
}
