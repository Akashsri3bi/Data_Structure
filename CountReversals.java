import java.util.Stack;



public class CountReversals {

      int countRev(String s) {
            int len = s.length() ; 
            Stack<Character> stack = new Stack<>() ; 
            if(len%2==0){
                  //Only even strings can be balanced
                  for(int i = 0 ; i < len ; i++){
                        if(s.charAt(i)=='}' && !stack.isEmpty()){
                              if(stack.peek()=='{'){
                                    stack.pop() ; 
                              }else{
                                    stack.push(s.charAt(i)); 
                              }
                        }else{
                              stack.push(s.charAt(i));
                        }
                  }
                  int stack_length = stack.size();
                  int count = 0 ; 
                  while(!stack.isEmpty() && stack.peek()=='{'){
                        stack.pop() ; 
                        count++ ; 
                  }

                  //ceil of m/2 and n/2 is the final result which is also stack length /2 + count%2 ;
                  //m denotes the number of closing brackets and n denotes the number of opening brackets
                  return (stack_length/2+count%2) ;

            }else{
                  return -1 ; 
            }
                  
            }
      public static void main(String[] args) {
            
      }
}
