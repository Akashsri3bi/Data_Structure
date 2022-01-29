#First Creating a node class 
#Writing a programm to create a linked list to store names of your three freinds .

class Node:
      def __init__(self):
            self.info = None
            self.next = None

class DoubleLinkedList : 
      def insert_at_beg(self):
            if(self.start is None):
                  print("No Linked List exists")
                  return 
            node = Node()
            node.info = input("Enter info")
            node.next = self.start
            self.start.prev = node
            self.start = node

      def insert_at_last(self):
            if(self.start is None):
                  print("No Linked List exists")
                  return 

            node = Node()
            node.info = input("Enter info")
            temp = self.start
            while(temp.next is not None):
                  temp = temp.next

            temp.next = node
            node.prev = temp
      
      #Insertion after a given node
      def insert_after(self , value):
            if(self.start is None):
                  print("No Linked List exists")
                  return

            temp = self.start
            while(temp is not None and temp.info!=value):
                  temp = temp.next
            if(temp is None):
                  print("Value not found")
                  return

            node = Node()
            node.info = input("Enter info")
            node.prev = temp
            node.next = temp.next
            if(temp.next is not None):
                  temp.next.prev = node
                  temp.next = node 

      def display(self):
            if(self.start is None):
                  print("No Linked List exists")
                  return 
            temp = self.start
            while(temp.next is not None):
                  print(temp.info , end = "-->")
                  temp = temp.next

            print(temp.info)



class LinkedList : 
      def __init__(self):
            self.start = None

      #Display or traversal
      #Visiting every node exactly onece is called traversal
      #Same like our dispplay function created above
      #creating a function to display the  names of freinds 
      def display(self):
            temp = self.start 
            while(temp.next is not None):
                  print(temp.info , end = " 💖 ")
                  temp = temp.next
            print(temp.info)

      def create(self):
            while(True):
                  node = Node()
                  node.info = input("Enter info : ")
                  
                  if(self.start is None):
                        self.start = node
                  else:
                        temp.next = node
                  temp = node
                  ch = input("Do you want next node Y/N ? ")
                  if(ch=="n"):
                        break

      def insert_at_beg(self):
            if(self.start is None):
                  print("No LinkedList exists")
                  return 

            node = Node()
            node.info = input("Enter info")
            node.next = self.start
            self.start = node

      def insert_at_last(self):
            if(self.start is None):
                  print("No LinkedList exists")
                  return 
            #created a varibale temp to store data of self.start and then checking using help of temp
            #Is the temp.next is not none then proceed for the same.
            temp = self.start
            while(temp.next is not None):
                  temp = temp.next

            #creating a node 
            node = Node()
            node.info = input("Enter info")
            temp.next = node

      #Insertion after a given node 
      def insert_after(self , value):
            if(self.start is None):
                  print("No Linked List exists")
                  return 
            temp = self.start
            while(temp is not None and temp.info!=value):
                  temp = temp.next

            if(temp is None):
                  print("Value is not Linked List ")
            else:
                  node = Node()
                  node.info = input("Enter info to be inserted")
                  node.next = temp.next
                  temp.next = node

      #deletion from beginning.
      def del_from_beg(self):
            if(self.start is None):
                  print("No Linked List exist")
                  return 
            self.start = self.start.next

      #Deletion from End 
      def del_from_end(self):
            if(self.start is None):
                  print("No Linked List exists")
                  return
            temp = self.start
            prev = None
            while(temp.next is not None):
                  prev = temp
                  temp = temp.next

            if(prev is None):
                  self.start = None
            else:
                  prev.next = None

      #Deletion of a Given Node
      def delete_given_node(self , value):
            if(self.start is None):
                  print("No LinkedList Exists ")
                  return 
            temp = self.start
            prev = None
            while(temp is not None and temp.info!=value):
                  prev = temp 
                  temp = temp.next
            if(temp is None):
                  print("Value not in LinkedList")
            else:
                  if(prev is None):
                        self.start = self.start.next
                  else:
                        prev.next = temp.next

      #Searching
      def Search(self , value):
            if(self.start is None):
                  print("No Linked List exists")
                  return 
            temp = self.start
            while(temp is not None and temp.info!=value):
                  temp = temp.next

            if(temp is not None):
                  print("Element Found")
            else:
                  print("Not Found")

      #For Reversal of a LinkedList 
      def reversal(self):
            prev = None 
            current  = self.start
            while(current is not None):
                  temp = current.next 
                  current.next = prev
                  prev = current
                  current = temp
            self.start = prev

      #Merging of two Linked List 
      def merge_ll(self , ll2):
            temp = self.start
            while(temp.next is not None):
                  temp = temp.next

            #this line puts the element of the second list in the place of the first 
            temp.next = ll2.start

      #Sorting in Linked List 
      def sort(self):
            i = self.start
            while(i.next is not None):
                  j = i.next
                  while(j is not None):
                        if(i.info > j.info):
                              temp = i.info
                              #Now using swaping technique or say using Bubble sort
                              i.info = j.info
                              j.info = temp 
                        
                        j = j.next
                  i = i.next

      #To Print Alternate Element in a Linked List
      def alternate(self):
            temp = self.start
            while(temp is not None):
                  print(temp.info)
                  if(temp.next is None):
                        break
                  temp = temp.next.next #This line takes you staright to very next to next element

      #To Delete duplicate elements in a already sorted list 
      def duplicate(self):
            temp = self.start
            prev = None
            while(temp is not None):
                  if(temp.info == temp.next.info):
                        if(prev is not None):
                              prev.next = temp.next
                              prev = temp

                  else:
                        self.start = temp.next
                        prev = None
                        temp = temp.next

ll = LinkedList()
ll.create() 
ll.display()





