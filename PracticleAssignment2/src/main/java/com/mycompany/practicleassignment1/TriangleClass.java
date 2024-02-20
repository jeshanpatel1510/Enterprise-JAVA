/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;

/**
 *
 * @author jeshanpatel1510
 */
public class TriangleClass implements Shape{
    private  int base, hight;
    private String color;

    public int getBase() {
        return base;
    }

    public void setBase(int length) {
        this.base = length;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int width) {
        this.hight = width;
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
        
        area = base * hight / 2;
        
        return area;
    }
    
    @Override
    public String toString(double area)
    {
        return "Color of Triangle is "+this.color+" and Area is "+area;
    }    
}
