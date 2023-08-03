public class Triangle extends Shape {
    private int sides;

    public Triangle(int sides) {
        this.sides = sides;
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}