package ru.rz.leetcode.Miscellaneous.StackUsingQueues;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

    Queue<Integer> data;

    /** Initialize your data structure here. */
    public MyStack() {
        data = new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        Queue<Integer> tmp = new ArrayDeque<>();
        tmp.add(x);
        while (!data.isEmpty()) {
            tmp.add(data.remove());
        }
        data = tmp;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        return data.remove();
    }

    /** Get the top element. */
    public int top() {
        return data.peek();
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return data.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */

public class StackUsingQueues {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        System.out.println(stack.top());   // returns 2
        System.out.println(stack.pop());   // returns 2
        System.out.println(stack.empty()); // returns false
    }
}
