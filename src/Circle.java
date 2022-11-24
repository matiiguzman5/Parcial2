public class Circle extends Shape{
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
}
