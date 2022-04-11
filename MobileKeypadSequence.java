public class MobileKeypadSequence {
      static String printSequence(String arr[],String input){
            String output = "" ;
            for(int i = 0 ; i < input.length() ; i++){
                  if(input.charAt(i)==' '){
                        output = output + "0" ; 
                  }else{
                        //Calculating the index of each character 
                        int position = input.charAt(i)-'A' ; 
                        output = output + arr[position] ;  
                  }
            }
            return output ;                        
      }
      public static void main(String[] args) {
            String str[] = { "2", "22", "222",
                        "3", "33", "333",
                        "4", "44", "444",
                        "5", "55", "555",
                        "6", "66", "666",
                        "7", "77", "777", "7777",
                        "8", "88", "888",
                        "9", "99", "999", "9999"
            };

            String input = "GEEKSFORGEEKS";
            System.out.println(printSequence(str, input));
      }
      
}
