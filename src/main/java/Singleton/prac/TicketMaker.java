package Singleton.prac;
/*
TicketMaker 클래스에 싱글턴 패턴을 적용해
getNextTicketNumber메소드를 출력할 때마다 반환되는 값이 오름차순으로 순선대로 반환되게 하
 */
public class TicketMaker {
    private int ticket = 1000;
    private static final TicketMaker ticketMaker = new TicketMaker();
    private TicketMaker(){
        System.out.println("TicketMaker 인스턴스 생성");
    }

    public static TicketMaker getInstance(){
        return ticketMaker;
    }

    public int getNextTicketNumber(){
        return ticket++;
    }
}
