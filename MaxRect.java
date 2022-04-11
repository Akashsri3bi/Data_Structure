import java.util.ArrayList;
import java.util.Stack;
//Find the area  of maximum rectangle formed by binary matrix;
public class MaxRect {
      public static int[] nextSmaller(int[] arr , int n ){
            int[] ans = new int[n] ; 
            Stack<Integer> s = new Stack<Integer>(); 
            s.push(-1) ;

            for(int i = n-1 ; i>=0 ; i--){
                  int curr = arr[i] ;
                  while(s.peek()!=-1 && arr[s.peek()]>=curr){
                        s.pop() ; 
                  }
                  ans[i] = s.peek() ;
                  s.push(i) ;
            }
            return ans ; 
      }
      
      public static int[] prevSmaller(int[] arr, int n) {
            int[] ans = new int[n];
            Stack<Integer> s = new Stack<Integer>();
            s.push(-1);

            for (int i = 0 ; i<n; i++) {
                  int curr = arr[i];
                  while (s.peek() != -1 && arr[s.peek()] >= curr) {
                        s.pop();
                  }
                  ans[i] = s.peek();
                  s.push(i);
            }
            return ans;
      }
      public static int largestRectangleArea(int[]heights,int n){
            int[] next = nextSmaller(heights, n) ; 
            int[] prev = prevSmaller(heights, n);

            int area = Integer.MIN_VALUE ; 
            for(int i = 0 ; i < n ; i++){
                  int l = heights[i] ;
                  if(next[i]==-1){
                        next[i]=n;
                  }
                  int b = next[i]-prev[i]-1 ; 
                  area = Math.max(area, l*b) ; 
            }

            return area ; 
      }
      public static int maxArea(int M[][], int n, int m) {
            int[] current_arr = M[0]; 
            int area = largestRectangleArea(current_arr, n);
            for(int i = 1 ; i < n ; i++){
                  for(int j = 0 ; j < m  ;j++){
                        if(M[i][j]==1){
                              current_arr[j]+=1 ; 
                        }else{
                              current_arr[j] = 0 ; 
                        }
                  }

                  area = Math.max(area, largestRectangleArea(current_arr, n));
            }
            return area ; 
      }
      public static void main(String[] args) {
            int[][] mat = 
      {{0 ,1 ,1 ,0},
         {1 ,1 ,1 ,1},
         {1, 1, 1, 1},
         {1, 1 ,0 ,0}} ; 

         System.out.print(maxArea(mat, mat.length, mat[0].length));
         
      }
      
}
