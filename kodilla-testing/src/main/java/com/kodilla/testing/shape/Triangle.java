package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String shapeName = "Triangle";
    private double field;
    //private double a;
    //private double h;

    public Triangle(double a, double h) {
        //this.a = a;
        //this.h = h;
        this.field = a*h/2;
    }
    @Override
    public int hashCode() {
        return (int)this.field * this.getShapeName().length();
    }

    public boolean equals(Shape givenShape){
        if((givenShape.getShapeName() == this.shapeName) && (givenShape.getField() == this.getField())) {
            return true;
        } else {
            return false;
        }
    }
    public String getShapeName() {
        return this.shapeName;
    }
    public double getField() {
        return field;
    }
}