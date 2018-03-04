public class LinkedList<T> {
    private Node<T> head, tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addHead(Node<T> n) {
        if (head == null) {
            head = n;
            tail = n;
        }
        else {
            n.setNext(head);
            head = n;
        }
    }

    public void addTail(Node<T> n) {
        if (head == null) {
            head = n;
            tail = n;
        }
        else {
            tail.setNext(n);
            tail = n;
        }
    }

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    public Node<T> removeHead() {
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

        return removed;
    }

    public Node<T> removeTail() {
        if (head == tail) {
            return removeHead();
        }

        Node<T> iter = head;

        while (iter.getNext() != tail) {
            iter = iter.getNext();
        }

        Node<T> removed = tail;
        tail = iter;
        
        return removed;
    }
}
