package TemplateMethod;

public abstract class AbstractDisplay {
    //추상 메서드들은 하위 클래스에 구현을 맡긴다.
    public abstract void open();
    public abstract void print();
    public abstract void close();
    //메서드 명세에 final이 붙었다 의미는? final이 붙은 메서드는 오버라이드 될 수 없다.
    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
