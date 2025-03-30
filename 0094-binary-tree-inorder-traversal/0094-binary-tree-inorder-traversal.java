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
// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
//         Stack<TreeNode> stack = new Stack<>();
//         List<Integer> res = new ArrayList<>();
//         TreeNode currentNode = root;
//         while(currentNode !=null || !stack.isEmpty() ){
//             while(currentNode !=null){
//                 stack.push(currentNode);
//                 currentNode =currentNode.left;
//             }
//             currentNode =stack.pop();
//             res.add(currentNode.val);
//             currentNode = currentNode.right;
//         }
//      return res;   
//     }
// }
//aporch 2 date 30-3-25
class Solution {
     public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root,res);
        return res;
        
     }
     private void inorder(TreeNode root, List<Integer>res){
        if(root == null)  return ;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
     }
}