public class ImplementQueue {

      class MyQueue {

            int front, rear;
            int arr[] = new int[100005];

            MyQueue() {
                  front = 0;
                  rear = 0;
            }

            // Function to push an element x in a queue.
            void push(int x) {
                  // Your code here
                  arr[this.front] = x;
                  this.front++;
            }

            // Function to pop an element from queue and return that element.
            int pop() {
                  // Your code here
                  if (this.rear >= this.front) {
                        return -1;
                  } else {
                        int ele = arr[this.rear];
                        this.rear++;
                        return ele;
                  }
            }
      }
      
}
