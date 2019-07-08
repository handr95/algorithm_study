package stackqueue;

import java.util.NoSuchElementException;

public class MyQueue<T> {
    class QueueNode {
        private T data;
        private QueueNode next;
        public QueueNode(T data) {
            this.data = data;
        }
    }

    private QueueNode first;
    private QueueNode last;

    public void add(T item) {
        QueueNode t = new QueueNode(item);
        if (last != null) {
            last.next = t;
        }
        last = t;
        if (first == null) {
            first = last;
        }
    }

    public T remove() {
        if (first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;
    }

    public T peek() {
        if (first == null) throw new NoSuchElementException();
        return first.data;
    }

    public boolean isEmpty() {
        return first == null;
    }
}
