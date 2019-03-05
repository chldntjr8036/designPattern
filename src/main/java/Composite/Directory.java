package Composite;

import java.util.ArrayList;

public class Directory extends Entry{
    private String name;
    private ArrayList<Entry> directory = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {

        int size = 0;

        for (int i = 0; i < directory.size(); i++) {
            Entry entry = directory.get(i);
            size += entry.getSize();  // <- keyPoint
        }

        return size;
    }

    public Entry add(Entry entry) {
        entry.parent = this;
        directory.add(entry);
        return this;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/"+this);
        for (Entry entry : directory){
            entry.printList(prefix+"/"+name); // keyPoint 재귀적 구
        }
    }
}
