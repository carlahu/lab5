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
public class Main {
    public static void main(String[] args){
        Point p1 = new Point();
        Point p2 = new Point (5,2);
        p1.printLocation();
        p2.printLocation();
        
        int[] scores = {80, 92, 91, 68, 88};

for (int i = 0; i < scores.length; i += 2)
{
       System.out.println(scores[i] = scores[i]  *  2);
       System.out.println(scores.length);
} 
        
        printX(5);
        
        Circle c1 = new Circle();
        Circle c2 = new Circle(10,11,15.6);
        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
    }
    
    public static void printX(int x){
        System.out.println("The input value is: " + x);
    }
    
}
