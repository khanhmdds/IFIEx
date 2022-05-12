public class Square implements Shape{
    private double edge;
    public Square(double edge) {
        this.edge = edge;
    }

    @Override
    public void perimeter() {
        System.out.println("The perimeter of the square is: "+(this.edge)*4);
    }

    @Override
    public void area() {
        System.out.println("The area of the square is: "+this.edge*this.edge);
    }
}
