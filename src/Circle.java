public class Circle extends Shape{

    public double radio;

    public Circle() {

    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    Circle(double radio){
        setRadio(1.0);
    }

    Circle(double radio, String color, boolean filled){
        super();
        setRadio(1.0);
        setColor("red");
        setFilled(true);
    }

    @Override
    public String toString() {
        return "Circle[" + "Shape[" +
                ", color='" + color + '\'' +
                ", filled=" + filled + "]radio=" + radio +
                ']';
    }
}

