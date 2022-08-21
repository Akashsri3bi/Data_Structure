public class FirstNodeLoop {

      static Node detectFirstNode(Node head){

            if(head==null || head.next==null){
                  return head ; 
            }

            Node slow = head ;
            Node fast = head ; 
            while(fast!=null && fast.next!=null){
                  slow = slow.next ; 
                  fast = fast.next.next ; 
                  if(slow==fast){
                        break ; 
                  }
            }

            if(slow==head){
                  while(fast.next!=slow){
                        fast = fast.next ; 
                  }

                  return fast ; 
            }
            if (slow != fast) {
                  return null;
            }

            slow = head ; 
            while(fast.next!=slow.next){
                  slow = slow.next ; 
                  fast = fast.next ; 
            }

            return slow ;


      }

      public static void main(String[] args) {
            
      }
      
}
