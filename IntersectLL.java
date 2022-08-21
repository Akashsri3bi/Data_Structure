public class IntersectLL {

      public static Node findIntersection(Node head1, Node head2) {
            Node p1 = head1 ; 
            Node p2 = head2 ; 
            Node head = null , tail = null ; 
            while(p1!=null && p2!=null){
                  if(p1.info>p2.info){
                        p2 = p2.next ; 
                  }else if(p2.info>p1.info){
                        p1 = p1.next ; 
                  }else{
                        if(head==null || tail==null){
                              head = tail = new Node() ; 
                              head.info =tail.info = p1.info ; 
                        }else{
                              tail.next = new Node() ;
                              tail.next.info = p1.info ; 
                              tail = tail.next ; 
                              p1 = p1.next ; 
                              p2 = p2.next  ;
                        }                        
                  }
            }
            return head ; 
      }

      public static void main(String[] args) {
            
      }
      
}
