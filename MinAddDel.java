public class MinAddDel {

      public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>() ; 
        for(int i = 0 ; i<s.length() ; i++){
            if(s.charAt(i)=='('){
                st.push(s.charAt(i)) ;
            }else{
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop() ; 
                }else{
                    st.push(s.charAt(i)) ; 
                }
            }
        } 

        int open = 0 ;
        int close = 0 ;
        while(!st.isEmpty()){
            char c = st.pop() ; 
            if(c==')'){
                close++;
            }else{
                open++;
            }
        }
        return open+close; 
    }
      
}
