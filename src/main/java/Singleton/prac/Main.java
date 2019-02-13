package Singleton.prac;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        TicketMaker t1 = TicketMaker.getInstance();
        TicketMaker t2 = TicketMaker.getInstance();

        if(t1 == t2) {
            System.out.println("같은 인스턴스");
        }else {
            System.out.println("다름");
        }

        System.out.println(t1.getNextTicketNumber());
        System.out.println(t1.getNextTicketNumber());
        System.out.println(t2.getNextTicketNumber());
        System.out.println(t1.getNextTicketNumber());
    }
}
