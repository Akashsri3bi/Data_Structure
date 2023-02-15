public class KthSmallestBST {

          

    int count=0;

    int ans=-1;

void KthSmallestElementhelper(Node root,int K){

    if(root==null){

        return ;

    }

     KthSmallestElementhelper(root.left,K);

        count++;

        if(count==K){

            ans=root.data;

        }

        KthSmallestElementhelper(root.right,K);

}

   public int KthSmallestElement(Node root, int K) {

       if(root==null){

            return -1;

        }

        if(root.left==null && root.right==null){

            return -1;

        }

        KthSmallestElementhelper(root,K);

        return ans;

    }
      
}
