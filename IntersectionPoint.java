public class IntersectionPoint {
      int intersectPoint(Node head1, Node head2) {
            Node x = head1  , y = head2 ; 

            while(true){
                  if(x==y){
                        return x.info ;     
                  }

                  if(x==null){
                        x = head2 ; 
                  }else{
                        x = x.next ; 
                  }


                  if(y==null){
                        y = head1;
                  }else{
                        y = y.next; 
                  }
            }

      }
      public static void main(String[] args) {

      }
      
}
