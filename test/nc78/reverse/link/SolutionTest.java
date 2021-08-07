package nc78.reverse.link;

import common.ListNode;
import common.ListNodeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void reverseList01() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        ListNode expectNode1 = new ListNode(3);
        ListNode expectNode2 = new ListNode(2);
        ListNode expectNode3 = new ListNode(1);
        expectNode1.next = expectNode2;
        expectNode2.next = expectNode3;

        Solution solution = new Solution();
        assertTrue(ListNodeUtils.isEqual(expectNode1, solution.ReverseList(node1)));

    }
}