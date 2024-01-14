import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateRows {

      public static ArrayList<Integer> repeatedRows(int matrix[][], int m, int n)
    {
        //code here
        ArrayList<Integer> ans= new ArrayList<Integer>();
        Set<String> set= new HashSet<>();
        for(int i=0;i<m;i++){
            StringBuilder curr=new StringBuilder();
            for(int j=0;j<n;j++){
                curr.append(matrix[i][j]+" ");
            }
            if(set.contains(curr.toString()))ans.add(i);
            set.add(curr.toString());
        }
        return ans;
    }
      
}
