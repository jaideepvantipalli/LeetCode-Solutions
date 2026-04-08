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
    public boolean findTarget(TreeNode root, int target) {
        ArrayList<Integer> al=new ArrayList<>();
        getInorder(root,al);
        int s=0;
        int e=al.size()-1;
        while(s<e){
            if(al.get(s)+al.get(e)==target) return true;
            else if(al.get(s)+al.get(e)< target) s++;
            else e--;
        }
        return false;
    }
    
    private static void getInorder(TreeNode root,ArrayList<Integer> al){
        if(root == null ) return;
        getInorder(root.left,al);
        al.add(root.val);
        getInorder(root.right,al);
    }
}