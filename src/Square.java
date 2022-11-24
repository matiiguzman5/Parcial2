public class Square extends Rectangle {

    Square(double side) {
        super(side, side);
    }

    Square(double width, double lenght, String color, boolean filled) {
        super(width, lenght, color, filled);
    }
    public Square() {
    }
    public double side;

    public double getSide() {
        return length;
    }

    public void setSide(double side) {
        setSide(side);
        setLength(length);
        setWidth(width);
        this.side = side;
    }

    Square(double side, String color, boolean filled){
        setSide(1.0);
        setColor("red");
        setFilled(true);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    public String toString() {
        return "Square[" + "[Rectangle"+ "[Shape"+
                ", color='" + color + '\'' +
                ", filled=" + filled +
                "width=" + width +
                ", length=" + length +
                "]]";
    }
}
