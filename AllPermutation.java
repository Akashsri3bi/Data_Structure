public class AllPermutation {

      private void permute(String str , int l , int r){
            if(l==r){
                  System.out.println(str);
            }
            else{
                  for(int i = l ; i<=r ; i++){
                        str = swap(str, l, i);
                        permute(str, l+1, r);
                        //when backtracks we need original String 
                        str = swap(str, l, i);
                  }
            }
      }

      public String swap(String a , int i , int j){
            char temp  ; 
            char[] arr = a.toCharArray() ; 
            temp = arr[i] ; 
            arr[i] = arr[j] ; 
            arr[j] = temp ; 
            return String.valueOf(arr);
      }
      public static void main(String[] args) {
            String s = "ABC" ;
            AllPermutation permutation = new AllPermutation();
            permutation.permute(s, 0, s.length()-1);
      }
      
}
