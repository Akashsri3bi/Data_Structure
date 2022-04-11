import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class PrintAnagramsTogether {


      public static List<List<String>> Anagrams(String[] string_list){

            List<List<String>> bigList = new ArrayList<>() ; 
            HashMap<String , List<String>> map = new HashMap<>() ; 

            for(int i = 0 ; i<string_list.length ; i++){
                  String word = string_list[i] ; 
                  char[] letters = word.toCharArray() ; 
                  Arrays.sort(letters);

                  String newWord = letters.toString() ;

                  if(map.containsKey(newWord)){
                        map.get(newWord).add(word) ; 
                  }else{
                        List<String> words = new ArrayList<>();
                        words.add(word) ; 
                        map.put(newWord,words) ;
                  }

            }

            for(String s : map.keySet()){
                  bigList.add(
                        map.get(s)
                  ) ;
                  
            }

            return bigList ; 

      }
      public static void main(String[] args) {
            // Driver program
            String arr[] = { "cat", "dog", "tac", "god", "act" };
            List<List<String>>results = Anagrams(arr);

            for(int  i = 0  ; i<results.size() ; i++){
                  System.out.println(results.get(i));
            }

      }
      
}
