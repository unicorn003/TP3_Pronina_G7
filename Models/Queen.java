public class Queen {
    private Position QueenPosition = new Position();
    private byte  LocalColor;

    public Queen(byte color){
        LocalColor = color;
        QueenPosition.setColumn("d");
        if (color == 0)
            QueenPosition.setRow(1);
        else
            QueenPosition.setRow(8);
    }
}