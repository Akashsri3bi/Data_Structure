import java.util.ArrayList;
import java.util.PriorityQueue;

public class HuffmanEncoding {

      class Node implements Comparable<Node>{
    int data ;
    Node left ; 
    Node right ; 
    Node(int data){
        this.data = data ; 
    }
    public int compareTo(Node p){
        if(this.data==p.data)
          return 1;
        return this.data-p.data;
    }
}

    static void traverse(Node root, ArrayList<String> ans , String temp){
        if(root.left==null && root.right==null){
            ans.add(temp) ;
            return ;
        }
        traverse(root.left,ans,temp+"0");
        traverse(root.right,ans,temp+"1") ;
    }
    public ArrayList<String> huffmanCodes(String S, int f[], int N)
    {
        // Code here
        PriorityQueue<Node> pq = new PriorityQueue<>() ; //acting as a minHeap
        for(int i = 0 ;i<f.length ; i++){
            pq.add(new Node(f[i])) ;
        }
        
        while(pq.size()>1){
            Node left = pq.poll() ; 
            Node right = pq.poll() ; 
            Node parent = new Node(left.data + right.data) ; 
            parent.left = left ;
            parent.right = right ; 
            pq.add(parent) ;
        }
        Node root = pq.poll() ; 
        ArrayList<String> ans = new ArrayList<>() ; 
        String temp = "" ;
        traverse(root , ans , temp) ;
        
        return ans ;
        
    }
      
}
