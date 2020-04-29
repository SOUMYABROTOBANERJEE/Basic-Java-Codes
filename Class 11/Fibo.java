public class Fibo
{
    static int nthFibo(int a)
    {
        if(a==1||a==2)
            return 1;
        else
            return (nthFibo(a-1)+nthFibo(a-2));
    }

    static void main(int n)
    {
        for(int i=1;i<=n;i++)
            System.out.println(nthFibo(i));
    }  
}