import java.util.TreeMap;

public class WinningElection {

          public static String[] winner(String arr[], int n)
    {
        // add your code


        TreeMap<String,Integer> map=new TreeMap<>();                              for(String s:arr)
        {
            map.put(s,map.getOrDefault(s,0)+1);
        }
        String ans="";
        int max=Integer.MIN_VALUE;
        for(String s:map.keySet())
        {
            int t=map.get(s);
            if(t>max)
            {
                max=t;
                ans=s;
            }
        }
        String res[]={ans,String.valueOf(max)};
        return res;
    }
      
}
