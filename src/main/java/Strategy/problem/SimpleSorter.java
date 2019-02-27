package Strategy.problem;

import java.util.Arrays;

public class SimpleSorter implements Sorter {
    @Override
    public void sort(Comparable[] data) {
        Arrays.sort(data);
    }
}
