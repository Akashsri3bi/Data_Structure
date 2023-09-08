import java.util.PriorityQueue;

public class KClosestPoint {

          public int[][] kClosest(int[][] points, int k) {
        //Create a priority queue that compares the second element(distance^2) from small to large 
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        //Iterate through the array to calculate the distance^2 and add it to the pq
        for(int i = 0; i < points.length; i++){
            int sum = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            pq.add(new int[] {i,sum});
        }
        //Create a new response array and poll k elements from the queue into the array
        //That will be the k-smallest distance^2, and we don't have to do the square root necessarily
        int[][] res = new int[k][];
        while(k > 0){
            res[k-1] = points[pq.poll()[0]];
            k--;
        }
        return res;
    }
      
}
