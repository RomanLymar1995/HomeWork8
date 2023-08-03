public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Quad quad = new Quad(4);
        Triangle triangle = new Triangle(3);
        Ellipse ellipse = new Ellipse(8, 5);

        ShapePrinter printer = new ShapePrinter();
        printer.printShapeName(circle);
        printer.printShapeName(quad);
        printer.printShapeName(triangle);
        printer.printShapeName(ellipse);
    }
}

