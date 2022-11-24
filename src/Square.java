public class Square extends Rectangle {

    Square(double width, double length) {
        super(width, length);
    }

    Square(double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
    }
    public Square() {
    }
    public double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
    Square(double side){
        setSide(1.0);
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
