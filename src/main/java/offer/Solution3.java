package offer;

import java.util.Stack;

public class Solution3 {
    Stack stack = new Stack();
    Stack minStack = new Stack();
    int min = Integer.MAX_VALUE;

    public void push(int node) {
        if(node < min){
            min = node;
            minStack.push(node);
        }
        stack.push(node);
    }

    public void pop() {
        if(top() == min){
            minStack.pop();
            min = (int) minStack.peek();
        }
        stack.pop();
    }

    public int top() {
        return (int) stack.peek();
    }

    public int min() {
        return min;
    }


}