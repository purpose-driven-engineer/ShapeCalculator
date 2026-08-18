package com.progzilla;

public class ShapeCalculator {

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
}
