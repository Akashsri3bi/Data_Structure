public class DeletionLL {

      static Node deleteNode(Node head, int key){
            if(head==null|| head.next==null){
                  return head ; 
            }

            // Else if the list is not empty  
            Node curr = head ; 
            Node prev = null ;
            while(curr.info!=key){
                  if(curr.next==head){
                        break ; 
                  }

                  prev = curr ; 
                  curr = curr.next ;
            }

            // If only node 
            if(curr==head && curr.next == head){
                  head = null ;
                  return head ;
            } 

            // If more than one node present ; 
            // checking for the first node ;

            if(curr==head){
                  prev = head ; 
                  while(prev.next!=head){
                        prev = prev.next ; 
                  }

                  head = curr.next ; // A little way of just writting  
                  prev.next = head ; 
            }else if(curr.next==head){
                  prev.next = head ; 
            }else{
                  prev.next = curr.next ;
            }

            return head ; 


      }

      public static void main(String[] args) {
            
      }
      
}
