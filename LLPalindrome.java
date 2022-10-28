public class LLPalindrome {

      static Node reverseList(Node head){
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


      static Node findMiddle(Node head){
            Node slow = head ; 
            Node fast = head ; 
            while(fast.next!=null && fast.next.next!=null){
                  slow = slow.next ; 
                  fast = fast.next.next ; 
            }

            return slow ; 
      }

      boolean isPalindrome(Node head) {
            Node curr = head ; 
            Node mid = findMiddle(head) ;
            Node temp = reverseList(mid) ; 

            while(curr!=null && temp!=null){
                  if(curr.info!=temp.info){
                        return false ; 
                  }

                  curr = curr.next ; 
                  temp = temp.next ; 
            }

            return true ; 
      }

      public static void main(String[] args) {
            
      }
      
}
