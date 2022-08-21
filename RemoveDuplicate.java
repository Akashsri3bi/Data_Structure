import java.util.HashMap;
import java.util.HashSet;

public class RemoveDuplicate {

      //Remove duplicate node in a sorted LinkedList  
      Node removeDuplicates(Node head) {
            if(head.next==null){
                  return head ; 
            }
            Node curr = head ;
            while(curr.next!=null){
                  if(curr.info==curr.next.info){
                        curr.next = curr.next.next ;
                  }else{
                        curr= curr.next ; 
                  }
            }
            return head ; 
      }

      //In Unsorted LinkedList 
      
      public Node removeDuplicatess(Node head) {
            HashSet<Integer> set = new HashSet<>() ; 
            if(head.next==null){
                  return head ; 
            }

            Node curr = head ; 
            set.add(curr.info) ; 
            while(curr.next!=null){
                  if(set.contains(curr.next.info)){
                        curr.next = curr.next.next ;
                  }else{
                        set.add(curr.next.info) ;
                        curr = curr.next ;
                  }
            }
            return head ;
      }
      
}
