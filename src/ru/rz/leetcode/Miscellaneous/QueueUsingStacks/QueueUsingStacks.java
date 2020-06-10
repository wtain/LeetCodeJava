package ru.rz.leetcode.Miscellaneous.QueueUsingStacks;

import java.util.Stack;

class MyQueue {

    Stack<Integer> write, read;

    /** Initialize your data structure here. */
    public MyQueue() {
        write = new Stack<>();
        read = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        write.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        maintainRead();
        return read.pop();
    }

    private void maintainRead() {
        if (read.empty())
            while (!write.empty())
                read.push(write.pop());
    }

    /** Get the front element. */
    public int peek() {
        maintainRead();
        return read.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return write.empty() && read.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

public class QueueUsingStacks {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());  // returns 1
        System.out.println(queue.pop());   // returns 1
        System.out.println(queue.empty()); // returns false
    }
}
