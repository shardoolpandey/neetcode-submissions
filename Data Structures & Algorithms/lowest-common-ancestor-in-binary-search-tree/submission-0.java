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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
        {
            return null;
        }
        if(root.val==p.val || root.val==q.val)
        {
            return root;
        }
        TreeNode lt=lowestCommonAncestor(root.left,p,q);
        TreeNode rt=lowestCommonAncestor(root.right,p,q);
        if(lt==null && rt==null)
        {
            return null;
        }
        else if(lt!=null && rt!=null)
        {
            return root;
        }
        else
        {
            if(lt!=null)
            {
                return lt;
            }
            else
            {
                return rt;
            }
        }
    }
}
