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
        if(root==null)
        {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        List<List<Integer>> ans=new ArrayList<>();
        while(!queue.isEmpty())
        {
            List<TreeNode> list=new ArrayList<>();
            List<Integer> list2=new ArrayList<>();
            while(!queue.isEmpty())
            {
                TreeNode node=queue.poll();
                list.add(node);
                list2.add(node.val);
            }
            if(queue.isEmpty())
            {
                for(int i=0;i<list.size();i++)
                {
                    TreeNode temp=list.get(i);
                    if(temp.left!=null)
                    {
                        queue.add(temp.left);
                    }
                    if(temp.right!=null)
                    {
                        queue.add(temp.right);
                    }
                }
                ans.add(new ArrayList<>(list2));
            }
        }
        return ans;
    }
}
