import java.io.*;
class BankAcc
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String name;
    static int nextAccNo=1;
    int accNo,balance;
    BankAcc()
    {
        name="";
        accNo=nextAccNo++;
        balance=0;
    }

    void deposit()throws IOException
    {
        System.out.println("Enter amount.");   
        balance+=Integer.parseInt(br.readLine());
    }

    int getBalance()
    {
        return balance;
    }

    void display()
    {
        System.out.println(balance);
    }
}