class SubSequenceString{
      //Print all subsequences of a String
      static String[] findSubsequence(String s){
            String[] arr = {""};
            if(s.length()==0){
                  return arr ; 
            }

            String[] small = findSubsequence(s.substring(1, s.length()));
            String[] result = new String[2*small.length] ; 

            int k = 0 ; 
            for(int i = 0 ; i < small.length ; i++){
                  result[k] = small[i] ; 
                  k++;
            }
            for(int i = 0 ; i < small.length ; i++){
                  result[k] = s.charAt(0) + small[i] ; 
                  k++ ; 
            }

            return result ; 
      }
      public static void main(String[] args) {
            String k = "net" ; 
            String[] subsequences = findSubsequence(k) ; 
            for(int i = 0 ; i < subsequences.length ; i++){
                  System.out.println(subsequences[i]);
            }
      }
}