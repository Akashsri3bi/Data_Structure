import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Kickstart {

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ; 
            int t = sc.nextInt() ; 

            int i = 0 ; 
            while(i<t){
                  String original = sc.next() ; 
                  String wrote = sc.next() ; 
                  
                  if(original.length()==wrote.length()){
                        if(original.equals(wrote)){
                              System.out.println("Case #"+(i+1)+": "+"0");
                        }else{
                              System.out.println("Case #" + (i + 1) + ":" + " IMPOSSIBLE");
                        }
                  }else if(original.length()>wrote.length()){
                        System.out.println("Case #" + (i+1) + ":" + " IMPOSSIBLE");
                  }else{
                        int k = original.length() ; 
                        int c = wrote.length() ; 

                        HashSet<Character> set1 = new HashSet<>() ;

                        for(int l = 0 ; l<k ; l++){
                              set1.add(original.charAt(l)) ; 
                        }

                        int count = 0 ; 
                        for(int r = 0; r<c ; r++){
                              if(set1.contains(wrote.charAt(i))){
                                    count++ ; 
                              }
                        }

                        if(count!=c){
                              System.out.println("Case #" + (i + 1) + ":" + " IMPOSSIBLE");
                        }else{
                              int diff = c-k ; 
                              System.out.println("Case #" + (i + 1) + ": " + diff);
                        }
                  }
                  i++ ; 
            }
      }
      
      
}
