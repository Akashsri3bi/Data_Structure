public class PairsDLL {

      static class Node {
            int data;
            Node next, prev;
      };

      static int pairSum(Node head, int x){
            Node first = head ; 
            Node second = head ;
            int count = 0  ; 
            while(second.next!=null){
                  second = second.next; 
            }

            boolean find = false ; 
            while(first!=second && second.next!=first){
                  if((first.data+second.data)==x){
                        count++ ;
                        first = first.next ; 
                        second = second.prev ;
                        find = true ;
                  }else{
                        if((first.data+second.data)<x){
                              first = first.next ;

                        }else{
                              second = second.prev ;
                        }
                  }
            }

            if(find==false){
                  System.out.print("No Pair found");
            }

            return count ;
      }
      static int countPairs(Node first , Node second , int target){
            int count = 0 ;
            while (first!=null && second!=null && first != second && second.next != first) {
                  if ((first.data + second.data) == target) {
                        count++;
                        first = first.next;
                        second = second.prev;
                  } else {
                        if ((first.data + second.data) < target) {
                              first = first.next;

                        } else {
                              second = second.prev;
                        }
                  }
            }

            return count ;
      }
      //Counting triplets in the doubly linkedlist ;
      static int countTriplets(Node head, int x){
            if(head==null){
                  return 0 ;
            }

            int count = 0 ; 

            Node current , first , last ; 
            last = head ; 
            while(last.next!=null){
                  //Two pointer approach 
                  last = last.next ;
            }

            for(current=head ; current!=null ; current = current.next){
                  first = current.next ;
                  count+=countPairs(first, last, x-current.data); 
            }

            return count ;
      }

      public static void main(String[] args) {
            
      }
      
}
