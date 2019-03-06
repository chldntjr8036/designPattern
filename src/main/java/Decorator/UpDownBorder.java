package Decorator;

public class UpDownBorder extends Border {
    protected UpDownBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return display.getColumns();
    }

    @Override
    public int getRows() {
        return display.getRows()+2;
    }

    @Override
    public String getRowText(int row) {
        if(row == 0 || row == display.getRows()+1) {
            System.out.println(row);
            return makeLine('-',display.getColumns());
        }else {
            System.out.println(row);
            return display.getRowText(row);
        }
    }

    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }

}
