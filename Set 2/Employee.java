class Employee
{
    int empNo;
    String empName;
    String empDesig;
    Employee()
    {
        empNo=0;
        empName="";
        empDesig="";
    }

    Employee(int te,String name,String desig)
    {
        empNo=te;
        empName=name;
        empDesig=desig;
    }
    void display()
    {
        System.out.println("Name="+empName);
        System.out.println("Number="+empNo);
        System.out.println("Designation:"+empDesig);
    }

    }