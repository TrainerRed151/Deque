public class StackTester {
    public static void main (String[] args) {
        Stack<String> s = new Stack<String>();

        s.push("A");
        s.push("B");
        s.push("C");
        s.push("D");
        s.push("E");

        System.out.println(s.peak());

        while (s.peak() != null) {
            System.out.println(s.pop());
        }

        s.push("1");
        s.push("2");
        s.pop();
        s.push("3");
        s.push("4");
        s.push("5");
        s.pop();
        s.pop();

        while (s.peak() != null) {
            System.out.println(s.pop());
        }
    }
}
