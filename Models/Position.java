public class Position {
    private char column;
    private byte row;

    public void setColumn(char column) {
        this.column = column;
    }

    public void setRow(byte row) {
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public byte getRow() {
        return row;
    }
    public String toString(){
        return column + row;
    }
}