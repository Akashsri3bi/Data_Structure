import java.util.ArrayList;

public class CircleOfString {

          static void dfs(ArrayList<ArrayList<Integer>> graph ,int ind , boolean[] vis){
        vis[ind] = true; 
        for(int i : graph.get(ind)){
            if(vis[i]==false){
                dfs(graph,i,vis) ; 
            }
        }
    }
    static int isCircle(int n, String A[])
    {
        // code here
        
        //First thing is to create graph 
        
        ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>() ;
        
        for(int i = 0 ; i < 26; i++){
            graph.add(new ArrayList<>()) ; 
        }
        
        int[] in = new int[26] ; 
        int[] out = new int[26] ; 
        
        for(int i = 0 ;i<n ; i++){
            String temp = A[i] ; 
            graph.get(temp.charAt(0)-'a').add(temp.charAt(temp.length()-1)-'a');
            out[temp.charAt(0)-'a']++ ;
            in[temp.charAt(temp.length()-1)-'a']++;
        }
        
        for(int i = 0 ;i<26 ;i++){
            if(in[i]!=out[i]){
                return 0 ; 
            }
        }
        
        boolean[] vis = new boolean[26] ; 
        dfs(graph,A[0].charAt(0)-'a',vis);
        
        for(int i = 0; i<26;i++){
            if(vis[i]==false && (in[i]!=0 || out[i]!=0)){
                return 0 ;
            }
        }
        
        return 1 ; 
        
        
    
    }
      
}
