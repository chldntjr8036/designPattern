package Composite;

public abstract class Entry {
    protected Entry parent;
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentExcpetion {

        throw new FileTreatmentExcpetion();
    }
    public void printList() {
        printList("");
    }
    protected abstract void printList(String prefix);

    public String toString() {
        return getName() + " ("+getSize()+")";
    }
    private String getFullPath(Entry e){
        if(e.parent == null) return "/"+e.getName();

        String path = "/"+e.getName();
        path = getFullPath(e.parent) + path;
        return path;
    }
    public void printFulllPath(){
        System.out.println("Full Path : " + getFullPath(this));
    }
}
