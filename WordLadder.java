import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder {

      public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String> wordset = new HashSet<>(wordList) ; 
        //set is used it makes constant time search 
        if(!wordset.contains(endWord)) {
            return 0 ; 
        }
        Queue<String> q = new LinkedList<>() ; 
        q.add(beginWord) ; 

        int depth = 1 ; 
        while(!q.isEmpty()){
            int size = q.size() ; 
            for(int i = 0 ; i<size ; i++){
                String currWord = q.poll() ; 

                char[] wordArr = currWord.toCharArray() ;
                for(int j = 0 ; j < wordArr.length ; j++){
                    char org = wordArr[j] ; 
                    for(char c = 'a' ; c<='z' ; c++){
                        if(wordArr[j] == c){
                            continue; 
                        }
                        wordArr[j] = c;
                        String transformed = String.valueOf(wordArr);
                        if(transformed.equals(endWord)){
                            return depth+1 ; 
                        }
                        if(wordset.contains(transformed)){
                            q.add(transformed) ; 
                            wordset.remove(transformed) ; 

                        }
                    }
                    wordArr[j] = org ; 
                }
             }
             depth++ ; 
        }
        return 0; 
    }
      
}
