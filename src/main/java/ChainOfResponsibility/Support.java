package ChainOfResponsibility;

public abstract class Support {
    private String name;
    private Support next;
    public Support(String name) {
        this.name = name;
    }
    public Support setNext(Support next) {
        this.next = next;
        return this;
    }
    //핵심 메서드
    public final void support(Trouble trouble) {
        if(resolve(trouble)) {
            done(trouble);
        }else if(next != null){
            next.support(trouble);
        }else {
            fail(trouble);
        }
    }
    public String toString() {
        return "["+name+"]";
    }
    protected abstract boolean resolve(Trouble trouble); //해결용 메서드


    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by "+this+".");
    }
    protected void fail(Trouble trouble) { //미해결
        System.out.println(trouble + " cannot be resolved.");
    }
}
