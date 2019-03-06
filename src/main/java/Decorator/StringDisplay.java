package Decorator;

//1행의 문자열을 표시하는 클래스
public class StringDisplay extends Display{
    private String string;
    public StringDisplay(String string) {
        this.string = string;
    }

    @Override
    public int getColumns() {
        return string.length();
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return string;
    }
}
