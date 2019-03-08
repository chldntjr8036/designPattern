package Visitor;



public abstract class Entry implements Element{
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry) throws FileTreatmentException {
        throw new FileTreatmentException();
    }
//    public Iterator iterator() throws FileTreatmentExcpetion {
//        throw new FileTreatmentExcpetion();
//    }
    public String toString() {
        return getName() + " ("+getSize()+")";
    }
}
