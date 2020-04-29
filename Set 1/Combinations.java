import java.io.*;
class Combinations
{
    int arrange(int n)
    {
        int x=0;
        for(int i=9;i>=0;i--)
        {
            int copy=n;
            while(copy!=0)
            {
                int dig=copy%10;
                if(dig==i)
                    x=x*10+dig;
                copy/=10;
            }
        }
        return x;
    }

    int nod(int n)
    {
        int nod=0;
        while(n>0)
        {
            n/=10;
            nod++;
        }
        return nod;
    }

    void main(int n)
    {
        int p=(int)Math.pow(10,nod(n)-1);
        int q=(int)Math.pow(10,nod(n));
        for(int i=p;i<q;i++)
        {
            if(arrange(i)==arrange(n))
                System.out.println(i);
            }
    }
 }
