/*
 * Copyright (c) 2021. Terry All Rights Reserved.
 * FileName: ListNodeUtils.java
 * @author: terryhy520@gmail.com
 * @date: 8/14/21, 10:48 PM
 * @version: 1.0
 */

package common;

public class ListNodeUtils {
    public static boolean isEqual(ListNode listNode1, ListNode listNode2) {
        if (listNode1 == null || listNode2 == null) {
            return false;
        }
        ListNode p = listNode1;
        ListNode q = listNode2;
        while (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            }
            p = p.next;
            q = q.next;
        }
        if (p == null && q == null) {
            return true;
        } else {
            return false;
        }
    }
}
