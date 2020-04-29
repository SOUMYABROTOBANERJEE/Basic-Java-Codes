/**
 * class Brun
 * dm:int m, int n
 * Brun(int,int)
 * int isPrime(int)
 * void display()-display all Brun's constatnt from m to n
 * void main()-create object and call fn
 */
import java.util.*;
class Brun
 {
     int m;
     int n;
     Brun(int m, int n)
     {
         this.m=m;
         this.n=n;
        }
     int isPrime(int a)
     {
         int flag=1;
         for(int i=2;i<=a/2;i++)
         {
             if(a%i==0)
             {
                 flag=0;
                 break;
                }
            }
             return flag;
        }
     void display()
     {
         for(int i=m;i<=n;i++)
         {
             if(isPrime(i)==1&&isPrime(i+2)==1&&(i+2)<=n)
             {
                 double brun=1/(double)i+1/(double)(i+2);
                 System.out.println(brun);
                }
            }
        }
     public static void main()
     {
         System.out.println("Enter limits.");
         Scanner sc= new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         Brun obj=new Brun(a,b);
         obj.display();
        }
    }        
     
     
                 
        
     