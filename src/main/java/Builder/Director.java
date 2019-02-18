package Builder;

public class Director {
    private Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public void construct(){
        builder.makeTitle("Geeting");
        builder.makeString("아침과 낮");
        builder.makeItems(new String[]{
                "좋은 아침!",
                "안녕하세요",
        });
        builder.makeString("밤");
        builder.makeItems(new String[] {
                "안녕하세요",
                "안녕히 주무세요.",
                "안녕히 계세요.",

        });
        builder.close();
    }
}
