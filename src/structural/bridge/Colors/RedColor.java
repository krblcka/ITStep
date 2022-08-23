package structural.bridge.Colors;

import structural.bridge.Color;

public class RedColor implements Color {

    public RedColor() {
    }

    @Override
    public void applyColor() {
        System.out.println("Red");
    }
}
