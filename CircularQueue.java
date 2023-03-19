import java.util.ArrayList;

public class CircularQueue {

      private int front , rear , size ; 
      ArrayList<Integer> queue = new ArrayList<>() ; 

      public void enque(int data){
            if((front==0 && rear==size-1)|| (rear==(front-1)%(size-1))){
                  System.out.println("Queue is Full");
            }else if(front==-1){
                  front = 0 ; 
                  rear = 0 ;
                  queue.add(rear,data) ; 
            }else if(rear==size-1 && front!=0){
                  rear = 0 ; 
                  queue.set(rear,data) ;
            }else{
                  rear = rear+1 ; 
                  if(front<=rear){
                        queue.add(rear,data) ; 
                  }else{
                        queue.set(rear, data) ;  
                  }
            }
      }

      public int deque(){
            int temp;

            // Condition for empty queue.
            if (front == -1) {
                  System.out.print("Queue is Empty");

                  // Return -1 in case of empty queue
                  return -1;
            }
            temp = queue.get(front) ; 
            if(front==rear){
                  front=-1 ;
                  rear = -1 ; 
            }else if(front==size-1){
                  front=0 ; 
            }else{
                  front = front+1 ; 
            }

            return temp ; 
      }
      
}
