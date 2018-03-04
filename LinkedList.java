public class LinkedList<T> {
    private Node<T> head, tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addHead(T t) {
        Node<T> n = new Node<T>(t);
        if (head == null) {
            head = n;
            tail = n;
        }
        else {
            n.setNext(head);
            head = n;
        }
    }

    public void addTail(T t) {
        Node<T> n = new Node<T>(t);
        if (head == null) {
            head = n;
            tail = n;
        }
        else {
            tail.setNext(n);
            tail = n;
        }
    }

    public T getHead() {
        if (head == null) {
            return null;
        }

        return head.getData();
    }

    public T getTail() {
        if (tail == null) {
            return null;
        }

        return tail.getData();
    }

    public T removeHead() {
        if (head == null) {
            return null;
        }

        Node<T> removed = head;

        if (head == tail) {
            head = null;
            tail = null;
        }
        else {
            head = head.getNext();
        }

        return removed.getData();
    }

    public T removeTail() {
        if (head == tail) {
            return removeHead();
        }

        Node<T> iter = head;

        while (iter.getNext() != tail) {
            iter = iter.getNext();
        }

        Node<T> removed = tail;
        tail = iter;
        
        return removed.getData();
    }
}
