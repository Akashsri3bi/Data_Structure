import java.util.ArrayList;

public class WaterConnectionProblem {

              ArrayList<ArrayList<ArrayList<Integer>>> graph = new ArrayList<>();
        int[] inDegree = new int[n];
        Arrays.fill(inDegree, -1);
        for(int i = 0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        //create a graph
        for(int i=0;i<a.size();i++){
            ArrayList<Integer> lst = new ArrayList<>();
            lst.add(b.get(i)-1);
            lst.add(d.get(i));

            graph.get(a.get(i)-1).add(lst);
            
            inDegree[a.get(i)-1] = 0;

        }

        /**
         * To Know which node is a Root Node of each component we can using a first loop mark all a nodes
         * to 0, again iterate over another loop over b mark all those nodes with 1. Finally visit only those nodes
         * having whose inDegree is 0,  this way we can neglect the isolated component having just one node.
         */

        for(int i : b){
            inDegree[i-1] = 1;
        }

        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

        for(int i = 0;i<n;i++){
            if(inDegree[i] == 0){
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(i+1);

                int j = graph.get(i).get(0).get(0);
                int min_value = graph.get(i).get(0).get(1);

                while(graph.get(j).size() != 0){
                    min_value = Math.min(min_value, graph.get(j).get(0).get(1)); // Greedily Choose the min diameter.
                    j = graph.get(j).get(0).get(0);
                }
                lst.add(j+1);
                lst.add(min_value);

                ret.add(lst);
            }
        }
        return ret;
      
}
