package stackqueue;

import java.util.EmptyStackException;

public class MyStack<T> {
    class StackNode {
        private T data;
        private StackNode next;
        private StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode top;
    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T item) {
        StackNode t = new StackNode(item);
        t.next = top;
        top = t;
    }

    public T peek() {
         if (top == null) throw new EmptyStackException();
         return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
