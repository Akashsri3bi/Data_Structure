public class AddTwoLL {

      static Node reverse(Node head) {
            if (head == null || head.next == null) {
                  return head;
            }

            Node curr = head;
            Node prev = null;
            while (curr != null && curr.next != null) {
                  Node temp = curr.next;
                  curr.next = prev;
                  prev = curr;
                  curr = temp;

            }

            return prev;
      }

      static Node addTwoLists(Node first, Node second) {
            first = reverse(first) ; 
            second = reverse(second) ;


            Node currF = first ; 
            Node currS = second ;

            while (currF.next != null && currS.next != null) {
                  currF = currF.next;
                  currS = currS.next;
            }

            if(currF.next==null && currS.next!=null){
                  while(currS.next!=null){
                        Node n = new Node();
                        n.info = 0 ; 
                        currF.next = n;
                        currF = currF.next;
                        currS = currS.next;
                  }
            }else if(currF.next != null && currS.next == null){
           while(currF.next != null){
               Node n = new Node();
               n.info = 0 ;
               currS.next = n;
               currS = currS.next;
               currF = currF.next;
            }

            }

      int carry = 0;
      Node result = new Node();
      result.info = -1 ; 
      Node resCurr = result;
       while(first != null){
           int sum = first.info + second.info + carry;
           int digit = sum % 10;
           Node temp = new Node();
           temp.info = digit ;
           resCurr.next = temp;
           resCurr = resCurr.next;
           
           first = first.next;
           second = second.next;
           carry = sum / 10;
       }

       if(carry==1){
            Node temp1 = new Node() ; 
            temp1.info = carry ; 
            resCurr.next = temp1 ;
       }

       return reverse(result.next) ;
      }

      public static void main(String[] args) {

      }
}
