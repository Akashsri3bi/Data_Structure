import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {

      	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   Set<Integer> set = new HashSet<>() ; 
	   for(int i =0 ;i<arr.length;i++){
	       set.add(arr[i]) ; 
	   }
	   int len = 0 ;
	   int maxLen = 0 ;
	   for(int i = 0 ;i<arr.length;i++){
	       if(!set.contains(arr[i]-1)){
	           len=1;
	           while(set.contains(arr[i]+1)){
	               arr[i]++;
	               len++;
	           }
	       }
	       maxLen = Math.max(maxLen , len) ;
	   }
	   
	   return maxLen ;
	}
      
}
