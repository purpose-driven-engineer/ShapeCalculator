package com.progzilla;

interface ShapeInterface {
    double area();
    double perimeter();
}

class Circle implements ShapeInterface {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements ShapeInterface{

    private final double width;
    private final double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width * height);
    }
}

public class CalculatorInterface {
    public static void main(String[] args){
        ShapeInterface circle = new Circle(5.0);
        ShapeInterface rectangle = new Rectangle(3.2, 5.0);

        System.out.println("Circle (r-5): area=" + circle.area() + ", perimeter=" + circle.perimeter());
        System.out.println("Rectangle (4x6): area=" + rectangle.area() + ", perimeter="+ rectangle.perimeter());

        ShapeInterface[] shapeInterfaces = {
                new Circle(3),
                new Rectangle(2,4),
                new Circle(9)
        };
        double totalArea = 0;
        for (ShapeInterface s : shapeInterfaces){
            totalArea += s.area();
        }
        System.out.println("\nTotal of all shapes: "+ totalArea);
    }
}
