/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: TreeSum.java
 * @author: terryhy520@gmail.com
 * @date: 8/25/21, 8:23 PM
 * @version: 1.0
 */

package bytedance;

/**
 * @Author: Terry
 * @Date: 8/25/2021 8:23 PM
 */
public class TreeSum {

    private boolean found;
    private int totalLevel;
    private int currentLevel;
    public boolean findSum(int target, TreeNode treeNode) {
        found = false;
        totalLevel = 0;
        currentLevel = 0;
        findLevel(treeNode);
        currentLevel = 0;
        return traverse(target, treeNode);
    }

    void findLevel(TreeNode treeNode) {
        currentLevel++;
        if (treeNode.left == null && treeNode.right == null) {
            if (currentLevel > totalLevel) {
                totalLevel = currentLevel;
            }
        }
        if (treeNode.left != null) {
            findLevel(treeNode.left);
            currentLevel--;
        }
        if (treeNode.right != null) {
            findLevel(treeNode.right);
            currentLevel--;
        }
    }


    boolean traverse(int target, TreeNode treeNode) {
        currentLevel++;
        boolean left = false;
        boolean right = false;
        if (treeNode.left == null && treeNode.right == null) {
            if (target == treeNode.value && currentLevel == totalLevel) {
                return true;
            } else {
                return false;
            }
        }
        if (treeNode.left != null) {
            left = traverse(target - treeNode.value, treeNode.left);
            currentLevel--;
        }
        if (treeNode.right != null) {
            right = traverse(target - treeNode.value, treeNode.right);
            currentLevel--;
        }
        if (left || right) {
            return true;
        } else {
            return false;
        }
    }

}


class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.value = value;
    }
}

