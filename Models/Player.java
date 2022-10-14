public class Player {
    private String Name;
    private byte color;

    public void setColor(byte color) {
        this.color = color;
    }

    public void setName(String name) {
        Name = name;
    }
    public byte getColor() {
        return color;
    }
    public String getName() {
        return Name;
    }
}