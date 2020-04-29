class Simple extends Account
{
    int t;
    double r;
    Simple(int a,int p,int time,double rate)
    {
        super(a,p);
        r=rate;
        t=time;
    }

    double interest()
    {
        double i=principal*r*t/100.0;
        return i;
    }

    public void display()
    {
        super.display();
        System.out.println("Time="+t);
        System.out.println("Rate="+r);
        System.out.println("Simple interest="+interest());
    }
    }