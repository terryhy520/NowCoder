/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: TreeSumTest.java
 * @author: terryhy520@gmail.com
 * @date: 8/25/21, 8:40 PM
 * @version: 1.0
 */

package bytedance;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: Terry
 * @Date: 8/25/2021 8:40 PM
 */
public class TreeSumTest {

    @Test
    public void findSum01() {
        TreeNode treeNode00 = new TreeNode(5);
        TreeNode treeNode10 = new TreeNode(4);
        TreeNode treeNode11 = new TreeNode(8);
        TreeNode treeNode20 = new TreeNode(11);
        TreeNode treeNode21 = new TreeNode(-3);
        TreeNode treeNode22 = new TreeNode(3);
        TreeNode treeNode31 = new TreeNode(7);
        TreeNode treeNode32 = new TreeNode(2);
        TreeNode treeNode33 = new TreeNode(1);

        treeNode00.left = treeNode10;
        treeNode00.right = treeNode11;
        treeNode10.left = treeNode20;
        treeNode11.left = treeNode21;
        treeNode11.right = treeNode22;
        treeNode20.left = treeNode31;
        treeNode20.right = treeNode32;
        treeNode21.right = treeNode33;

        TreeSum treeSum = new TreeSum();

        assertTrue(treeSum.findSum(22, treeNode00));
        assertFalse(treeSum.findSum(16, treeNode00));

    }
}