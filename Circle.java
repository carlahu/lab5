/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sprint5;

/**
 *
 * @author pancd
 */
public class Circle {
    private int x;
    private int y;
    private double radius;
    
    public Circle(){
        x = 0;
        y = 0;
        radius = 0;
    }
    public Circle(int newX, int newY, double newR){
        x = newX;
        y = newY;
        radius = newR;
    }
    public double getArea(){
        return (radius * radius * 3.14);
    }
    public boolean isInCircle(int a, int b){
        return a <= x && b <= y;
    }
    public void translate(int dx, int dy){
        x += dx;
        y += dy;
    }
    public void tripleTheRadius(){
        radius = radius * radius * radius;
    }
}
