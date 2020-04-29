import java.io.*;
class Rational
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int num, denom, nr, dr;
    Rational()
    {
        num=denom=nr=dr=0;
    }

    Rational(int a,int b)
    {
        num=a;
        denom=b;
    }

    int HCF(int a,int b)
    {
        if(a%b==0)
            return b;
        else 
            return HCF(b,a%b);
    }

    void simplify()
    {
        int h=HCF(num,denom);
        nr=num/h;
        dr=denom/h;
    }

    static Rational addRational(Rational A,Rational B)
    {   
        Rational res=new Rational();
        res.num=A.num*B.denom+B.num*A.denom;
        res.denom=A.denom*B.denom;
        res.simplify();
        return res;
    }

    void printx()
    {
        System.out.println("Original:"+num+"/"+denom);
        System.out.println("Simplified:"+nr+"/"+dr);
    }

    public static void main() throws IOException
    {
        Rational test=new Rational();
        System.out.println("Numerator?");
        test.num=Integer.parseInt(br.readLine());
        System.out.println("Denominator?");
        test.denom=Integer.parseInt(br.readLine());
        test.simplify();
        test.printx();
        int p=0,q=0;
        System.out.println("Enter fraction 1.");
        System.out.println("Numerator.");
        p=Integer.parseInt(br.readLine());
        System.out.println("Denominator");
        q=Integer.parseInt(br.readLine());
        Rational A=new Rational(p,q);
        System.out.println("Enter fraction 2.");
        System.out.println("Numerator.");
        p=Integer.parseInt(br.readLine());
        System.out.println("Denominator");
        q=Integer.parseInt(br.readLine());
        Rational B=new Rational(p,q);
        Rational sum=addRational(A,B);
        sum.printx();
    }
}

    