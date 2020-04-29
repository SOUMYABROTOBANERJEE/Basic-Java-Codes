class Personal
{
    String Pan;
    String Name;
    double basic_pay;
    int acc_no;
    Personal()
    {
        Pan="";
        Name="";
        basic_pay=acc_no=0;
    }

    Personal(String te,String name,int pay,int num)
    {
        Pan=te;
        Name=name;
        basic_pay=pay;
        acc_no=num;
    }


    void display()
    {
        System.out.println("Name="+Name);
        System.out.println("PAN="+Pan);
        System.out.println("Basic:"+basic_pay);
        System.out.println("Account no.:"+acc_no);
    }

    }