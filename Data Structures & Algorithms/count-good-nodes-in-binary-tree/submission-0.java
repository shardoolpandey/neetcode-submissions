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
    public int goodNodes(TreeNode root) {
        int arr[]=new int[1];
        arr[0]=0;
        int max=root.val;
        countNodes(root,max,arr);
        return arr[0];
    }
    public void countNodes(TreeNode root, int max,int arr[])
    {
        if(root==null)
        {
            return;
        }
        if(root.val>=max)
        {
            max=root.val;
            arr[0]++;
        }
        countNodes(root.left,max,arr);
        countNodes(root.right,max,arr);

    }
}
