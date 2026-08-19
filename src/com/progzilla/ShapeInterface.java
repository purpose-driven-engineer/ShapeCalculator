package com.progzilla;

import org.w3c.dom.css.Rect;

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
