package Strategy;

public class Hand {
    public static final int HANDVALUE_ROCK=0;
    public static final int HANDVALUE_SCISSORS=1;
    public static final int HANDVALUE_PAPER=2;
    public static final Hand[] hand = {
            new Hand(HANDVALUE_ROCK),
            new Hand(HANDVALUE_SCISSORS),
            new Hand(HANDVALUE_PAPER)
    };

    private static final String[] name = {"주먹", "가위", "보"};
    private int handvalue;
    private Hand(int handvalue){
        this.handvalue = handvalue;
    }
    public static Hand getHand(int handvalue){
        return hand[handvalue];
    }
    public boolean isStrongerThan(Hand h) { //this가 h를 이길 경우
        return fight(h) == 1;
    }
    public boolean isWeakerThan(Hand h) { //this가 h에게 질 경우
        return fight(h) == -1;
    }

    private int fight(Hand h) {
        if(this.handvalue == h.handvalue) return 0;
        else if((this.handvalue+1)%3 == h.handvalue) {
            return 1;
        }else return -1;
    }

    public String toString() {
        return name[handvalue];
    }
}
