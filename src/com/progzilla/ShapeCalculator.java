package com.progzilla;

import org.w3c.dom.css.Rect;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ShapeCalculator {

    // Parent Class
    static class Shape{
        private String name;
        protected String color;
        public String type;

        // Constructor
        public Shape(String name, String color){
            this.name = name;
            this.color = color;
            this.type = "Shape";
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            if (name != null && !name.trim().isEmpty()) {
                this.name = name;
            }else {
                System.out.println("Invalid name");
            }
        }

        public String getColor(){
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public double calculateArea(){
            return 0.0;
        }

        public void displayData(){
            System.out.printf("Shape: %s, Color: %s%n", name, color);
        }

        public void displayData(boolean displayDetails){
            if (displayDetails) {
                System.out.printf("Shape: %s, Color: %s, Type: %s%n", name, color, type);
            }else {
                displayData();
            }
        }

        public void displayData(String prefix){
            System.out.printf("%s - Shape: %s, Color: %s%n", prefix, name, color);
        }

    }

    // Derived class - Rectangle
    static class Rectangle extends Shape {

        private double width;
        private double height;

        public Rectangle(String name, String color, double width, double height){
            super(name, color);
            this.width = width;
            this.height = height;
            this.type = "Rectangle";
        }

        public double getWidth(){
            return width;
        }

        public void setWidth(double width){
            if (width > 0) {
                this.width = width;
            }else {
                System.out.println("Width value must be positive");
            }
        }

        public double getHeight(){
            return height;
        }

        public void setHeight(double height){
            if(height > 0){
                this.height = height;
            }else{
                System.out.println("Height value has to be positive");
            }
        }

        @Override
        public double calculateArea(){
            return width * height;
        }

        @Override
        public void displayData(){
            super.displayData();
            System.out.printf(" Dimensions: %s.2f x %.2f, Area: %.2f%n", width, height, calculateArea());
        }

        public double calculateArea(double scale){
            return calculateArea() * scale;
        }
    }

    // Derived class - Circle
    static class Circle extends Shape{
        private double radius;

        public Circle(String name, String color, double radius){
            super(name, color);
            this.radius = radius;
            this.type = "Circle";
        }

        public double getRadius(){
            return radius;
        }

        public void setRadius(double radius){
            if (radius > 0){
                this.radius = radius;
            }else{
                System.out.println("Radius value must be positive");
            }
        }

        @Override
        public double calculateArea(){
            return Math.PI * radius * radius;
        }

        @Override
        public void displayData(){
            super.displayData();
            System.out.printf(" Radius: %.2f, Afrea: %.2f%n", radius, calculateArea());
        }
    }

    // Utility Class
    static class Calculator{

        public int add(int a, int b){
            return a = b;
        }

        public double add(double a, double b){
            return a + b;
        }

        public int add(int a, int b, int c){
            return a + b + c;
        }

        //var agrs
        public int add(int... numbers){
            int sum = 0;
            for (int num : numbers){
                sum += num;
            }
            return sum;
        }

        public double calculateArea(double width, double height){
            return width * height;
        }

        public double calculateArea(double radius){
            return Math.PI * radius * radius;
        }
    }



    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("*** Shape Calculator ***\n");

        Rectangle rectObject = new Rectangle("Rectangle", "Green", 3.0, 8.9);
        Circle circObject = new Circle("Circle", "Red", 3.5);

        System.out.println("Rectangle Width: " + rectObject.getWidth());
        System.out.println("Circle Radius: " + circObject.getRadius());

        rectObject.setWidth(-5);
        rectObject.setWidth(20);

        System.out.println("Rectangle: ");
        rectObject.displayData();

        System.out.println("Circle: ");
        circObject.displayData();

        Shape shapeObject1 = new Rectangle("Rect", "Pink", 4.0, 2.8);
        Shape shapeObject2 = new Circle("Circlo", "Blue", 2.3);

        System.out.printf("Rectangle Area: %.2f%n", shapeObject1.calculateArea());
        System.out.printf("Circle Area: %.2f%n", shapeObject2.calculateArea());

        Calculator calc = new Calculator();

        System.out.println("add(5, 3) = " + calc.add(5,3));
        System.out.println("add(5.3, 3.2) = " + calc.add(5.3, 3.2));
        System.out.println("add(8, 5, 9) = " + calc.add(8, 5, 9));
        System.out.println("add(1,2,3,4,5,6) = " + calc.add(1,2,3,4,5,6)); //varargs

        System.out.println("calculateArea(5.3, 3.5) = " + calc.calculateArea(5.3, 3.5));
        System.out.println("calculateArea(4.5) =" + calc.calculateArea(4.5));

        Shape shape = new Shape("Shape", "Grey");
        shape.displayData();
        shape.displayData(true);
        shape.displayData("Prefix");

        Rectangle rectangle = new Rectangle("Test", "Green", 8.5, 3.2);
        System.out.println("Area (non-scaled): " + rectangle.calculateArea());
        System.out.println("Area (scaled): " + rectangle.calculateArea(2.0));
    }
}
