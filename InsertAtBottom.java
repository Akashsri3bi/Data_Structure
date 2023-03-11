import java.util.Stack;

public class InsertAtBottom {
      
      static void insert_at_bottom(Character x , Stack<Character> st ){
            if(st.isEmpty()){
                  st.push(x);
            }else{
                  char a = st.peek() ; 
                  st.pop() ; 
                  insert_at_bottom(x, st);
                  st.push(a) ;      
            }      
      }
      
}
