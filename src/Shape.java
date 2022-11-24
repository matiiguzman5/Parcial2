public abstract class Shape {
    public String color;
    public boolean filled;

    public Shape() {

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    Shape(String color, boolean filled){
        setColor("red");
        setFilled(true);
    }
    public abstract class getArea {
        private double area;

        public double getArea() {
            return area;
        }

        public void setArea(double area) {
            this.area = area;
        }
    }
    public abstract class getPerimeter{
        private double perimeter;

        public double getPerimeter() {
            return perimeter;
        }

        public void setPerimeter(double perimeter) {
            this.perimeter = perimeter;
        }
    }

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}
