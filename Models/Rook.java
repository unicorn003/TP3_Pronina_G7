public class Rook {
    private Position RookPosition = new Position();
    private byte LocalColor;

    public Rook(byte color, char column){
        LocalColor = color;
        RookPosition.setColumn(column);
        if (color == 0)
            RookPosition.setRow(1);
        else
            RookPosition.setRow(8);
    }
}