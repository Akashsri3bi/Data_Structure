public class NumberPattern {

          static String printMinNumberForPattern(String S){
        // code here
        StringBuilder sb = new StringBuilder() ; 
        Stack<Integer> st = new Stack<>(); 
        int num = 1;
        for(int i = 0 ; i<S.length() ;i++){
            char ch = S.charAt(i) ; 
            if(ch=='D'){
                st.push(num) ;
                num++;
            }else{
               st.push(num) ; 
               num++;
               while(!st.isEmpty()){
                   sb.append(st.pop());
               }
            }
        }
        st.push(num) ;
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString() ; 
    }
      
}
