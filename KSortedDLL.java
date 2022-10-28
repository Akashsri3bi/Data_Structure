import java.util.Comparator;
import java.util.PriorityQueue;

public class KSortedDLL {

      static class Node {
            int data;
            Node next, prev;
      };

      class compareNode implements Comparator<Node>{

            @Override
            public int compare(Node o1, Node o2) {
                  return o1.data-o2.data;
            }
            
      }


      Node sortAKSortedDLL(Node head, int k){
            if(head==null){
                  return head ; 
            }

            PriorityQueue<Node> pq = new PriorityQueue<Node>(new compareNode()) ; 

            Node newhead = null , last = null ;
            
            for(int i = 0 ; head!=null && i<=k ; i++){
                  // pushing thee current node in the prioriy queue 
                  pq.add(head) ; 
                  head = head.next ; 
            }

            while(!pq.isEmpty()){
                  if(newhead==null){
                        newhead = pq.peek() ; 
                        newhead.prev = null; 
                  }else{
                        last.next = pq.peek() ; 
                        pq.peek().prev = last ; 
                        last = pq.peek() ;
                  }


                  //To remove the node from priority queue an add the new one 
                  pq.poll(); 
                  if(head!=null){
                        pq.add(head) ; 
                        head = head.next ; 
                  }
            }

            //MAking 'next' of last node point to null
            
            last.next = null ; 
            return newhead ; 

      }

      public static void main(String[] args) {
            
      }
      
}
