import java.util.Scanner;

class Node{
      int info ;
      Node next ; 
}

public class SinglyLinkedList{
      Node start ; 
      SinglyLinkedList(){
            this.start = null ;
      }

      //Display function
      void display(){
            Node temp = this.start ;
            while(temp.next!=null){
                  System.out.print(temp.info + "-->") ;
                  temp = temp.next ;
            }
            System.out.print(temp.info);
            System.out.println("");
            
      }

      //Insertion at beginning
      void insert_at_beg(){
            if(start==null){
                  System.out.print("No Linked List Exists");
                  return ;
            }
            Scanner sc = new Scanner(System.in) ; 
            Node node = new Node() ;
            node.info = sc.nextInt(); 
            //for insertion at beginning make the new Node's next to start and
            //Then make the start the new Node insertion at beginning

            node.next = start ;
            start = node ;
            sc.close();
      }

      //Insertion at last 
      void insert_at_last(){
            Node temp = new Node();
            if(start==null){
                  System.out.println("No Linked Exists") ; 
                  return ;
            }
            temp = start;
            while(temp.next!=null){
                  temp = temp.next ;

            }
            Node node = new Node(); 
            Scanner sc = new Scanner(System.in) ;
            node.info = sc.nextInt() ;
            temp.next = node ;
            sc.close();
      }

      //Insertion at a given node 
      void insert_after(int value){
            Node temp = new Node();
            if(start==null){
                  System.out.println("No Linked List exists") ; 
                  return ;
            }
            temp = start ; 
            while(temp.next!=null && temp.info!=value){
                  temp = temp.next ; 
            }
            if(temp.next==null){
                  System.out.println("Value not found");
            }else{
                  Node node = new Node();
                  Scanner sc = new Scanner(System.in);
                  System.out.println("Enter node value : ");
                  node.info = sc.nextInt();
                  node.next = temp.next ; 
                  temp.next = node ;
                  sc.close();
            }

      }

      //Deletion from beginning
      void del_from_beg(){
            if(start==null){
                  System.out.println("No Linked List exists");
                  return ;
            }
            start = start.next ;
      }

      //Deletion from last 
      void del_last(){
            Node temp = new Node() ; 
            if(start==null){
                  System.out.println("No Linked List exists"); 
                  return ; 
            }
            temp = start ; 
            Node prev = null ;
            while(temp.next!=null){
                  prev = temp ; 
                  temp = temp.next; 
            }
            if(prev==null){
                  start = null;
            }else{
                  prev.next = null ;
            }
      }

      //Deletion of a given node  
      void del_given_node(int value){
            Node temp = new Node();
            if(start==null){
                  System.out.println("No Linked List exists") ;
                  return; 
            }
            temp = start ; 
            Node prev = null  ;
            if(temp.next!=null && temp.info!=value){
                  prev = temp  ; 
                  temp = temp.next ;
            }
            if(temp==null){
                  System.out.println("Value is not in LinkedList") ;
            }else{
                  if(prev==null){
                        start = start.next; 
                  }else{
                        prev.next = temp.next ;
                  }
            }
      }

      //Reverse of a Linked List 
      void Reversal(){
            Node prev = null ; 
            Node current = start ;
            while(current!=null){
                  Node temp = current.next ;
                  current.next = prev ; 
                  prev = current ; 
                  current = temp ; 
            }
            start = prev ; 
      }

      //Sorting in LinkedList 
      void sort(){
            Node i = start ; 
            while(i.next!=null){
                  Node j = i.next ; 
                  while(j!=null){
                        Node temp = new Node();
                        if(i.info>j.info){
                              temp.info = i.info ; 
                              i.info = j.info ; 
                              j.info = temp.info ;
                        }
                        j = j.next ;
                  }
                  i = i.next ;
            }
      }
      //Merge Sort in Linked List 
      static Node mergeSort(Node start){
            if(start.next==null){
                  return start ; 
            }
            //We will find the middle of the linked list using FindMid method
            Node mid = findMid(start) ; 
            //Find the next element to middle 
            Node nextToMid = mid.next ; 
            //put mid next to null
            mid.next = null ; 

            //performing mergeSort on individual nodes and then merging them
            Node L = mergeSort(mid) ; 
            Node R = mergeSort(nextToMid) ;
            Node sortedList = merge(L , R) ;
            return sortedList ;
      }

      static Node findMid(Node start){
            if(start==null || start.next==null){
                  return start  ; 
            }
            Node slow = start , fast = start ; 
            while(fast.next!=null && fast.next.next!=null){
                  slow = slow.next ; 
                  fast = fast.next.next ;
            }

            return slow ; 
      }

      static void printList(Node head) {
            while (head != null) {
                  System.out.print(head.info + "-->");
                  head = head.next;
            }
      }

      static Node merge(Node L , Node R){
            //Creating a refrence new Node as temp 
            Node merged= new Node() ;
            merged.info = -1 ; 
            Node temp = merged ;
            
            while(L!=null && R!=null){
                  if(L.info<R.info){
                        temp.next = L ;
                        L = L.next ; 
                  }else{
                        temp.next = R ; 
                        R = R.next ; 
                  }
                  temp = temp.next ; 
            }

            //If L is not null 
            while(L!=null){
                  temp.next =  L ; 
                  L = L.next  ; 
                  temp = temp.next ; 
            }

            //If R is not null 

            while (R!=null){
                  temp.next = R; 
                  R = R.next ; 
                  temp = temp.next ;
            }

            return merged.next ; 
      }



      //Creation of LinkedList 
      void create(){
            Node temp = new Node();
            while (true){
                  Scanner sc = new Scanner(System.in) ;
                  Node node = new Node();
                  System.out.print("Enter info") ;
                  node.info = sc.nextInt() ; 
                  if(start==null){
                        start = node ;
                  }else{
                        temp.next = node ; 
                  }
                  temp = node;
                  System.out.println("Do you want next Node y/n") ;
                  String ch = sc.next();
                  if(ch.equals("n")){
                        break ;
                  }
                  //sc.close();
            }
      }
      public static void main(String[] args) {
            SinglyLinkedList ll = new SinglyLinkedList() ;
            ll.create();
            ll.display(); 
            Node start = SinglyLinkedList.mergeSort(ll.start);
            System.out.println("Sorted List is : ") ;
            SinglyLinkedList.printList(start);
            
      }
}