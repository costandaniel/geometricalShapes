package geometrical.entities;

public class Square extends Shape {
    private int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    public double calculatePerimeter(){
        this.perimeter = this.edge*4;
        return this.perimeter;
    }
    public double calculateArea(){
        this.area = this.edge*this.edge;
        return this.area;
    }
}
