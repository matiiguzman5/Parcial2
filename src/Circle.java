public class Circle extends Shape{

    public double radio;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    Circle(double radio){
        super();
        setRadio(1.0);
    }
    Circle(double radio, String color, boolean filled){
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

