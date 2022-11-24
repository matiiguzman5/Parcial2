public class Rectangle extends Shape{
    public double  width;
    public double length;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    Rectangle(double width, double length){
        super();
        setLength(1.0);
        setWidth(1.0);
    }
    Rectangle(double width, double length, String color, boolean filled){
        setWidth(1.0);
        setLength(1.0);
        setColor("red");
        setFilled(true);
    }

    @Override
    public String toString() {
        return "Rectangle[" + "Shape[" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
    "Circle[" + "Shape[" +
            ", color='" + color + '\'' +
            ", filled=" + filled + "]radio=" + radio +
            ']';
}
