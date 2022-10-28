public class RotateDLLN {

      class Node {
            int data;
            Node next, prev;
      }

      //Rotate a doubly LinkedList in Group of Given Size 
      static Node reverseByN(Node head , int k){
            if(head==null){
                  return null ; 
            }
            head.prev = null ; 
            Node temp; 
            Node curr = head ; 
            Node newhead = null ;
            int count = 0 ; 

            while(curr!=null && count<k){

                  //This piece of Code that you seee here is just reversing the nodes in LinkedList 
                  newhead = curr ; 
                  temp = curr.prev ; 
                  curr.prev = curr.next ; 
                  curr.next = temp ; 
                  curr = curr.prev ; 
                  count++ ; 
            }

            if(count>=k){
                  // This piece of code will be executed when an iteration cycle completes 
                  // and moves to next group
                  Node rest = reverseByN(curr, k) ;
                  head.next = rest ; 
                  if(rest!=null){
                        rest.prev = head ; 
                  }

            }

            return newhead ;
            
      }
      
}
