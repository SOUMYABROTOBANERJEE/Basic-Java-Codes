class Compound extends Account
{
    int t;
    double r;
    Compound(int a,int p,int time,double rate)
    {
        super(a,p);
        r=rate;
        t=time;
    }

    double interest()
    {
        double i=principal*Math.pow(1+r/100,t);
        i-=principal;
        return i;
    }

    public void display()
    {
        super.display();
        System.out.println("Time="+t);
        System.out.println("Rate="+r);
        System.out.println("Compound interest="+interest());
    }
    }