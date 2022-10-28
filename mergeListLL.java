import java.util.Comparator;
import java.util.PriorityQueue;

public class mergeListLL {
      static void mergeList(Node first , Node second){
            Node curr = first ; 
            while(curr!=null){
                  if(curr.next==null){
                        curr.next = second ; 
                  }
                  curr = curr.next ; 
            }
      }

      class NodeComparator implements Comparator<Node> {

            public int compare(Node k1, Node k2) {
                  if (k1.info> k2.info)
                        return 1;
                  else if (k1.info < k2.info)
                        return -1;
                  return 0;
            }
      }
      Node mergeKList(Node[] arr, int K) {
            /*Node temp = arr[0];
            for(int i = 0; i < K-1 ; i++){
                  mergeList(arr[i] , arr[i+1]) ;
            }

            return temp ;*/
            
            //Time Complexed Solution It was 
            Node head = new Node() ;
            head.info = 0 ;
            Node temp = head ; 
            PriorityQueue<Node> priorityQueue = new PriorityQueue<>(new NodeComparator()) ;
            //This will now act as our min heap 
            for(int i =0 ; i<arr.length ; i++){
                  if(arr[i]!=null){
                        priorityQueue.add(arr[i]) ;
                  }
            }

            while(!priorityQueue.isEmpty()){
                  Node curr = priorityQueue.poll() ; //Get top element which is minimum
                  temp.next = curr ; 
                  temp = temp.next ;

                  if(curr.next!=null){
                        priorityQueue.add(curr.next) ; 
                  }
            }
            return head.next ; 
      }
      public static void main(String[] args) {
            
      }
}
