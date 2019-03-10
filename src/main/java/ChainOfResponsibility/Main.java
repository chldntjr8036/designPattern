package ChainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Support choi = new NoSupport("choi");
        Support cho = new LimitSupport("cho",10);
        Support kim = new SpecialSupport("kim",49);
        Support shin = new LimitSupport("shin",20);
        Support park = new OddSupport("park");

        choi.setNext(cho).setNext(kim).setNext(shin).setNext(park);

        //다양한 트러블 발생
        for (int i = 0; i < 50; i++) {
            choi.support(new Trouble(i));
        }
    }
}
