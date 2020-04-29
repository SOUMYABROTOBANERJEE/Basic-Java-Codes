package ArkadebSengupta11A11;

class SumOfNos
 {
     static void evalSum(long n)
     {
         for(long i=2;i<=n;i++)
         {
             for(long j=1;j<=i/2;j++)
             {
                 System.out.print((i-j)+"+"+j);
                 for(long k=i;k<n;k++)
                 System.out.print("+1");
                 System.out.println();
                }   
            }
        }
 }