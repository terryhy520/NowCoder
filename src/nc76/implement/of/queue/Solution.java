/*
 * Copyright (c) 2021-2021. Terry All Rights Reserved.
 * FileName: Solution.java
 * @author: terryhy520@gmail.com
 * @date: 8/14/21, 10:48 PM
 * @version: 1.0
 */

package nc76.implement.of.queue;

import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
