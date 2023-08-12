import java.util.Stack;

public class StockSpan {

          public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        Stack<Integer> st = new Stack<>() ;
        int[] ans = new int[n] ; 
        for(int i = 0 ;i<n;i++){
            ans[i] = 1 ;
        }
        for(int i = 0 ;i<n;i++){
            while(!st.isEmpty() && price[i]>=price[st.peek()]){
                ans[i]+= ans[st.peek()] ; 
                st.pop() ; 
            }
            
            st.push(i) ; 
        }
        
        return ans ;
        
    }
      
}
