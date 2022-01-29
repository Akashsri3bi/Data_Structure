class Node:
      def __init__(self):
            self.coff = None
            self.exp = None
            self.next = None

class poly:
      def __init__(self):
            self.start = None

      def create(self):
            self.start = None
            while(True):
                  node = Node()
                  node.coff = float(input("Enter coff"))
                  node.exp = int(input("Enter exp"))

                  if(self.start is None):
                        self.start = node
                  else:
                        temp.next = node
                  temp = node
                  ch = input("Do you want more items Y/N ? ")

                  if(ch=="n"):
                        break

      def display(self):
            if(self.start is None):
                  print("No polynomial")
                  return
            temp = self.start
            while(temp.next is not None):
                  print(str(temp.coff) + 'x^' + str(temp.exp))
                  temp = temp.next

            print(str(temp.coff) + 'x^' + str(temp.exp))

      @staticmethod
      def add_poly(p1 , p2):
            p1 = p1.start
            p2 = p2.start
            dummy = Node()
            temp = dummy
            while(p1 and p2):
                  result = Node()
                  if(p1.exp > p2.exp):
                        result.coff = p1.coff
                        result.exp = p1.exp
                        p1 = p1.next

                  elif(p1.exp < p2.exp):
                        result.coff = p2.coff
                        result.exp = p2.exp
                        p2 = p2.next

                  else:
                        result.coff = p1.coff + p2.coff
                        result.exp = p1.exp # or can be p2.exp because in this case both are same . 
                        p1 = p1.next
                        p2 = p2.next

                  temp.next = result
                  temp = result

            #Second while loop if for adding any left overs
            while(p1 or p2):
                  result = Node()
                  if(p1):
                        result.coff = p1.coff 
                        result.exp = p1.exp
                        p1 = p1.next

                  if(p2):
                        result.coff = p2.coff
                        result.exp = p2.exp
                        p2 = p2.next

                  temp.next = result
                  temp = result

            return dummy.next

p1 = poly()
p2 = poly()
p1.create()
p2.create()

p1.display()
p2.display()

p3 = poly()
p3.start = p1.add_poly(p1 , p2)
p3.display()


