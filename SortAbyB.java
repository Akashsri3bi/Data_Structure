import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class SortAbyB {

         public static int[] sortA1ByA2(int A[], int N, int B[], int M)
    {
        //Your code here
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<N;i++){
            map.put(A[i],map.getOrDefault(A[i],0)+1);
        }
        int[] ans=new int[N];
        int count=0;
  
        for(int i=0;i<M;i++){
           if(map.containsKey(B[i])){
                int x=map.get(B[i]);
            while(x>0){
                ans[count]=B[i];
                count++;
                x--;
            }
            map.remove(B[i]);
           }
        }
        ArrayList<Integer> al=new ArrayList<>();
       for(int i=0;i<N;i++){
           if(map.containsKey(A[i])){
               int x=map.get(A[i]);
               while(x>0){
                   al.add(A[i]);
                   x--;
               }
               map.remove(A[i]);
           }
           
       }
       //System.out.print(al);
        Collections.sort(al);
        for(int i=0;i<al.size();i++){
            
            ans[count]=al.get(i);
            
            count++;
        }
        return ans;
    }
      
}
