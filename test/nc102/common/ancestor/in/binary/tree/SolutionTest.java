/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: SolutionTest.java
 * @author: terryhy520@gmail.com
 * @date: 8/16/21, 12:15 AM
 * @version: 1.0
 */

package nc102.common.ancestor.in.binary.tree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: Terry
 * @Date: 8/16/2021 12:15 AM
 */
public class SolutionTest {

    @Test
    public void lowestCommonAncestor01() {
        TreeNode node01 = new TreeNode(3);
        TreeNode node02 = new TreeNode(5);
        TreeNode node03 = new TreeNode(1);
        TreeNode node04 = new TreeNode(6);
        TreeNode node05 = new TreeNode(2);
        TreeNode node06 = new TreeNode(0);
        TreeNode node07 = new TreeNode(8);
        TreeNode node08 = new TreeNode(7);
        TreeNode node09 = new TreeNode(4);
        node01.left = node02;
        node01.right = node03;
        node02.left = node04;
        node02.right = node05;
        node03.left = node06;
        node03.right = node07;
        node05.left = node08;
        node05.right = node09;
        Solution solution = new Solution();
        assertEquals(2, solution.lowestCommonAncestor(node01, 7, 4));
    }

    @Test
    public void lowestCommonAncestor02() {
        TreeNode node01 = new TreeNode(3);
        TreeNode node02 = new TreeNode(5);
        TreeNode node03 = new TreeNode(1);
        TreeNode node04 = new TreeNode(6);
        TreeNode node05 = new TreeNode(2);
        TreeNode node06 = new TreeNode(0);
        TreeNode node07 = new TreeNode(8);
        TreeNode node08 = new TreeNode(7);
        TreeNode node09 = new TreeNode(4);
        node01.left = node02;
        node01.right = node03;
        node02.left = node04;
        node02.right = node05;
        node03.left = node06;
        node03.right = node07;
        node05.left = node08;
        node05.right = node09;
        Solution solution = new Solution();
        assertEquals(3, solution.lowestCommonAncestor(node01, 5, 1));
    }

    @Test
    public void lowestCommonAncestor03() {
        TreeNode node01 = new TreeNode(3);
        TreeNode node02 = new TreeNode(5);
        TreeNode node03 = new TreeNode(1);
        TreeNode node04 = new TreeNode(6);
        TreeNode node05 = new TreeNode(2);
        TreeNode node06 = new TreeNode(0);
        TreeNode node07 = new TreeNode(8);
        TreeNode node08 = new TreeNode(7);
        TreeNode node09 = new TreeNode(4);
        node01.left = node02;
        node01.right = node03;
        node02.left = node04;
        node02.right = node05;
        node03.left = node06;
        node03.right = node07;
        node05.left = node08;
        node05.right = node09;
        Solution solution = new Solution();
        assertEquals(3, solution.lowestCommonAncestor(node01, 3, 1));
    }
}