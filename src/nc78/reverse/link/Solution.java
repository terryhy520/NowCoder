/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: Solution.java
 * @author: terryhy520@gmail.com
 * @date: 8/14/21, 10:48 PM
 * @version: 1.0
 */

package nc78.reverse.link;

import common.ListNode;

public class Solution {
    public ListNode ReverseList(ListNode head) {
        if (null == head) {
            return null;
        }
        ListNode first = head;
        ListNode second = head.next;
        head.next = null;
        while (second != null) {
            ListNode temp = first;
            first = second;
            second = second.next;
            first.next = temp;
        }
        return first;
    }
}
