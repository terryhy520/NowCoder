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
