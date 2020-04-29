import java.io.*;
class Password
{
    String[] arr;
    boolean x;
    int count;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Password()
    {
        arr=new String[4];
        x=false;
    }

    void acceptPass() throws IOException
    {
        System.out.println("Enter your respective passwords for storage.");
        System.out.println("Chairman:");
        arr[0]=br.readLine();
        System.out.println("Regional Manager:");
        arr[1]=br.readLine();
        System.out.println("Bank Manager:");
        arr[2]=br.readLine();
        System.out.println("Head Cashier:");
        arr[3]=br.readLine();
        System.out.println("\u000c");
    }

    void passwordEnter()throws IOException
    {
        String pass="";
        System.out.println("Enter passwords.");
        System.out.println("Enter Chairman's password, nothing to decline.");
        String p1=br.readLine();
        System.out.println("Enter RM's password, nothing to decline.");
        String p2=br.readLine();
        System.out.println("Enter Bank M's password, nothing to decline.");
        String p3=br.readLine();
        System.out.println("Enter Head cashier's password, nothing to decline.");
        String p4=br.readLine();
        int n=0;
        if(p1.equals(arr[0]))
        n++;
        if(p2.equals(arr[1]))
        n++;
        if(p3.equals(arr[2]))
        n++;
        if(p4.equals(arr[3]))
        n++;
        if(n==3)
        x=true;
        }
    
    void display()
    {
        if(x)
        System.out.println("Safe has been opened.");
        else
        System.out.println("I'm calling the police.");
    }

    public static void main() throws IOException
    {
        Password obj=new Password();
        obj.acceptPass();
        char c;
        obj.passwordEnter();
        obj.display();
    }
}