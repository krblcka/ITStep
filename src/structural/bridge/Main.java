package structural.bridge;

import structural.bridge.Colors.BlueColor;
import structural.bridge.Colors.GreenColor;
import structural.bridge.Colors.RedColor;
import structural.bridge.Shapes.Circle;
import structural.bridge.Shapes.Pentagon;
import structural.bridge.Shapes.Triangle;

public class Main {
    public static void main(String[] args) {

        Shape triangle = new Triangle(new RedColor());
        triangle.applyColor();

        Shape circle = new Circle(new BlueColor());
        circle.applyColor();

        Shape pentagon = new Pentagon(new GreenColor());
        pentagon.applyColor();

    }
}
