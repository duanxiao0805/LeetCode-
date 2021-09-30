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
    List<String> ans=new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if(root==null)
            return ans;
        dfs(root,"");
        
        return ans;
    }
    public void dfs(TreeNode root,String s){
        s+=root.val;    //拼接上新的节点值
        if(root.left==null&&root.right==null){
            ans.add(s);
        }
        if(root.left!=null){
            dfs(root.left,s+"->");
        }
        if(root.right!=null){
            dfs(root.right,s+"->");
        }
    }
}
