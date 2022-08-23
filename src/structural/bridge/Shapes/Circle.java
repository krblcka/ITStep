package structural.bridge.Shapes;

import structural.bridge.Color;
import structural.bridge.Shape;

public class Circle extends Shape {

    public Circle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Circle filled with color: ");
        color.applyColor();
    }
}
