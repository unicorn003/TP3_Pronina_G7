public class Pawn {
    private Position PawnPosition = new Position();
    private byte LocalColor;

    public Pawn(byte color, char column) {
        LocalColor = color;
        PawnPosition.setColumn(column);
        if (color == 0)
            PawnPosition.setRow(2);
        else
            PawnPosition.setRow(7);
    }
}