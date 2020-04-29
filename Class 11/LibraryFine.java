/*
 * Accept number of days late,compute fine according to the slab and display fine.
 */
import java.io.*;
class LibraryFine
 {
     int days;double fineamt;
     LibraryFine()
     {
         days=0;
         fineamt=0.0;
        }
         LibraryFine(int d,double f)
     {
         days=d;
         fineamt=f;
        }
     void accept() throws IOException
     {
         System.out.println("Enter no. of days.");
         days=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        }
     void display()
     {
         System.out.println(fineamt);
        }
     void calculate()
     {
         if(days<7)
         fineamt=0.0;
         else if(days<=15)
         fineamt=2.5*(days-7);
         else if(days<=25)
         fineamt=17.5+5.5*(days-15);
         else if(days>25)
         fineamt=72.5+12.5*(days-25);
        }
     public static void main()throws IOException
     {
         LibraryFine obj=new LibraryFine();
         obj.accept();
         obj.calculate();
         obj.display();
        }
    }
    /*
     * Enter no. of days.
       15
       20.0

     */
     
         
         
 