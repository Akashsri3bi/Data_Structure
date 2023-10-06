import java.util.HashMap;
import java.util.PriorityQueue;

      class Pair{
    Character c ; 
    int value  ;
    Pair(Character c , int value){
        this.c = c ; 
        this.value = value; 
    }
}
public class SortCharactersFreq {


    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>() ; 
        for(int i = 0 ;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i) , map.get(s.charAt(i))+1) ; 
            }else{
                map.put(s.charAt(i) , 1) ; 
            }
        }

        PriorityQueue<Pair> q = new PriorityQueue<>((a,b)-> b.value - a.value) ; 
        for(char key : map.keySet()){
            q.add(new Pair(key,map.get(key)));
        }
        StringBuilder sb = new StringBuilder() ; 
        while(!q.isEmpty()){
            Pair p = q.poll() ; 
            while(p.value>0){
                sb.append(p.c) ; 
                p.value--;
            }
        }

        return sb.toString() ; 
    }

      
}
