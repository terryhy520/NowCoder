/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: Solution.java
 * @author: terryhy520@gmail.com
 * @date: 8/14/21, 10:48 PM
 * @version: 1.0
 */

package nc4.has.circle;

import common.ListNode;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode p = head.next;
        ListNode q = head.next.next;
        while (q != null) {
            p = p.next;
            if (q.next == null) {
                return false;
            }
            q = q.next.next;
            if (q == p) {
                return true;
            }
        }
        return false;
    }
}
