public class Circle extends Shape{
    private Object Shape;

    Circle(String color, boolean filled) {
        super(color, filled);
    }
    private double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    Circle(double radio){
        super();
        setRadio(radio);
    }
    Circle(double radio, String color, boolean filled){
        setRadio(radio);
        setColor(color);
        setFilled(filled);
    }

    @Override
    public String toString() {
        return "Circle[" + "Shape[" + Shape +
                "radio=" + radio +
                ']';
    }
}

