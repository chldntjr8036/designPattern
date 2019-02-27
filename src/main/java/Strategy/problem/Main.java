package Strategy.problem;

public class Main {
    public static void main(String[] args) {
        String[] data = {"b", "d","a","c"};
        SortAndPrint sp = new SortAndPrint(data, new SimpleSorter());
        sp.execute();
    }
}
