public class MergeSortedLL {

      class GfG {
            Node mergeResult(Node list1, Node list2) {

                  // Merge 2 sorted lists -> Ascending order
                  Node head = mergeTwoLists(list1, list2);

                  // Using the head pointer, reverse the linked list
                  Node newHead = null;
                  while (head != null) {
                        Node nextNode = head.next;
                        head.next = newHead;
                        newHead = head;
                        head = nextNode;
                  }

                  return newHead;
            }

            public Node mergeTwoLists(Node list1, Node list2) {
                  if (list1 == null)
                        return list2;
                  if (list2 == null)
                        return list1;

                  if (list1.data < list2.data) {
                        list1.next = mergeTwoLists(list1.next, list2);
                        return list1;
                  } else {
                        list2.next = mergeTwoLists(list1, list2.next);
                        return list2;
                  }
            }
      }
      
}
