package Visitor;

import java.util.List;

public class ListVisitor extends Visitor{
    private String currentdir = "";

    @Override
    public void visit(File file) {
        System.out.println(currentdir+"/"+file);
    }

    @Override
    public void visit(Directory directory) {
        System.out.println(currentdir+"/"+directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        List<Entry> dl = directory.getDirList();
        for (int i = 0; i < dl.size(); i++) {
            Entry entry = dl.get(i);
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
