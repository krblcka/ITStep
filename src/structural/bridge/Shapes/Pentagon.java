package structural.bridge.Shapes;

import structural.bridge.Color;
import structural.bridge.Shape;

public class Pentagon extends Shape {

    public Pentagon(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("Pentagon filled with color: ");
        color.applyColor();
    }
}
