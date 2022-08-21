public class ReverseLL {
      //Iterative approach 
      static class Node{
            int data  ; 
            Node next ; 

            Node(int d){
                  data = d ;
                  next = null ; 
            }
      }
      
      // Iterative approach

      Node reverse(Node head){
            Node curr = head ;
            Node prev = null ; 
            while(curr!=null){
                  Node temp = curr.next ; 
                  curr.next = prev ; 
                  prev = curr ; 
                  curr = temp ; 
            }

            return prev ; 
      }

      //Recursive Approach  
      Node Recursivereverse(Node head){
            if(head==null|| head.next==null){
                  return head ; 
            }

            Node newHead = Recursivereverse(head.next) ;
            Node headNext = head.next ; 
            headNext.next = head ; 
            head.next = null ; 
            return newHead ;  
      }
      public static void main(String[] args) {
            
      }
      
}
