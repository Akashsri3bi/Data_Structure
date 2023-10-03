import java.util.Stack;

public class LargestAreaRectangle {

      static int[] prevSmaller(int[] height){
        int n = height.length ; 
        int[] prev = new int[n] ;
        Stack<Integer> st = new Stack<>() ; 
        prev[0] = -1 ;
        st.push(0) ; 
        for(int i = 1;i<n;i++){
            while(!st.isEmpty() && height[st.peek()]>=height[i]){
                st.pop() ; 
            }
            if(st.isEmpty()){
                prev[i] = -1 ;
            }else{
                prev[i] = st.peek() ; 
            }
            st.push(i) ; 
        }
        return prev ;
    }
    static int[] nextSmaller(int[] height){
        int n = height.length ; 
        int[] next = new int[n] ;
        Stack<Integer> st = new Stack<>() ; 
        next[n-1] = n ;
        st.push(n-1) ; 
        for(int i = n-2;i>=0;i--){
            while(!st.isEmpty() && height[st.peek()]>height[i]){
                st.pop() ; 
            }
            if(st.isEmpty()){
                next[i] = n ;
            }else{
                next[i] = st.peek() ; 
            }
            st.push(i) ; 
        }
        return next ;
    }
    public int largestRectangleArea(int[] heights) {
        int[] prev = prevSmaller(heights) ; 
        int[] next = nextSmaller(heights) ; 
        int max = Integer.MIN_VALUE ; 
        for(int i = 0 ;i<heights.length;i++){
            int width = (next[i]-1) - (prev[i]+1) + 1 ;
            int area = heights[i]*width ; 
            max = Math.max(area , max) ; 
        }
        return max ; 
    }
      
}
