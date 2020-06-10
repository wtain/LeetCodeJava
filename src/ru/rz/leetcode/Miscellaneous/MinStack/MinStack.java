package ru.rz.leetcode.Miscellaneous.MinStack;

import java.util.Stack;

class MinStack {

    class Entry
    {
        int value;
        int minValue;

        Entry(int value, int minValue) {
            this.value = value;
            this.minValue = minValue;
        }
    }

    Stack<Entry> data = new Stack<>();

    /** initialize your data structure here. */
    public MinStack() {

    }

    public void push(int x) {
        int minValue = x;
        if (!data.isEmpty())
            minValue = Math.min(minValue, data.peek().minValue);
        data.push(new Entry(x, minValue));
    }

    public void pop() {
        data.pop();
    }

    public int top() {
        return data.peek().value;
    }

    public int getMin() {
        return data.peek().minValue;
    }
}