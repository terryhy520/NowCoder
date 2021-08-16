/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: MergeTest.java
 * @author: terryhy520@gmail.com
 * @date: 8/16/21, 9:56 PM
 * @version: 1.0
 */

package bytedance;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * @Author: Terry
 * @Date: 8/16/2021 9:56 PM
 */
public class MergeTest {

    @Test
    public void merge() {
        Interval interval01 = new Interval(10, 30);
        Interval interval02 = new Interval(20, 60);
        Interval interval03 = new Interval(80, 100);
        Interval interval04 = new Interval(150, 180);
        ArrayList<Interval> input = new ArrayList<>(4);
        Merge merge = new Merge();
        input.add(interval01);
        input.add(interval02);
        input.add(interval03);
        input.add(interval04);
        ArrayList<Interval> result = merge.merge(input);
        assertEquals(3, result.size());
    }
}