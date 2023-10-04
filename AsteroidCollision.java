public class AsteroidCollision {

      public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>() ; 
        int n = asteroids.length ;
        for(int i = 0 ;i<n;i++){
           if(st.isEmpty() || asteroids[i]>0){
               st.push(asteroids[i]) ; 
           }else{
               while(!st.isEmpty()){
                   int top = st.peek() ; 
                   if(top<0){
                       st.push(asteroids[i]) ; 
                       break;
                   }
                   int modVal = Math.abs(asteroids[i]);
                   if(modVal==top){
                       st.pop() ;
                       break; 
                   }else if(modVal<top){
                       break;
                   }else{
                       st.pop() ; 
                       if(st.isEmpty()){
                           st.push(asteroids[i]) ; 
                           break ; 
                       }
                   }
               }
           }
        }
        int[] ans = new int[st.size()] ; 
        int i = st.size()-1 ;
        while(!st.isEmpty()){
            ans[i] = st.pop() ;  
            i--;
        }
        return ans ; 
    }
      
}
