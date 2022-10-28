

public class Sort012 {

      // LinkedList with given elements 0 1 2 sort it 

      /*class Node{ 
            int data ; 
            Node next ; 

            Node(int data){
                  this.data= data;
                  next = null;  
            }

      }*/


      // Function to sort a linked list of 0s, 1s and 2s.
      static Node segregate(Node head) {
            int[] count = {0,0,0} ; 
            Node curr = head ; 
            while(curr!=null){
                  count[curr.info]++ ;
                  curr = curr.next ; 
            }

            int i = 0 ; 
            Node ptr = head;
            while(ptr!=null){
                  if(count[i]==0){
                        i++; 
                  }else{
                        ptr.info = i ; 
                        --count[i] ; 
                        ptr = ptr.next ; 

                  }
            }

            return head ; 

      }
      public static void main(String[] args) {
            
      }
      
}
