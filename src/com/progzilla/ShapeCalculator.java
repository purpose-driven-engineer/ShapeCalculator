package com.progzilla;

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

    // Derived class
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
}
