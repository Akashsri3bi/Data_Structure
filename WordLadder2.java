import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WordLadder2 {

          public ArrayList<ArrayList<String>> findSequences(String startWord, String targetWord, String[] wordList)
    {
        // Code here
        Set<String> set = new HashSet<>() ; 
        int len = wordList.length;
        for(int i = 0 ;i<len ; i++){
            set.add(wordList[i]) ; 
        }
        Queue<ArrayList<String>> q = new LinkedList<>() ; 
        ArrayList<String> ls = new ArrayList<>() ; 
        ls.add(startWord) ; 
        q.add(ls) ; 
        ArrayList<String> usedOnLevel = new ArrayList<>() ; 
        usedOnLevel.add(startWord) ; 
        int level = 0 ; 
        ArrayList<ArrayList<String>> ans = new ArrayList<>() ; 
        
        while(!q.isEmpty()){
            ArrayList<String> curr = q.poll() ; 
            if(curr.size()>level){
                level++;
                for(String it : usedOnLevel){
                    set.remove(it) ; 
                }
            }
            String word = curr.get(curr.size()-1);
            if(word.equals(targetWord)){
                //If Got first time
                if(ans.size()==0){
                    ans.add(curr) ; 
                }else if(ans.get(0).size()==curr.size()){
                    ans.add(curr) ; 
                }
            }
            for(int i = 0 ; i<word.length() ; i++){
                for(char c = 'a' ; c<='z' ; c++){
                    char[] replacedCharacter = word.toCharArray() ; 
                    replacedCharacter[i] = c; 
                    String replacedWord = new String(replacedCharacter) ; 
                    if(set.contains(replacedWord)){
                        curr.add(replacedWord) ; 
                        ArrayList<String> temp = new ArrayList<>(curr) ; 
                        q.add(temp) ; 
                        curr.remove(curr.size()-1) ; 
                    }
                }
            }
        }
        
        return ans ;
    }
      
}
