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
        return Mat.PI * radius * radius;
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

}
