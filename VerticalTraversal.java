import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class VerticalTraversal {

          static class Pair{
        int hd;// horizontal distance
        int data;
        int level;
        Pair(int a,int b,int l){
            this.hd=a;
            this.data=b;
            this.level=l;
        }
        
    }
     static void solve(ArrayList <Pair>list,Node root,int n,int l){
        if(root==null){
            return;
        }
        solve(list,root.left,n-1,l+1);
        list.add(new Pair(n,root.data,l));
        solve(list,root.right,n+1,l+1);
    }
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        // add your code here
        ArrayList <Pair>list =new ArrayList<>();
        ArrayList <Integer> arr=new ArrayList<>();
        solve(list,root,0,0);
        Collections.sort(list, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                if(a.hd==b.hd){
                    return a.level-b.level; 
                }
                else{
                    return a.hd - b.hd;
                }      
            }
        });
        for(int i=0;i<list.size();i++){
            arr.add(list.get(i).data);
        }
        return arr;
    }
      
}
