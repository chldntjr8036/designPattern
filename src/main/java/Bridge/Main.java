package Bridge;

public class Main {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello, CWS"));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello, World"));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, 초승달"));

        d1.display();
        d2.display();
        ((CountDisplay) d2).multiDisplay(3);
        d3.display();
        d3.multiDisplay(5);
    }
}
