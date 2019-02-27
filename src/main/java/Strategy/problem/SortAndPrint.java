package Strategy.problem;

import java.util.Arrays;

public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    public SortAndPrint(Comparable[] data, Sorter sorter) {
        this.data = data;
        this.sorter = sorter;
    }

    public void execute() {
        print();
        sorter.sort(data);
        print();
    }
    public void print(){
        System.out.println(Arrays.toString(data));
    }

}
