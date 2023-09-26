package geometrical.entities;

public class Triangle extends Shape {
    private int edge;

    public Triangle(int edge) {
        this.edge = edge;
    }

    public double calculatePerimeter(){
        this.perimeter = this.edge*3;
        return this.perimeter;
    }
    public double calculateArea(){
        this.area = (Math.sqrt(3)/4)*(this.edge*this.edge);
        return this.area;
    }
}
