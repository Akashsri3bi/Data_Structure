import java.util.Stack;

public class GetMinFromStack {
          int minEle;
    Stack<Integer> s;
    Stack<Integer> minstack ; 
    
    // Constructor    
    GfG()
	{
	   s = new Stack<Integer>() ;
	   minEle = -1 ; 
	   minstack = new Stack<Integer>() ; 
	}
	
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
	if(minstack.isEmpty()){
	    return -1 ; 
	}
	return minstack.peek();
    }
    
    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
	if(s.isEmpty()){
	    return -1;
	}
	
	int temp = s.pop() ; 
	if(temp==minstack.peek()){
	    minstack.pop() ;
	}
	
	return temp ;
    }

    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here	
	s.push(x) ;
	if(minstack.isEmpty()){
	    minstack.push(x) ; 
	}else{
	    if(x<=minstack.peek()){
	        minstack.push(x) ;
	    }
	}
	
	
    }
      
}
