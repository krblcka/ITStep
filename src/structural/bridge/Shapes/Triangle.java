package structural.bridge.Shapes;

import structural.bridge.Color;
import structural.bridge.Shape;

public class Triangle extends Shape {

    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Triangle filled with color: ");
        color.applyColor();
    }
}
