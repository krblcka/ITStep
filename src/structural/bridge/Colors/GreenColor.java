package structural.bridge.Colors;

import structural.bridge.Color;

public class GreenColor implements Color {

    public GreenColor() {
    }

    @Override
    public void applyColor() {
        System.out.println("Green");
    }
}
