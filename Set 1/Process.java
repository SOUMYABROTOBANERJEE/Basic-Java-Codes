class Process
{
    double t;
    String name;
    public Process(double a,String b)
    {
        name=b;
        t=a;
    }

    public double run(double s)
    {
        if(t>0)
            System.out.print(t+"-->"); 
        else
            displayCompletion();
        t-=s;
        if(t>0)
        System.out.print(t+"\t\t\t");
        else
        System.out.print("0.0\t\t\t");
        if(isFinished())
            return t*-1;
        return 0.0;
    }

    public boolean isFinished()
    {
        return t<=0;
    }

    public void displayCompletion()
    {
        System.out.print("Complete\t");
    }
    
    public double time()
    {
        return t;
    }
    
    public String name()
    {
        return name;
    }
}
      