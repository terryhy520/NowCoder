package nc95.lru;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void LRUTest01() {
        int[][] operators = new int[][]{{1, 1, 1}, {1, 2, 2,}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}};
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1, -1}, solution.LRU(operators, 3));
    }

    @Test
    public void LRUTest02() {
        int[][] operators = new int[][]{{1, 1, 1}, {1, 1, 2,}, {2, 1}};
        Solution solution = new Solution();
        assertArrayEquals(new int[]{2}, solution.LRU(operators, 3));
    }

    @Test
    public void LRUTest03() {
        int[][] operators = new int[][]{{1,1,1},{1,2,2},{2,1},{1,3,3},{2,2},{1,4,4},{2,1},{2,3},{2,4}};
        Solution solution = new Solution();
        assertArrayEquals(new int[]{1,2,-1,3,4}, solution.LRU(operators, 3));
    }
}