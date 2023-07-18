import java.util.Arrays;

public class FlightPrice {

          public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {


        final int MAX_VALUE = Integer.MAX_VALUE;
        int[] cost = new int[n];
        Arrays.fill(cost, MAX_VALUE);
        cost[src] = 0;

        for (int i = 0; i <= k; i++) {
            int[] next = new int[n];
            Arrays.fill(next, MAX_VALUE);
            next[src] = 0;

            for (int[] flight : flights) {
                int from = flight[0];
                int to = flight[1];
                int price = flight[2];

                if (cost[from] != MAX_VALUE && cost[from] + price < next[to]){
                    next[to] = cost[from] + price;
                }
            }
            cost= next ;
        }
        return cost[dst] == MAX_VALUE ? -1 : cost[dst];

        /*Using Dijstra exceeds time limit 
        List<List<int[]>> graph = new ArrayList<>() ;

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for(int[] flight : flights){
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];
            graph.get(from).add(new int[]{to, price});
        } 
        //PriorityQueue for comparison
        PriorityQueue<City> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost)); 
        queue.offer(new City(src, 0, -1));
        while(!queue.isEmpty()){
            City current = queue.poll() ; 
            int city = current.id;
            int cost = current.cost;
            int stops = current.stops;

            if(city==dst){
                return cost ; 
            }

            if(stops<k){
                for(int[] neighbor : graph.get(city)){
                    int nextCity = neighbor[0];
                    int nextPrice = neighbor[1];
                    queue.offer(new City(nextCity, cost + nextPrice, stops + 1));
                }
            }
        }

        return -1 ;
        */

    
    }
      
}
