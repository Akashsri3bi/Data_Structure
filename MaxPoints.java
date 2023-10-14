public class MaxPoints {
          public int maxScore(int[] cardPoints, int k){
        int n = cardPoints.length ; 
        int[] points = new int[n] ;
        int sum = 0; 
        for(int i = 0 ;i<n;i++){
            sum+=cardPoints[i] ; 
            points[i] = sum ; 
        }
        if(k==n){
            return sum ; 
        }
        
        int score = 0 ;
        int ans = 0 ;
        for(int i = 0 ;i<=k;i++){
            int j = i + n - k - 1 ;
            if(i==0){
                ans = points[j] ; 
            }else{
            ans = points[j] - points[i-1] ; 
            } 
            score = Math.max(score , sum - ans) ; 
        }
        return score;  
    }
      
}
