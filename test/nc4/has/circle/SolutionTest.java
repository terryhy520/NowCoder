package nc4.has.circle;

import common.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void hasCycle01() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node2;
        Solution solution = new Solution();
        assertTrue(solution.hasCycle(node1));
    }
}