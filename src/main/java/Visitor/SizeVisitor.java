package Visitor;

import java.util.List;

/*
예제 프로그램의 Directory클래스의 getSize()를 SizeVisitor를 도입해서 다시 기술하기.

 */
public class SizeVisitor extends Visitor {
    private int size;
    @Override
    public void visit(File file) {
        size += file.getSize();
    }

    @Override
    public void visit(Directory directory) {
        List<Entry> dl = directory.getDirList();
        for (int i = 0; i < dl.size(); i++) {
            Entry entry = dl.get(i);
            entry.accept(this);
        }
    }
    public int getSize(){
        return size;
    }
}
