package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {
    private String name;
    private ArrayList<Entry> dir = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public Entry add(Entry entry) throws FileTreatmentException {
        dir.add(entry);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    public List<Entry> getDirList(){
        return dir;
    }
    @Override
    public int getSize() {
        SizeVisitor sv = new SizeVisitor();
        accept(sv);

        return sv.getSize();
    }

    @Override
    public void accept(Visitor v) {
        v.visit(this);
    }
}
