package shapes;

import util.Input;

public class CircleApp {
    public static void main(String[] args) {
        Input input = new Input();

        double userRadius = input.getDouble("enter prompt here");

        Circle circle = new Circle(userRadius);

        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircum());
    }

}
