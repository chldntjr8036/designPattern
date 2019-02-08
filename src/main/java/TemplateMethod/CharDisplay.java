package TemplateMethod;
/*
명세
open : 문자열 "<<"을 표시한다.
print : 생성자에서 주어진 문자를 표시한다.
close : 문자열 ">>"을 표시한다.
 */
public class CharDisplay extends AbstractDisplay{

    private char ch;
    public CharDisplay(char ch){
        this.ch = ch;
    }
    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}
