public class SegregateLL {

      Node divide(int N, Node head){
            Node curr = head ; 
            Node evenhead = null ; 
            Node oddhead = null ; 
            Node evenTail = null ; 
            Node oddTail = null ; 
            while(curr!=null){
                  if(curr.info%2!=0){
                        if(oddhead==null){
                              oddhead = curr ;
                              oddTail = curr ; 
                        }else{
                              oddTail.next = curr ; 
                              oddTail = oddTail.next ; 
                        }
                  }else{
                        if (evenhead == null) {
                              evenhead = curr;
                              evenTail = curr;
                        } else {
                              evenTail.next = curr;
                              evenTail = evenTail.next;
                        } 
                  }
                  curr = curr.next ; 
            }

            if(oddhead==null){
                  evenTail.next = null ; 
                  return evenhead ; 
            }else if(evenhead==null){
                  oddTail.next = null  ; 
                  return oddhead ; 
            }else{
                  oddTail.next = null ; 
                  evenTail.next = oddhead ; 
                  return evenhead ;
            }
      }
      public static void main(String[] args) {

      }
}
