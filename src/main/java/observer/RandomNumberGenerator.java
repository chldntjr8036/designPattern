package observer;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {
    private Random rd = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = 0; i < 20; i++) {
            number = rd.nextInt(50);
            notifyObserver();
        }
    }
}
