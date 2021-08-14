/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: SolutionTest.java
 * @author: terryhy520@gmail.com
 * @date: 8/14/21, 8:39 PM
 * @version: 1.0
 */

package nc41.longest.no.repeating.subarray;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @Author: Terry
 * @Date: 8/14/2021 8:39 PM
 */
public class SolutionTest {

    @Test
    public void maxLength01() {
        Solution solution = new Solution();
        int[] arr = new int[]{2,3,4,5};
        assertEquals(4, solution.maxLength(arr));
    }

    @Test
    public void maxLength02() {
        Solution solution = new Solution();
        int[] arr = new int[]{2,2,3,4,3};
        assertEquals(3, solution.maxLength(arr));
    }

    @Test
    public void maxLength03() {
        Solution solution = new Solution();
        int[] arr = new int[]{9};
        assertEquals(1, solution.maxLength(arr));
    }

    @Test
    public void maxLength04() {
        Solution solution = new Solution();
        int[] arr = new int[]{1,2,3,1,2,3,2,2};
        assertEquals(3, solution.maxLength(arr));
    }

    @Test
    public void maxLength05() {
        Solution solution = new Solution();
        int[] arr = new int[]{2,2,3,4,8,99,3};
        assertEquals(5, solution.maxLength(arr));
    }

    @Test
    public void maxLength06() {
        Solution solution = new Solution();
        int[] arr = new int[]{};
        assertEquals(0, solution.maxLength(arr));
    }
}