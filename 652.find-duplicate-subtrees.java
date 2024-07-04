/*
 * @lc app=leetcode id=652 lang=java
 *
 * [652] Find Duplicate Subtrees
 */

// @lc code=start
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
    Map<String, Integer> map = new HashMap<>();
    List<Node> res = new ArrayList<>();

    public List<Node> printAllDups(Node root) {
        traverse(root);
        return res;
    }

    private String traverse(Node node) {
        if (node == null) return "";
        String str = node.data + "," + traverse(node.left) + "," + traverse(node.right);
        map.put(str, map.getOrDefault(str, 0) + 1);
        if (map.get(str) == 2) res.add(node);
        return str;
    }
}


// @lc code=end

