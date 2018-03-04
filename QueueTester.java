public class QueueTester {
    public static void main (String[] args) {
        Queue<String> q = new Queue<String>();

        q.add("A");
        q.add("B");
        q.add("C");
        q.add("D");
        q.add("E");

        System.out.println(q.peak());

        while (q.peak() != null) {
            System.out.println(q.pull());
        }

        q.add("1");
        q.add("2");
        q.pull();
        q.add("3");
        q.add("4");
        q.add("5");
        q.pull();
        q.pull();

        while (q.peak() != null) {
            System.out.println(q.pull());
        }
    }
}
