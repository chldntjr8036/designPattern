package observer;

public class IncrementalNumberGenerator extends NumberGenerator{
    private int start, end, increment;
    private int number;
    public IncrementalNumberGenerator(int start, int end, int increment) {
        this.start = start;
        this.end = end;
        this.increment = increment;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i+= increment) {
            number = i;
            notifyObserver();
        }
    }
}
