import java.util.Comparator;
import java.util.PriorityQueue;

public class ActivitySelection {

      class Pair{
    int first ; 
    int second ; 
    Pair(int first , int second){
        this.first = first ; 
        this.second = second ; 
    }
}

class MyComparator implements Comparator<Pair>{
    @Override
    public int compare(Pair a, Pair b){
        return a.second - b.second ; 
    }
}

    public static int activitySelection(int start[], int end[], int n)
    {
        // add your code here
        PriorityQueue<Pair> q = new PriorityQueue<>(new MyComparator()) ;
        for(int i = 0 ;i<n;i++){
            q.add(new Pair(start[i] , end[i])) ; 
        }
        
        int count = 1 ;
        Pair curr = q.poll() ;
        while(!q.isEmpty()){
            Pair second = q.poll() ; 
            if(second.first>curr.second){
                curr = second ; 
                count++;
            }
        }
        
        return count ; 
        
    }
      
}
