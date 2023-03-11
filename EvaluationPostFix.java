import java.util.Stack;

public class EvaluationPostFix {

          //Function to evaluate a postfix expression.
    public static int evaluatePostFix(String S)
    {
        // Your code here
        Stack<Integer> s = new Stack<>(); 
        for(int i = 0 ; i < S.length() ; i++){
            if(S.charAt(i)>=48 && S.charAt(i)<=57){
                s.push(S.charAt(i)-'0') ; 
            }else{
                int b = s.pop() ;
                int a = s.pop() ; 
                switch(S.charAt(i)){
                    case '+' :
                        s.push(a+b); 
                        break ; 
                    case '/' :
                        s.push(a/b); 
                        break ; 
                    case '*' :
                        s.push(a*b); 
                        break ; 
                    case '-' :
                        s.push(a-b); 
                        break ; 
                }
            }
        }
        return s.pop() ; 
    }
      
}
