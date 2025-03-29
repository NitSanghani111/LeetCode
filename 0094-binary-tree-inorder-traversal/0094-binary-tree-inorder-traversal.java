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
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        TreeNode currentNode = root;
        while(currentNode !=null || !stack.isEmpty() ){
            while(currentNode !=null){
                stack.push(currentNode);
                currentNode =currentNode.left;
            }
            currentNode =stack.pop();
            res.add(currentNode.val);
            currentNode = currentNode.right;
        }
     return res;   
    }
}