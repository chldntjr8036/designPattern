package Strategy;

import java.util.Random;

public class RandomStrategy implements Strategy{
    Random rd = new Random();
    @Override
    public Hand nextHand() {
        return Hand.getHand(rd.nextInt(3));
    }

    @Override
    public void study(boolean win) {
        //비어도 상관없음.
    }
}
