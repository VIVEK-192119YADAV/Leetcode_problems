// Last updated: 8/3/2025, 8:39:01 PM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    
    List<List<Integer>>mr=new ArrayList();
    sol(root,mr);
    return mr;
    }
    public void sol(TreeNode root,List<List<Integer>>mr)
    {
        if(root==null)return ;
        LinkedList <TreeNode> q = new LinkedList();
        q.addLast(root);
        q.addLast(null);
        ArrayList<Integer>list=new ArrayList();
        while(!q.isEmpty()){
            TreeNode temp = q.removeFirst();       
            if(temp==null){        
                mr.add(list);
                list=new ArrayList();
                if(q.isEmpty())break;
                q.addLast(null);
                continue;
            }
            list.add(temp.val);
            if(temp.left!=null){
                q.addLast(temp.left);
            }
            if(temp.right!=null){
                q.addLast(temp.right);
            }
            
              }
}
}