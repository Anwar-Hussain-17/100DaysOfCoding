//https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder == null||postorder ==null||inorder.length!=postorder.length){
            return null;
        }
        HashMap<Integer,Integer> H = new HashMap<>();
        for(int i =0;i<inorder.length;++i){
           H.put(inorder[i],i);
        }
       return buildtree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,H);
         
    }
    private TreeNode buildtree(int[] inorder , int is,int ie,int[] postorder,int ps,int pe,HashMap<Integer,Integer>H ){
        if(ps>pe||is>ie){
            return null;
        }
        TreeNode root  = new TreeNode(postorder[pe]);
        int inRoot = H.get(postorder[pe]);
        int numsleft = inRoot-is;
        root.left =buildtree(inorder,is,inRoot-1,postorder,ps,ps+numsleft-1,H);
        root.right =buildtree(inorder,inRoot+1,ie,postorder,ps+numsleft,pe-1,H);
        return root;
    }
}
