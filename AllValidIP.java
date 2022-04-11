import java.util.ArrayList;

public class AllValidIP{
      public static ArrayList<String>
    restoreIpAddresses(String A){
          if(A.length()<3 || A.length()>12){
                return new ArrayList<>() ;
          }
          //Else Convert the given string to Valid Ip 
          return convert(A) ;
    }

    private static ArrayList<String>
    convert(String s){
          ArrayList<String> list = new ArrayList<>() ; 
          int len = s.length() ; 

          String snew = s  ; 
          for(int i = 1 ; i<len-2 ; i++){
                for(int j = i+1 ; j<len-1 ; j++){
                      for(int k = j+1 ; k<len ; k++){
                            snew = snew.substring(0, k) + "."
                                        + snew.substring(k);
                            snew = snew.substring(0, j) + "."
                                        + snew.substring(j);
                            snew = snew.substring(0, i) + "."
                                        + snew.substring(i);

                            if (isValid(snew)) {
                                  list.add(snew);
                            }
                            snew = s;
                      }
                }
          }

          return list ; 
    }

    private static 
          boolean isValid(String ip){
                String a[] = ip.split("[.]");
          for (String s : a) {
                int i = Integer.parseInt(s);
                if (s.length() > 3 || i < 0 || i > 255) {
                      return false;
                }
                if (s.length() > 1 && i == 0)
                      return false;
                if (s.length() > 1 && i != 0
                            && s.charAt(0) == '0')
                      return false;
          }

          return true;
      }

      public static void main(String[] args) {
            ArrayList<String> list  = restoreIpAddresses("25525511135") ;
            for(int i = 0 ; i<list.size() ; i++){
                  System.out.println(list.get(i));
            } 
      }
}