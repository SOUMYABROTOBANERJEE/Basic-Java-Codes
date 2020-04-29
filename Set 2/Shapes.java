import java.io.*;
class Shapes
 {
     public static void main()throws IOException
     {
         System.out.println("Enter 1 for triangle.");
         System.out.println("Enter 2 for rectangle.");
         System.out.println("Enter 3 for square.");
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         int ch=Integer.parseInt(br.readLine());
         if(ch==1)
         {
             Triangle o=new Triangle();
             o.calcArea();
             o.display();
            }
            if(ch==2)
         {
             Rectangle ob=new Rectangle();
             ob.calcArea();
             ob.display();
            }
            if(ch==3)
         {
             Square obj=new Square();
             obj.calcArea();
             obj.display();
            }
        }
 }