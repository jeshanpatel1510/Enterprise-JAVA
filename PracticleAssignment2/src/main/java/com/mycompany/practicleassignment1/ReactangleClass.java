/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;

/**
 *
 * @author jeshanpatel1510
 */
public class ReactangleClass implements Shape{
    private  int length, width;
    private String color;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    @Override
    public double getArea(int a, int b) {
        double area;
        
        area = length * width;
        
        return area;
    }
    
    @Override
    public String toString(double area)
    {
        return "Color of Rectangle is "+this.color+" and Area is "+area;
    }
}
