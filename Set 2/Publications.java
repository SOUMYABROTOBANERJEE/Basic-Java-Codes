import java.io.*;
class Publications
 {
     String title; 
     int cost;
     protected BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     Publications()
     {
         title="";
         cost=0;
        }
     void accept()throws IOException
     {
         System.out.println("Enter name:");
         title=br.readLine();
        }
     void display()
     {
         System.out.println("Title:"+title);
         System.out.println("Cost:"+cost);
        }
     }