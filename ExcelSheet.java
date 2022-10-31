public class ExcelSheet {

      public int titleToNumber(String columnTitle) {
            String check = columnTitle.toLowerCase() ; 
            int answer = 0 ;
            for(int i = 0 ; i < check.length() ; i++){
                  answer*=26 ; 
                  answer+= check.charAt(i) - 'A' + 1 ; 
            }

            return answer ; 
      }

      
      
}
