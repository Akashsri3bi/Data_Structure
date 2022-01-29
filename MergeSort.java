//Approach 1 ; Not Understood properly ; 
class Node {
      int info;
      Node next;
}
public class MergeSort {
      Node sortedMerge(Node a  , Node b){
            Node result = null ; 
            if(a==null){
                  return b ; 
            }if(b==null){
                  return a; 
            }if(a.info<=b.info){
                  result = a  ;
                  result.next = sortedMerge(a.next, b);
            }else{
                  result = b ; 
                  result.next = sortedMerge(a, b.next);
            }
            return result ; 
      }

      public  Node mergeSort(Node h){
            if(h==null || h.next==null){
                  //If the start is null or the next element of start is null  , In that case we will return 
                  // start or head in various programming sites. 
                  return h ; 
            }
            //Find middle of the list  
            Node middle = getMiddle(h) ; 
            Node nextofMiddle = middle.next ; 
            //Middle next is set to null for other value when the function be called again  
            middle.next = null  ; 
            //Applying merge sort on left of list and right of list 
            Node L = mergeSort(h) ;
            //For right list applying merge Sort 
            Node R = mergeSort(nextofMiddle) ; 

            //Merging the left and right lists 
            Node sortedList = sortedMerge(L, R) ;
            return sortedList;
      }

      //Function for finding the middle of linked List
      Node getMiddle(Node head){
            if(head==null){
                  return head ; 
            }
            Node slow = head , fast = head ;
            while(fast.next!=null && fast.next.next!=null){
                  slow = slow.next ; 
                  fast = fast.next.next ; 
            }
            return slow ; 

      }
      
}
