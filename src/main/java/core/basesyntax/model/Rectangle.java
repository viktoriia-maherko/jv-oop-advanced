package core.basesyntax.model;

public class Rectangle extends Figure {
    private final double height;
    private final double width;

    public Rectangle(double height, double width, String color) {
        super(color);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public void draw() {
        System.out.println("Figure: rectangle, area " + getArea() + " sq.units, height: " + height
                + " units, width: " + width + " units, color: " + getColor());
    }
}
