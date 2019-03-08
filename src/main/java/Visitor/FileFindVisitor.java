package Visitor;

import java.util.ArrayList;
import java.util.List;

/*
    지정된 확장자의 파일을 모으는 클래스.
 */
public class FileFindVisitor extends Visitor{
    String ext;
    List<Entry> fl = new ArrayList<Entry>();
    public FileFindVisitor(String ext) {
        this.ext = ext;
    }
    @Override
    public void visit(File file) {
        if(file.getName().endsWith(ext)){
            fl.add(file);
        }
    }

    @Override
    public void visit(Directory directory) {
        List<Entry> dl = directory.getDirList();
        for (int i = 0; i < dl.size(); i++) {
            Entry entry = dl.get(i);
            entry.accept(this);
        }
    }
}
