public class QueueLin {

      void push(int a) {
            // Your code here
            QueueNode newnode = new QueueNode(a);
            if (front == null) {
                  front = rear = newnode;
                  return;
            }
            rear.next = newnode;
            rear = newnode;
      }

      // Function to pop front element from the queue.
      int pop() {
            // Your code here
            if (front == null && rear == null) {
                  return -1;
            }

            int f = front.data;
            if (rear == front) {
                  front = rear = null;
            } else {
                  front = front.next;
            }
            return f;
      }
      
}
