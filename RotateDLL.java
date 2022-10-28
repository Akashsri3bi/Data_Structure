public class RotateDLL {

      class Node {
            int data;
            Node next, prev;

            Node(int data) {
                  this.data = data;
                  next = null;
                  prev = null;
            }
      }
      public Node rotateDLL(Node start, int p) {
            if(p==0){
                  return start ;  
            }

            Node current = start ;
            int count = 1 ; 
            while(count<p && current!=null){
                  current = current.next ;
                  count++ ;
            }


            Node pointer = current ; 
            while(current.next!=null){
                  current = current.next ; 
            }

            current.next = start ; 
            start.prev = current ; 
            start = pointer.next ; 
            start.prev = null ; 
            pointer.next = null ; 
            return start ;
      }

      public static void main(String[] args) {
            
      }
      
}
