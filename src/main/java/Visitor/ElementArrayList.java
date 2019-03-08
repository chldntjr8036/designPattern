package Visitor;

import java.util.ArrayList;

public class ElementArrayList extends ArrayList implements Element{
    ArrayList<Entry> l = new ArrayList<>();
    @Override
    public void accept(Visitor v) {
        for (int i = 0; i < l.size(); i++) {
            Entry entry = l.get(i);
            entry.accept(v);
        }
    }
    public void add(Entry entry){
        l.add(entry);
    }
}
