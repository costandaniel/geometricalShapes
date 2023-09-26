package geometrical.entities;

public class Rectangle extends Shape {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public double calculatePerimeter(){
        this.perimeter = 2*this.length + 2*this.width;
        return this.perimeter;
    }
    public double calculateArea(){
        this.area = this.length*this.width;
        return this.area;
    }

}
