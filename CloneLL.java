public class CloneLL {

      //This is base node class ;
      static class Node {
            int data;
            Node next, random;

            Node(int x) {
                  data = x;
                  next = random = null;
            }
      }

      // Clone a LinkedList using next and random pointer  
      Node copyList(Node head) {
            Node curr = head  , temp = null ; 
            while(curr!=null){
                  temp = curr.next ; 
                  curr.next = new Node(curr.data) ;
                  curr.next.next = temp; 
                  curr = temp; 
            }

            // After this process is completed we will connect our random pointers with the help
            // of previous linkedlist . 

            curr = head ; 
            while(curr!=null){
                  if(curr.next!=null){
                        curr.next.random = (curr.random!=null) ? curr.random.next : null ;
                  }
                  curr = curr.next.next ; 
            }

            // Saving the copied linkedlist 
            Node original = head ; 
            Node copied = head.next ;
            temp = copied ;

            // Now we need to seperate the original list with copied list 
            while(original!=null){
                  original.next = original.next.next ; 

                  copied.next = (copied.next!=null)?copied.next.next : copied.next ;

                  original = original.next ; 
                  copied = copied.next ; 
            }

            // Now return temp which is storing the head of the copied LinkedList 
            return temp ; 
      }

      public static void main(String[] args) {
            
      }
      
}
