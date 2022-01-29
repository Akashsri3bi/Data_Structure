#Write a Program to implement various operations on circular linked list .
class Node:
      def __init__(self):
            self.info = None
            self.next = None

class CLL : 
      def __init__(self):
            self.start = None
            
      def create(self):
            self.start = None
            while(True):
                  node = Node()
                  node.info = input("Enter info")
                  if(self.start is None):
                        self.start = node
                  else:
                        temp.next = node
                  temp = node
                  ch = input("Do you want to add next node ? Y/N")
                  
                  if(ch=="n"):
                        break

            temp.next = self.start

      def display(self):
            if(self.start is None):
                  print("No Linked List exists")
                  return 
            temp = self.start
            while(temp.next!=self.start):
                  print(temp.info , end = "👉👉")
                  temp = temp.next

            print(temp.info)

cl = CLL()
cl.create()
cl.display()
