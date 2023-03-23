import java.util.Queue;
import java.util.Stack;

public class LeaveQueue {

      static void interLeaveQueue(Queue<Integer> q){
            if(q.size()%2!=0){
                  System.out.print("Input Even Number Of Integer");
            }

            Stack<Integer> s = new Stack<>() ;
            int halfsize = q.size()/2 ;
            
            for(int i = 0 ; i<halfsize ; i++){
                  s.push(q.peek()) ; 
                  q.poll();
            }
            while(!s.isEmpty()){
                  q.add(s.peek()) ;
                  s.pop() ;
             }
             for (int i = 0; i < halfsize; i++) {
                   q.add(q.peek());
                   q.poll();
             }

             // Again push the first half elements into the stack
             // queue: 16 17 18 19 20, stack: 11(T) 12 13 14 15
             for (int i = 0; i < halfsize; i++) {
                   s.push(q.peek());
                   q.poll();
             }

             // interleave the elements of queue and stack
             // queue: 11 16 12 17 13 18 14 19 15 20
             while (!s.empty()) {
                   q.add(s.peek());
                   s.pop();
                   q.add(q.peek());
                   q.poll();
             }
      }
      
}
