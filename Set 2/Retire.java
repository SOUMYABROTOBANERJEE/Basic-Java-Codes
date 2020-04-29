class Retire extends Personal
{
    int Yrs;
    double Grat,Pf;
    Retire()
    {
        super();
        Yrs=0;
        Grat=Pf=0;
    }

    Retire(String te,String name,int pay,int num,int y)
    {
        super(te,name,pay,num);
        Yrs=y;
        Pf=0;
        Grat=0;
    }

    void provident()
    {
        Pf=0.02*basic_pay*Yrs;
    }
    void gratuity()
    {
        if(Yrs>10)
        Grat=basic_pay*12;
    }
    void display()
    {
        super.display();
        System.out.println("Gratuity="+Grat);
        System.out.println("Provident pf="+Pf);
    }
}