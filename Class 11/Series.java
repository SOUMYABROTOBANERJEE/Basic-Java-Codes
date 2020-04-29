import java.io.*;
class Series
{
    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch=0;
        do
        {
            System.out.println("Enter choice.");
            System.out.println("Enter 1 for Fibonacci.");
            System.out.println("Enter 2 for Factorial.");
            System.out.println("Enter 3 for Series.");
            System.out.println("Enter 4 for hcf.");
            System.out.println("Enter 5 for Power.");
            System.out.println("Enter 6 to exit.");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1: System.out.println("Enter no.of terms.");
                int a=Integer.parseInt(br.readLine());
                for(int i=1;i<=a;i++)
                    System.out.println(Fibo.nthFibo(i));
                break;
                case 2:System.out.println("Enter number.");
                int b=Integer.parseInt(br.readLine());
                System.out.println(Factorial.factorial(b));
                break;
                case 3:System.out.println("Enter no.of terms.");
                int n=Integer.parseInt(br.readLine());
                double sum=0.0;
                for(int i=1;i<=n;i++)
                {
                    sum+=(double)(Fibo.nthFibo(i)/Factorial.factorial(i));    
                    System.out.println((double)(Fibo.nthFibo(i)/Factorial.factorial(i)));
                }
                break;
                case 4:
                System.out.println("Enter two numbers.");
                int p=Integer.parseInt(br.readLine());
                int q=Integer.parseInt(br.readLine());
                System.out.println(HCF.hcf(p,q));
                break;
                case 5:
                System.out.println("Enter two numbers.");
                int l=Integer.parseInt(br.readLine());
                int k=Integer.parseInt(br.readLine());
                System.out.println(Power.exponent(l,k));
            }
        }while(ch!=6);
    }
}
