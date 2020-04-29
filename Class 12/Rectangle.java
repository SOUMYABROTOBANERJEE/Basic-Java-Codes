import java.io.*;
class Rectangle extends Dimensions
 {
     Rectangle()throws IOException
     {
         super(2);
         System.out.println("This is a rectangle");
         readSides();
        }
     void calcArea()
     {
         area=sides[0]*sides[1];
        }
     void display()
     {
         System.out.println("Area of rectangle is:"+area);
        }
}