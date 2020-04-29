public class Power
 {
     static int exponent(int a,int b)
     {
         if(b==1||b==0)
         return a;
         else
         return a*exponent(a,b-1);
        }
    }