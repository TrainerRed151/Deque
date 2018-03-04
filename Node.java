public class Node<T> {
    private T data;
    private Node<T> next;

    public Node() {
        data = null;
        next = null;
    }

    public Node(T t) {
        data = t;
        next = null;
    }

    public Node(T t, Node<T> n) {
        data = t;
        next = n;
    }

    public boolean hasNext() {
        return next != null;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setData(T t) {
        data = t;
    }

    public void setNext(Node<T> n) {
        next = n;
    }
}
