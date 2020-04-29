import java.io.*;
class Triangle extends Dimensions
 {
     Triangle()throws IOException
     {
         super(3);
         System.out.println("This is a triangle");
         readSides();
        }
     void calcArea()
     {
         double s=(sides[0]+sides[1]+sides[2])/2;
         area=Math.sqrt(s*(s-sides[0])*(s-sides[1])*(s-sides[2]));
        }
     void display()
     {
         System.out.println("Area of triangle is:"+area);
        }
}