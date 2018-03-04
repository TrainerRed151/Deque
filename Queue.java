public class Queue<T> {
    private Stack<T> sOldest, sNewest;

    public Queue() {
        sOldest = new Stack<T>();
        sNewest = new Stack<T>();
    }

    public void add(T t) {
        sNewest.push(t);
    }

    private void reform() {
        if (sOldest.peak() == null) {
            while (sNewest.peak() != null) {
                sOldest.push(sNewest.pop());
            }
        }
    }

    public T peak() {
        reform();
        return sOldest.peak();
    }

    public T pull() {
        reform();
        return sOldest.pop();
    }
}
