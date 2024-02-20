/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicleassignment1;

import java.awt.Rectangle;
import java.util.Scanner;

/**
 *
 * @author jeshanpatel1510
 */
public class ShapesImplement {
    public void Shapes()
    {
        int ch;
        
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n--- Shape Categories ---");
            System.out.println("1.Rectangle");
            System.out.println("2.Triangle");
            System.out.println("0.Exit.");
            System.out.println("Choose A Shape : ");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    ReactangleClass rectangle = new ReactangleClass();
                    System.out.print("\nEnter Rectangle Color : ");
                    rectangle.setColor(in.next());
                    
                    System.out.print("\nEnter Rectangle Length : ");
                    rectangle.setLength(in.nextInt());
                    
                    System.out.print("\nEnter Rectangle Width : ");
                    rectangle.setWidth(in.nextInt());
                    
                    double area = rectangle.getArea(rectangle.getLength(), rectangle.getWidth());
                    System.out.println("\n"+rectangle.toString(area));
                    System.out.println();
                    break;

                case 2:
                    TriangleClass triangle = new TriangleClass();
                    System.out.print("\nEnter Triangle Color : ");
                    triangle.setColor(in.next());
                    
                    System.out.print("\nEnter Triangle Base : ");
                    triangle.setBase(in.nextInt());
                    
                    System.out.print("\nEnter Triangle Height : ");
                    triangle.setHight(in.nextInt());
                    
                    double tarea = triangle.getArea(triangle.getBase(), triangle.getHight());
                    System.out.println("\n"+triangle.toString(tarea));
                    System.out.println();
                    break;
                                           
                default:
                    System.out.println("\nChoose Correct Shape!!");
            }
        } while (ch != 0);
    }
}
