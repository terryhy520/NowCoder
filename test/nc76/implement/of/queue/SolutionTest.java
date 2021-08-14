package nc76.implement.of.queue;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
    @Test
    public void queue01() {
        Solution solution = new Solution();
        solution.push(1);
        solution.push(2);
        assertEquals(1, solution.pop());
        assertEquals(2, solution.pop());
    }

}