class HCF
 {
     static int hcf(int a, int b)
     {
         if(a%b==0)
         return b;
         else 
         return hcf(b,a%b);
        }
    }
