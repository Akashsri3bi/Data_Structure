public class PathFromRoot {

    public static ArrayList<ArrayList<Integer>> printPaths(Node root, int sum)
    {
        ArrayList<ArrayList<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>ds=new ArrayList<>();
        int a[]=new int[1];
        func(root,a,sum,ds,ans);
        return ans;
    }
    public static void func(Node root,int a[],int s,ArrayList<Integer>ds,ArrayList<ArrayList<Integer>>ans){
        if(root==null)return ;
         a[0]+=root.data;
         ds.add(root.data);
         if(s==a[0]){
             ans.add(new ArrayList<>(ds));
           
         }
         func(root.left,a,s,ds,ans);
          
         func(root.right,a,s,ds,ans);
            ds.remove(ds.size()-1);
           a[0]-=root.data;
    }
      
}
