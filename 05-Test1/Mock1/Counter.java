public class Counter {
    int counter = 0;

    void increase() {
        counter += 1;
    }

    void decrease() {
        counter -= 1;
    }

    void increase(int n) {
        counter += n;
    }

    void decrease(int n) {
        counter -= n;
    }

    public int value() {
        return counter;
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        System.out.println(c.value());
        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());
    }

}
