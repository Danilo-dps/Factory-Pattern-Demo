package application;

import com.example.interfaces.Shape;
import com.example.shapes.ShapeFactory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // Obtém um objeto Circle e chama seu método draw
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Obtém um objeto Square e chama seu método draw
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
