import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MakingLargeIsland {

      class DisjointSet{
    List<Integer> parent = new ArrayList<>() ; 
    List<Integer> size = new ArrayList<>() ; 
    public DisjointSet(int n){
        for(int i = 0 ;i<=n;i++){
            parent.add(i) ; 
            size.add(1) ; 
        }
    }
    public int findP(int node){
        if(node==parent.get(node)){
            return node ;
        }
        int ulp = findP(parent.get(node)) ; 
        parent.set(node,ulp) ;
        return parent.get(node) ;
    }
    public void unionBySize(int u , int v){
        int ulp = findP(u) ; 
        int vlp = findP(v)  ;
        if(ulp==vlp) return;
        if(size.get(ulp)<size.get(vlp)){
            parent.set(ulp,vlp) ; 
            size.set(vlp,size.get(ulp)+size.get(vlp)) ; 
        }else{
            parent.set(vlp,ulp) ; 
            size.set(ulp,size.get(ulp)+size.get(vlp)) ; 
        }
    }
}
class Solution {
    private boolean isValid(int adjr , int adjc , int n){
        return adjr>=0 && adjr<n && adjc>=0 && adjc<n ; 
    }
    public int largestIsland(int[][] grid) {
        int n = grid.length ; 
        DisjointSet ds = new DisjointSet(n*n) ; 
        for(int row = 0 ;row<n;row++){
            for(int col = 0 ; col<n;col++){
                if(grid[row][col]==0) continue ;

                int dr[] = {-1, 0, 1, 0};
                int dc[] = {0, -1, 0, 1};

                for(int ind = 0 ;ind<4;ind++){
                    int newr = row + dr[ind] ; 
                    int newc = col + dc[ind] ; 
                    if(isValid(newr,newc,n) && grid[newr][newc]==1){
                        int nodeno = row*n + col ; 
                        int adjnodeno = newr*n + newc ; 
                        ds.unionBySize(nodeno , adjnodeno) ; 
                    }
                }
            }
        }
        int mx = 0 ;
        for(int row = 0 ;row<n;row++){
            for(int col = 0 ;col<n;col++){
                if(grid[row][col]==1) continue ; 

                int dr[] = {-1, 0, 1, 0};
                int dc[] = {0, -1, 0, 1};
                
                HashSet<Integer> components = new HashSet<>();
                for(int ind = 0; ind < 4; ind++){
                    int newr = row + dr[ind];
                    int newc = col + dc[ind];

                    if(isValid(newr,newc,n) && grid[newr][newc] == 1){
                        if(grid[newr][newc] == 1){
                            components.add(ds.findP(newr * n + newc));
                        }
                    }
                }
                int sizeTotal = 0;
                for(Integer parents : components){
                    sizeTotal+= ds.size.get(parents) ; 
                }
                mx = Math.max(mx ,sizeTotal+1) ;
            }
        }

        //If all ones 
        for(int cell = 0 ;cell<n;cell++){
            mx = Math.max(mx , ds.size.get(ds.findP(cell))) ; 
        }
        return mx ;
    }
}
      
}
