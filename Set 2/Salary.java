class Salary extends Employee
 {
    float basic;
    Salary(int n,String name,String desig,float sal)
    {
        super(n,name,desig);
        basic=sal;
    }
    void calculate()
    {
        basic=basic*(1.25f);
        float sal=basic;
        sal*=0.92f;
        super.display();
        System.out.println("Net Salary="+sal);
    }
 }