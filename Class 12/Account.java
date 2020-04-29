abstract class Account
 {
     protected int accountNumber;
     protected double principal;
     Account(int a, int p)
     {
         accountNumber=a;
         principal=p;
        }
     abstract double interest();
     protected void display()
     {
         System.out.println("Account Number="+accountNumber);
         System.out.println("Principal="+principal);
        }
    }