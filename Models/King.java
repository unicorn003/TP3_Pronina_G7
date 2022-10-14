public class King {
    private Position KingPosition = new Position();
    private byte  LocalColor;

    public King(byte color){
        LocalColor = color;
        KingPosition.setColumn("e");
        if (color == 0)
            KingPosition.setRow(1);
        else
            KingPosition.setRow(8);
    }
}