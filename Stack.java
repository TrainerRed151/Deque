public class Stack<T> {
    private LinkedList<T> list;

    public Stack() {
        list = new LinkedList<T>();
    }

    public void push(T t) {
        list.addHead(t);
    }

    public T peak() {
        return list.getHead();
    }

    public T pop() {
        return list.removeHead();
    }
}
