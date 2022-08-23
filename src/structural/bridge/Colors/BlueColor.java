package structural.bridge.Colors;

import structural.bridge.Color;

public class BlueColor implements Color {

    public BlueColor() {
    }

    @Override
    public void applyColor() {
        System.out.println("Blue");
    }
}
