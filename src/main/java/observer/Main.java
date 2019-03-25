package observer;

public class Main {
    public static void main(String[] args) {
//        NumberGenerator gen = new RandomNumberGenerator();
        NumberGenerator gen = new IncrementalNumberGenerator(10,50,5);
        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();
        Observer o3 = new SumObserver();
        gen.addObserver(o1);
        gen.addObserver(o2);
        gen.addObserver(o3);
        gen.execute();
    }
}
