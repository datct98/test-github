package entities;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void printInfo() {
        System.out.println("Diện tích hv là: "+caculateArea());
        System.out.println("Chu vi hv là: "+perimeter());
    }

    @Override
    public double caculateArea() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }
}
