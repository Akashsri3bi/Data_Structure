public class RightMostDifferentBit {

          public static int posOfRightMostDiffBit(int m, int n)
    {
        // Your code here        
        int diff = 1;
        while((m&1)==(n&1)){
            if(m==0 && n==0){
                return -1;
            }
            m = m>>1;
            n = n>>1;
            diff++;
        }
        return diff;
    }
      
}
