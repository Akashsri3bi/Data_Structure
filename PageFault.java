import java.util.LinkedList;
import java.util.Queue;

public class PageFault {

          static int pageFaults(int N, int C, int pages[]){
        // code here
        Queue<Integer> q = new LinkedList<>() ; 
        int i = 0 ;
        int pageFault = 0 ;
        while(i<N){
            if(q.isEmpty() || !q.contains(pages[i])){
                if(q.size()==C){
                    q.poll() ; //removes recently used element 
                }
                q.add(pages[i]) ; //adds this new element in queue and makes it recent one
                pageFault++ ;
            }else{
                q.remove(pages[i]) ; 
                q.add(pages[i]) ;
            }
            i++ ;
        }
        
        return pageFault ; 
    }
      
}
