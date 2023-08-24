public class ImplementATOI {

          int atoi(String str) {
	// Your code here
	boolean neg = false ;
	if(str.charAt(0)=='-'){
	    str = str.substring(1) ; 
	    neg = true ; 
	}
	boolean check = true ; 
	
	for(int i = 0 ;i<str.length() ; i++){
	    if(str.charAt(i)-'0'>9 || str.charAt(i)-'0'<0){
	        check = false ; 
	    }
	}
	
	
	if(check){
	   int ans = 0 ;
	   for(int i = 0 ;i<str.length() ; i++){
	       ans = ans*10 + (str.charAt(i)-'0') ; 
	   }
	   if(neg){
	       ans = ans*-1 ; 
	       return ans ; 
	   }else{
	       return ans ; 
	   } 
	} 
	else{
	    return -1; 
	}
	
    }
      
}
