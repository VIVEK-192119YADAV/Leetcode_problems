// Last updated: 1/6/2026, 1:44:24 PM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public int maxLevelSum(TreeNode root) {
18    int  max=Integer.MIN_VALUE;
19    int ans=0;
20    int level=1;
21    int sum=0;
22    Queue<TreeNode>q=new LinkedList<>();
23    q.add(root);
24    while(!q.isEmpty()){
25        int cnt=q.size();
26        sum=0;
27        for(int i=0;i<cnt;i++){
28            TreeNode node=q.poll();
29            sum+=node.val;
30            if(node.left!=null){
31                q.add(node.left);
32            }
33            if(node.right!=null){
34                q.add(node.right);
35            }
36        }
37        if(max<sum){
38            max=sum;
39            ans=level;
40        }
41        level++;
42    }
43      return ans;
44        
45    }
46  
47}