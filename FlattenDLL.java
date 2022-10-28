public class FlattenDLL {

      class Node {
            int data;
            Node next;
            Node bottom;

            Node(int d) {
                  data = d;
                  next = null;
                  bottom = null;
            }
      }

      static Node mergeList(Node first , Node second){
            Node fh = null ;
            Node ft = null ; 
            while(first!=null && second!=null){
                  if(fh==null){
                        if(first.data<second.data){
                              fh = first; 
                              ft = first ; 
                              first = first.bottom ; 
                        }else{
                              fh = second ; 
                              ft = second; 
                              second = second.bottom ;
                        }
                  }else{
                        if(first.data<second.data){
                              ft.bottom = first ; 
                              first = first.bottom ; 
                              ft = ft.bottom ; 
                        }else{
                              ft.bottom = second ; 
                              second = second.bottom ; 
                              ft = ft.bottom;
                        }
                  }
            }

            if(first!=null){
                  ft.bottom = first ;  
            }

            if(second!=null){
                  ft.bottom = second ;
            }

            return fh ; 
      }
      Node flatten(Node root) {
            if(root==null){
                  return null ; 
            }
            if(root.next==null){
                  return root ; 
            }

            return mergeList(root , flatten(root.next)) ;
      }

      public static void main(String[] args) {
            
      }
      
}
