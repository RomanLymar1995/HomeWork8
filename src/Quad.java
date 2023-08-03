public class Quad extends Shape {
    private int sides;

    public Quad(int sides) {
        this.sides = sides;
    }

    @Override
    public String getName() {
        return "Quad";
    }
}