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
