package DesignPatterns.Factory;

// the objective is to create new objects easily based on a given condition

public class ShapeFactory {

    public Shape getShape(String shape) {

        return switch (shape.toLowerCase()) {
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> null;
        };

    }

}
