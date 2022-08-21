import java.util.HashMap;

class LoopLinkedList{
      public static boolean detectLoop(Node head) {
            HashMap<Node , Integer> map = new HashMap<>()  ;
            
            Node curr = head ; 
            int length = 0  ;
            while(curr!=null){
                  if(map.containsKey(curr)){
                        return true ;
                  }else{
                        map.put(curr, 1) ;
                  }
                  
                  curr = curr.next ; 
            }

            return false ; 

            
      }
      public static void main(String[] args) {
            
      }
}