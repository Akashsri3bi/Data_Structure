public class QuickSortLL {

      public static Node getTail(Node node){
            Node temp = node  ; 
            while(temp!=null && temp.next!=null ){
                  temp = temp.next ; 
            }
            return temp ;
      }

      static class Res{
            Node newhead = null , newend = null ;
      }

      public static Node partition(Node head , Node last , Res r  ,Res s){
            Node pivot = last ; 
            Node prev = null , curr = head , tail = pivot ; 

            while(curr!=pivot){
                  if(curr.info<pivot.info){
                        if(r.newhead==null){
                            r.newhead = curr ;
                        }
                        prev = curr ; 
                        curr = curr.next ; 
                  }else{
                        if(prev!=null){
                              prev.next = curr.next ; 
                        }

                        Node temp = curr.next ; 
                        curr.next = null ; 
                        tail.next = curr ; 
                        tail = curr ; 
                        curr = temp ; 
                  }
            }

            if(r.newhead==null){
                  r.newhead = pivot ; 
            }

            s.newend = tail ;
            return pivot ; 
      }

      public static Node quickSortRec(Node head , Node tail){
            if(head==null || head==tail){
                  return head ; 
            }

            Res s = new Res() ; 
            Res r = new Res() ; 

            //Now we will find our pivot which is usually taken as the last element  
            Node pivot = partition(head , tail , r , s) ;
            if(r.newhead!=pivot){
                  // then in this case we would have to apply our quicksort recursion
                  //on the first half of it 
                  Node temp = r.newhead ; 
                  
                  while(temp.next!=pivot){
                        temp = temp.next ;
                        temp.next = null ;
                  }

                  r.newhead = quickSortRec(r.newhead,temp) ;
                  temp = getTail(r.newhead);
                  temp.next = pivot ; 

            }
            pivot.next = quickSortRec(pivot.next , s.newend) ;
            return r.newhead ;
      }

      public static Node quickSort(Node node){
            // Here we will call our quickort recursion function on both head and tail 
            node = quickSortRec(node , getTail(node)) ; 
            return node ; 
      }

      public static void main(String[] args) {
            
      }
      
}
