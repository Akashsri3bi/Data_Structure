public class MergeSortLL {

      

      static Node mergeSort(Node head) {
            if(head==null || head.next==null){
                  return head ; 
            }

            Node mid = FindMiddle(head);
            Node left = head ; 
            Node right = mid.next ; 
            mid.next = null ; 
            left = mergeSort(left) ; 
            right = mergeSort(right) ; 
            Node res = merge(left, right) ; 
            return res ; 
      }

      static Node FindMiddle(Node head){
            Node slow = head ; 
            Node fast = head.next ; 
            while(fast!=null && fast.next!=null){
                  slow = slow.next ; 
                  fast = fast.next.next ;
            }

            return slow ; 
      }

      static Node merge(Node left , Node right){
            Node newNode = new Node() ; 
            newNode.info = -1 ; 
            Node temp = newNode ; 
            while(left!=null && right!=null){
                  if(left.info<right.info){
                        temp.next = left ; 
                        temp = left ; 
                        left = left.next ; 
                  }else{
                        temp.next = right ; 
                        temp = right ; 
                        right = right.next ; 
                  }
            }

            while (left != null) {
                  temp.next = left;
                  temp = left;
                  left = left.next;
            }
            while (right != null) {
                  temp.next = right;
                  temp = right;
                  right = right.next;
            }

            newNode = newNode.next ; 
            return newNode ; 
      }

      public static void main(String[] args) {
            
      }
      
}
