public class LastToFront {

      void moveToFront(Node head){
            if(head==null || head.next==null){
                  return; 
            }

            Node curr =  head ; 
            while(curr!=null && curr.next.next!=null){
                  curr = curr.next ; 
            }

            Node temp = curr.next ; 
            curr.next = null ; 
            temp.next = head ;
            head = temp ; 
            return ;
      }

      public static void main(String[] args) {
            
      }
      
}
