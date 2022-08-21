
public class Add1 {

      static Node newNode(int data) {
            Node new_node = new Node();
            new_node.info = data;
            new_node.next = null;
            return new_node;
      }

      static void printList(Node node) {
            while (node != null) {
                  System.out.print(node.info);
                  node = node.next;
            }
            System.out.println();
      }
      public static void main(String[] args) {
            Node head = newNode(1);
            head.next = newNode(9);
            head.next.next = newNode(9);
            head.next.next.next = newNode(9);

            System.out.print("List is ");
            printList(head);

            head = addOne(head);
            System.out.println();
            System.out.print("Resultant list is ");
            printList(head);
      }

      static Node addOneUtil(Node head)
    {
        // res is head node of the resultant list
        Node res = head;
        Node temp = null;
  
        int carry = 1, sum;
  
        while (head != null) 
        {
            sum = carry + head.info;
            carry = (sum >= 10) ? 1 : 0;
            sum = sum % 10;
            head.info = sum;
            temp = head;
            head = head.next;
        }
        if (carry > 0)
            temp.next = newNode(carry);
        return res;
    }

      // This function mainly uses addOneUtil().
      static Node addOne(Node head) {
            // Reverse linked list
            head = reverseNode(head);

            // Add one from left to right of reversed
            // list
            head = addOneUtil(head);

            // Reverse the modified list
            return reverseNode(head);
      }

      public static Node reverseNode(Node head){
            if(head==null || head.next==null){
                  return head ;
            }
            Node curr = head ; 
            Node prev = null ; 
            while(curr!=null){
                  Node temp = curr.next;
                  curr.next = prev ; 
                  prev = curr ; 
                  curr = temp ; 
            }

            return prev ; 
      }
      
}
