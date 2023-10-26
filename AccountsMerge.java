import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountsMerge {

      class DisjointSet{
    List<Integer> rank = new ArrayList<>() ; 
    List<Integer> parent = new ArrayList<>() ; 
    public DisjointSet(int n){
        for(int i = 0 ;i<=n;i++){
            rank.add(0) ; 
            parent.add(i) ; 
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
    public void unionByRank(int u , int v){
        int p_u = findP(u) ; 
        int p_v = findP(v) ; 
        if(p_u==p_v){
            return ; 
        }
        if(rank.get(p_u)<rank.get(p_v)){
            parent.set(p_u,p_v) ; 
        }
        else if(rank.get(p_v)<rank.get(p_u)){
            parent.set(p_v,p_u) ; 
        }else{
            parent.set(p_v,p_u) ;
            int rankU = rank.get(p_u) ; 
            rank.set(p_u,rankU) ;  
        }
    }
}
class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts){
        int n = accounts.size() ;
        DisjointSet ds = new DisjointSet(n) ; 
        Map<String,Integer> map = new HashMap<>() ; 
        for(int i = 0;i<n;i++){
            for(int j = 1;j<accounts.get(i).size() ; j++){
                String mail = accounts.get(i).get(j);
                if(!map.containsKey(mail)){
                    map.put(mail,i) ;
                }else{
                    ds.unionByRank(i,map.get(mail)) ; 
                }
            }
        }

        ArrayList<String>[] mergedMail = new ArrayList[n] ; 
        for(int i = 0;i<n;i++){
            mergedMail[i] = new ArrayList<>() ; 
        }

        for(Map.Entry<String,Integer> it : map.entrySet()){
            String mail = it.getKey() ; 
            int node = ds.findP(it.getValue()) ;
            mergedMail[node].add(mail) ; 
        }
        List<List<String>> ans = new ArrayList<>() ; 
        for(int i = 0;i<n;i++){
            if(mergedMail[i].size()==0){continue ;}
            Collections.sort(mergedMail[i]) ; 
            List<String> temp = new ArrayList<>() ; 
            temp.add(accounts.get(i).get(0)) ;
            for(String str : mergedMail[i]){
                temp.add(str);
            }
        }
        return ans ;
    }
}
      
}
