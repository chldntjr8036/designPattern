package Singleton.triple;
/*
인스턴스 3개로 한정됨.
인스턴스에 0,1,2 라는 번호가 붙어있다.
getInstance(int id)에서 id번의 인스턴스가 얻어진다고 가정.
 */
public class Triple {
    private static final Triple[] triples = new Triple[3];
    private Triple() {
        System.out.println("생성자 호출.");
    }

    public static Triple getInstance(int id){
        if(triples[id] == null){
            triples[id] = new Triple();
            return triples[id];
        }else return triples[id];
    }
}
