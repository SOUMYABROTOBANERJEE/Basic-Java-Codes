import java.io.*;
class Square extends Dimensions
 {
     Square()throws IOException
     {
         super(1);
         System.out.println("This is a square");
         readSides();
        }
     void calcArea()
     {
         area=Math.pow(sides[0],2);
        }
     void display()
     {
         System.out.println("Area of square is:"+area);
        }
}