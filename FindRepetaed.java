public class FindRepetaed {

          String firstRepChar(String s) 
    { 
        // code here
    //code here.
    int[] ch = new int[26];
    String ans= "" ; 
    for(int i=0; i<s.length(); i++){
        if(ch[s.charAt(i) - 'a'] == 1){
            ans = ans + s.charAt(i) ; 
            return ans ;
        }
        ch[s.charAt(i) - 'a'] = 1;
    }
    return "-1";
    }
      
}
