

public class Program {
    public static void main(String[] args) {
        Shape square = new Square(10);
        square.perimeter();
        square.area();
        System.out.println("===================");

        Shape rectangle = new Rectangle(20, 10);
        rectangle.perimeter();
        rectangle.area();
        System.out.println("===================");

        Shape circle = new Circle(10);
        circle.perimeter();
        circle.area();
        System.out.println("===================");
    }
}
