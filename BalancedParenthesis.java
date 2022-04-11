import java.util.Stack;

public class BalancedParenthesis {

      static boolean areBracketsBalanced(String expr){
            //Using stack  , 
            Stack<Character> stack = new Stack<>() ; 

            for(int  i = 0 ; i < expr.length() ; i++){
                  //Find the character at ith position in the string
                  char x = expr.charAt(i) ; 
                  if(x=='(' || x=='{' || x=='['){
                        stack.push(x) ; 
                        continue ;
                  }

                  //If the current character is not opening bracket then it must be
                  //Closing bracket and stack cannot be empty at this time

                  if(stack.isEmpty()){
                        return false ;
                  }

                  char check ; 
                  switch(x){
                        case ')':
                        check = stack.pop() ; 
                        if(check=='{' || check=='[')
                              return false  ; 
                        break ;

                        case '}':
                        check = stack.pop();
                        if (check == '(' || check == '[') 
                              return false;
                        break;

                        case ']':
                        check = stack.pop();
                        if (check == '(' || check == '{')
                              return false;
                        break;

                  }
            }

            return stack.isEmpty() ;
      }
      public static void main(String[] args) {
            String expr = "([{}])" ; 

            if(areBracketsBalanced(expr)){
                  System.out.println("Balanced");
            }else{
                  System.out.println("Not Balanced");
            }
      }
      
}
