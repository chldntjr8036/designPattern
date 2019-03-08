package Visitor;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("start");
//        Directory rootdir = new Directory("root");
//        Directory bindir = new Directory("bin");
//        Directory tmpdir = new Directory("tmp");
//        Directory usrdir = new Directory("usr");
//        Directory usrdir_choi = new Directory("choi");
//        Directory usrdir_cho = new Directory("cho");
//        rootdir.add(bindir);
//        rootdir.add(tmpdir);
//        rootdir.add(usrdir);
//        usrdir.add(usrdir_choi);
//        usrdir.add(usrdir_cho);
//        rootdir.accept(new ListVisitor());

//        Directory d1 = new Directory("d1");
//        Directory d2 = new Directory("d2");
//        Directory d3 = new Directory("d3");
//        d1.add(d2);
//        d2.add(d3);
//        d1.add(new File("d1_file.txt",1));
//        d2.add(new File("d2_file.txt",1));
//        d3.add(new File("d3_file.txt",1));

//        System.out.println(d1.getSize()); //수정 후 getSize 테스트

//        // FileFindVisitor test
//        FileFindVisitor fv = new FileFindVisitor("txt");
//        d1.accept(fv);
//        System.out.println(fv.fl);


        //ElementArrayList Test
        Directory rootdir = new Directory("root");
        Directory bindir = new Directory("bin");
        Directory tmpdir = new Directory("tmp");
        Directory usrdir = new Directory("usr");
        Directory usrdir_choi = new Directory("choi");
        Directory usrdir_cho = new Directory("cho");
        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);
        usrdir.add(usrdir_choi);
        usrdir.add(usrdir_cho);

        Directory root2 = new Directory("root2");
        root2.add(new File("hello",22));

        Directory root3 = new Directory("root3");
        root3.add(new File("hello,world!",22));

        ElementArrayList l = new ElementArrayList();
        l.add(rootdir);
        l.add(root2);
        l.add(root3);

        l.accept(new ListVisitor());
    }
}
