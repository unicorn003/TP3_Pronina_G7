public class Knight {
    private Position KnightPosition = new Position();
    private byte LocalColor;

    public Knight(byte color, char column){
        LocalColor = color;
        KnightPosition.setColumn(column);
        if (color == 0)
            KnightPosition.setRow(1);
        else
            KnightPosition.setRow(8);
    }
}