package easy;

import java.util.List;
import java.util.Stack;

public class ImplementQueueUsingStack {

    public static void main(String[] args) {

        MyQueue myQueue = new MyQueue();

        myQueue.push(10);
        myQueue.push(20);

        System.out.println(myQueue.pop());
    }

}


class MyQueue {

    Stack<Integer> stack;

    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.isEmpty()) {
            temp.push(stack.pop());
        }
        stack.push(x);
        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    public int pop() {
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean empty() {
        return stack.isEmpty();
    }

}
/*
 Stack<Integer> stack;
    Stack<Integer> queueStack;
    int front;

    public MyQueue(){
        stack = new Stack<>();
        queueStack = new Stack<>();
    }

    public void push(int x) {
        if (stack.empty()){
            front = x;
        }
        stack.push(x);
    }

    public int pop() {
        while(!stack.empty()){
            queueStack.push(stack.pop());
        }
        int removed = queueStack.pop();
        while(!queueStack.empty()){
            stack.push(queueStack.pop());
        }
        return removed;
    }

    public int peek() {
        while(!stack.empty()){
            queueStack.push(stack.pop());
        }
        int peek = queueStack.peek();
        while(!queueStack.empty()){
            stack.push(queueStack.pop());
        }
        return peek;
    }

    public boolean empty() {
        return stack.isEmpty();
    }
 */