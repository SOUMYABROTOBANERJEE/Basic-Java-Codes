import java.io.*;
class Dimensions
 {
     int no_of_sides;
     double area;
     double[] sides;
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Dimensions(int a)
     {
         no_of_sides=a;
         sides=new double[a];
        }
     void readSides() throws IOException
     {
         System.out.println("Enter sides.");
         for(int i=0;i<no_of_sides;i++)
         sides[i]=Math.abs(Integer.parseInt(br.readLine()));
        }
     void calcArea()
     {
         area=0.0;
        }
}