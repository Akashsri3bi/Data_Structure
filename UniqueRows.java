import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class UniqueRows {

          public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)
    {
        //add code here.
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>() ;
        Set<String> set = new HashSet<>() ; 
        for(int i = 0 ;i<r;i++){
            String s = "" ; 
            for(int j = 0 ;j<c;j++){
                s += String.valueOf(a[i][j]) ; 
            }
            if(!set.contains(s)){
                set.add(s) ;
                ArrayList<Integer> list = new ArrayList<>() ; 
                for(int k = 0 ;k<c;k++){
                    int ele = s.charAt(k)=='1'? 1 : 0 ; 
                    list.add(ele);
                }
                ans.add(list) ; 
            }
            
        }
        
        
        return ans ;
    }
      
}
