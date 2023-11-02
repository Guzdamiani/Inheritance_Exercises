/*
We propose to develop a program that allows us to calculate the area and perimeter of geometric shapes, in this case a circle and a rectangle. Since this calculation is going to be repeated in both geometric shapes,  
we are going to create an interface, called calculosFormas that will have the two methods for calculating the area, the perimeter and the value of PI as a constant.
Develop the exercise so that the shapes implement the methods of the interface and the area and perimeter of the two are calculated. In the main, the shapes will be created and the final result will be shown. 

Circle area: PI * radius ^ 2 / Circle perimeter: PI * diameter.
Rectangle area: base * height / Rectangle perimeter: (base + height) * 2.
 */
package herenciaej04;

import herenciaej04.entities.Circle;
import herenciaej04.entities.Rectangle;

/**
 *
 * @author guzma
 */
public class HerenciaEj04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(4, 6);

        System.out.println("Circle:");
        System.out.println("Radius: " + c1.getRadius());
        System.out.println("Area: " + c1.calculateArea());
        System.out.println("Perimeter: " + c1.calculatePerimeter());
        System.out.println("");
        System.out.println("Rectangle:");
        System.out.println("Height: " + r1.getHeight());
        System.out.println("Base: " + r1.getBase());
        System.out.println("Area: " + r1.calculateArea());
        System.out.println("Perimeter: " + r1.calculatePerimeter());
    }
}
