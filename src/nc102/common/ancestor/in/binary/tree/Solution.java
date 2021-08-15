/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: Solution.java
 * @author: terryhy520@gmail.com
 * @date: 8/15/21, 11:48 PM
 * @version: 1.0
 */

package nc102.common.ancestor.in.binary.tree;

/**
 * @Author: Terry
 * @Date: 8/15/2021 11:48 PM
 */
public class Solution {
    /**
     *
     * @param root TreeNode类
     * @param o1 int整型
     * @param o2 int整型
     * @return int整型
     */
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        if (root == null) {
            return -1;
        }
        if (o1 == root.val || o2 == root.val) {
            return root.val;
        }
        int left = lowestCommonAncestor(root.left, o1, o2);
        int right = lowestCommonAncestor(root.right, o1, o2);
        if (left == -1) {
            return right;
        }
        if (right == -1) {
            return left;
        }
        return root.val;
    }
}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
