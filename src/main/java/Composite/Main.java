package Composite;


public class Main {
    public static void main(String[] args) {
        System.out.println("start");
        Directory root_dir = new Directory("root");
        Directory bin_dir = new Directory("bin");
        Directory tmp_dir = new Directory("tmp");
        Directory usr_dir = new Directory("usr");
        root_dir.add(bin_dir);
        root_dir.add(tmp_dir);
        root_dir.add(usr_dir);
        File vi = new File("vi",10000);
        File latex = new File("latex",20000);
        bin_dir.add(vi);
        bin_dir.add(latex);
        root_dir.printList();
        System.out.println("----------------");
        vi.printFulllPath();
        latex.printFulllPath();
        bin_dir.printFulllPath();
    }
}
