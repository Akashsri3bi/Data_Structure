import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class OliverGame {
    private static int timer = 0; 
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in) ;
        int vertex = sc.nextInt() ; 

        ArrayList<ArrayList<Integer>> graph = new ArrayList<>() ; 
        for(int i = 0 ; i <= vertex ; i++){
            graph.add(new ArrayList<>()) ; 

        }

        for(int i = 1  ; i < vertex ; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            graph.get(x).add(y);
        }

        ArrayList<Boolean> visited = new ArrayList<>(vertex + 1);
        ArrayList<Integer> starttime = new ArrayList<>(vertex + 1);
        ArrayList<Integer> endtime = new ArrayList<>(vertex + 1);

        for (int i = 0; i <= vertex; i++) {
            visited.add(false);
            starttime.add(0);
            endtime.add(0);
        }

        measureTime(1 , visited , starttime , endtime , graph); 

        int q = sc.nextInt() ;
        while(q-- > 0){
            int direction = sc.nextInt() ; 
            int oliver = sc.nextInt() ; 
            int bob = sc.nextInt() ; 

             if (!check(oliver, bob , starttime , endtime) && !check(bob, oliver , starttime , endtime)) {
                System.out.println("NO");
                continue;
            }

            if (direction == 0) {
                if (check(bob, oliver , starttime , endtime))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            } else {
                if (check(oliver, bob , starttime , endtime))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }

        sc.close() ; 


    }

    private static void measureTime(int v ,ArrayList<Boolean> visited , ArrayList<Integer> starttime, ArrayList<Integer> endtime , ArrayList<ArrayList<Integer>> graph){
        visited.set(v , true) ; 
        starttime.set(v,timer++);
        for(int node : graph.get(v)){
            if(!visited.get(node)){
                measureTime(node , visited,starttime , endtime, graph) ;
            }
        }
        endtime.set(v, timer++);
    }

    private static boolean check(int x, int y, ArrayList<Integer> starttime, ArrayList<Integer> endtime ) {
        if (starttime.get(x) > starttime.get(y) && endtime.get(x) < endtime.get(y))
            return true;
        return false;
    }
      
}
