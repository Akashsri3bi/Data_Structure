public class ReverseDLL {

      class Node {
            int data;
            Node next, prev;

            Node(int data) {
                  this.data = data;
                  this.next = null;
                  this.prev = null;
            }
      }

      public static Node reverseDLL(Node head) {
            Node curr = head ; 
            Node temp = null ;
            while(curr!=null){
                  temp = curr.prev ; 
                  curr.prev = curr.next ; 
                  curr.next = temp ; 
                  curr = curr.prev ;
            }

            if(temp!=null){ 
                  head = temp.prev ;
            }

            return head ;
      }

      public static void main(String[] args) {
            
      }
      
}
