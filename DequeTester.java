public class DequeTester {
    public static void main (String[] args) {
        Deque<String> d = new Deque<String>();

        d.addTail("A");
        d.addTail("B");
        d.addHead("C");
        d.addTail("D");
        d.addHead("E");

        System.out.println(d.peakHead());
        System.out.println(d.peakTail());

        while (d.peakHead() != null) {
            System.out.println(d.pullHead());
        }

        d.addHead("1");
        d.addTail("2");
        d.pullTail();
        d.addTail("3");
        d.addTail("4");
        d.addHead("5");
        d.pullTail();
        d.pullHead();

        while (d.peakTail() != null) {
            System.out.println(d.pullTail());
        }
    }
}
