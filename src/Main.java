public class Main {
    public static void main(String[] args) {
        ShapePrinter.printShapeName(new Circle(5));
        ShapePrinter.printShapeName(new Quad(4));
        ShapePrinter.printShapeName(new Triangle(3));
        ShapePrinter.printShapeName(new Ellipse(8, 5));
    }
}