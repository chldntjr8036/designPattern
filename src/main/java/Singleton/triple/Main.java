package Singleton.triple;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        Triple t0 = Triple.getInstance(0);
        Triple t0_dummy = Triple.getInstance(0);
        Triple t1 = Triple.getInstance(1);
        Triple t1_dummy = Triple.getInstance(1);
        Triple t2 = Triple.getInstance(2);
        Triple t2_dummy = Triple.getInstance(2);

        //테스트 성공. 인스턴스 1개만 생성하는가?
        if(t0 == t0_dummy) System.out.println("같음");
        if(t1 == t1_dummy) System.out.println("같음");
        if(t2 == t2_dummy) System.out.println("같음");


        //테스트 성공. 생성한 3개의 인스턴스는 각각 다른가?
        if(t0 == t1 | t0 == t2) System.out.println("같음");
        if(t1 == t0 | t1 == t2) System.out.println("같음");
        if(t2 == t0 | t2 == t1) System.out.println("같음");


    }
}
