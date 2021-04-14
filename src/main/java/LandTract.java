/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alex
 */
public class LandTract {
    private double length;
    private double width;
    
    public LandTract(double len, double wid) {
        this.length = len; 
        this.width = wid;
       }
    
    public LandTract(LandTract rect) {
        this.length = rect.getLength();
        this.width = rect.getWidth();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    public double getArea() {
        return this.length * this.width;
    }
    
    public boolean equals(LandTract obj) {
         if (this.length == obj.getLength() && this.width == obj.getWidth()) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public String toString() {
       return "Length: " + this.length + "Width: " + this.width; 
    }
}