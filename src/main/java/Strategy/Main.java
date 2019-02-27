package Strategy;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Player p1 = new Player("우석", new WinningStrategy(1));
        Player p2 = new Player("초승달", new ProbStrategy(2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();
            if(nextHand1.isStrongerThan(nextHand2)) {
                System.out.println("winner : "+p1);
                p1.win(); p2.lose();
            }else if(nextHand2.isStrongerThan(nextHand1)){
                System.out.println("winner : "+p2);
                p2.win(); p1.lose();
            }else {
                System.out.println("even.");
                p1.even(); p2.even();
            }
        }

        System.out.println("total result : ");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }
}
