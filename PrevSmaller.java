import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PrevSmaller {

          static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        ArrayList<Integer> list = new ArrayList<>() ; 
        Stack<Integer> st = new Stack<>() ; 
        for(int i = 0 ; i<n;i++){
            int val = a[i] ; 
            while(!st.isEmpty() && st.peek()>=val){
                st.pop() ; 
            }
            if(st.isEmpty()){
                list.add(-1) ; 
            }else{
                list.add(st.peek()) ;
            }
            st.push(val) ; 
        }
        return list ; 
    }
      
}
