public class Deque<T> {
    private Stack<T> sOldest, sNewest;

    public Deque() {
        sOldest = new Stack<T>();
        sNewest = new Stack<T>();
    }

    public void addTail(T t) {
        sNewest.push(t);
    }

    private void reformHead() {
        if (sOldest.peak() == null) {
            while (sNewest.peak() != null) {
                sOldest.push(sNewest.pop());
            }
        }
    }

    public T peakHead() {
        reformHead();
        return sOldest.peak();
    }

    public T pullHead() {
        reformHead();
        return sOldest.pop();
    }

    public void addHead(T t) {
        sOldest.push(t);
    }

    private void reformTail() {
        if (sNewest.peak() == null) {
            while (sOldest.peak() != null) {
                sNewest.push(sOldest.pop());
            }
        }
    }
    
    public T peakTail() {
        reformTail();
        return sNewest.peak();
    }

    public T pullTail() {
        reformTail();
        return sNewest.pop();
    }
}
