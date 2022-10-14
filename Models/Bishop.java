public class Bishop {
    private Position BishopPosition = new Position();
    private byte LocalColor;

    public Bishop(byte color, char column){
        LocalColor = color;
        BishopPosition.setColumn(column);
        if (color == 0)
            BishopPosition.setRow(1);
        else
            BishopPosition.setRow(8);
    }
}