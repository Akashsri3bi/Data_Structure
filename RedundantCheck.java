import java.util.Stack;

public class RedundantCheck {

      static boolean checkRedundancy(String s){
            Stack<Character> st = new Stack<>();
            for(int i = 0 ; i < s.length() ; i++){
                  char c = s.charAt(i) ;
                  if(c==')'){
                        char top = st.peek() ; 
                        st.pop();
                        boolean flag = true;
                        
                        while(top!='('){
                              if (top == '+' || top == '-'
                                          || top == '*' || top == '/') {
                                    flag = false;
                              }

                              top = st.peek();
                              st.pop() ; 
                        }

                        if(flag){
                              return true ; 
                        }

                  }else{
                        st.push(c) ; 
                  }
            }
            return false ; 
      }
      
}
