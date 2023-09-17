import java.util.Arrays;
import java.util.Comparator;


class Box{
    int length ; 
    int width ; 
    int height ; 
    
    Box(int length , int width , int height){
        this.length = length ; 
        this.width = width ; 
        this.height = height ;
    }
}

public class BoxStacking {

          public static int maxHeight(int[] height, int[] width, int[] length, int n)
    {
        // Code here
        Box[] boxes = new Box[3*n] ; 
        int idx = 0;
        
        for(int i=0 ; i<n; i++){
            if(length[i]>width[i]){
                boxes[idx] = new Box(length[i] , width[i] , height[i]) ; 
            }else{
                boxes[idx] = new Box(width[i] , length[i] , height[i]) ;
            }
            idx++;
            if(height[i] > width[i])
                boxes[idx] = new Box(height[i], width[i], length[i]);
            else
                boxes[idx] = new Box(width[i], height[i], length[i]);
            idx++;
            
            
            if(length[i] < height[i])
                boxes[idx] = new Box(height[i], length[i], width[i]);
            else
                boxes[idx] = new Box(length[i], height[i], width[i]);
            idx++;
            
        }
        
        Arrays.sort(boxes , new Comparator<Box>(){
            @Override
            public int compare(Box b1 , Box b2){
                return (b1.length*b1.width) - (b2.length*b2.width) ;
            }
        }) ; 
        
        int m = boxes.length ; 
        int[] lis = new int[m] ; 
        lis[0] = boxes[0].height ; 
        
        for(int i = 1 ; i<m ; i++){
            lis[i] = boxes[i].height ; 
            
            for(int j = 0 ; j<i ;j++){
                if(boxes[j].length < boxes[i].length && boxes[j].width < boxes[i].width){
                    lis[i] = Math.max(lis[i] , lis[j] + boxes[i].height) ; 
                }
            }
        }
        
        int res = lis[0] ; 
        for(int i = 1 ; i<m ; i++){
            if(res<lis[i]){
                res = lis[i] ; 
                
            }
        }
        
        return res ; 
    }
      
}
