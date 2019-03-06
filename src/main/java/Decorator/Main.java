package Decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello world.");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        Display b4 = new UpDownBorder(b1);
        b1.show();
        b2.show();
        b3.show();
        b4.show();

    }
}
