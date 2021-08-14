/*
 * Copyright (c) 2021-2021. Terry All Rights Reserved.
 * FileName: Solution.java
 * @author: terryhy520@gmail.com
 * @date: 8/14/21, 10:48 PM
 * @version: 1.0
 */

package nc41.longest.no.repeating.subarray;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /**
     * @param arr int整型一维数组 the array
     * @return int整型
     */
    public int maxLength(int[] arr) {
        int result = 0;
        int left = 0;
        int right = 0;
        Set exists = new HashSet(arr.length);
        while (right < arr.length) {
            while (exists.contains(arr[right])) {
                exists.remove(arr[left++]);
            }
            exists.add(arr[right++]);
            result = Math.max(result, right - left);
        }
        return result;
    }
}
