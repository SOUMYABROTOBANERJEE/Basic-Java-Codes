import java.io.*;
class CompactDisk extends Publications
{
    String company; 
    int time;
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    CompactDisk()
    {
        super();
        company="";
        time=0;
    }


    void accept()throws IOException
    {
        super.accept();
        System.out.println("Enter company:");
        company=br.readLine();
        System.out.println("Running time?");
        time=Integer.parseInt(br.readLine());
    }


    void display()
    {
        super.display();
        System.out.println("Company:"+company);
        System.out.println("Running time in hours:"+time);
    }

    private void printPrice()
    {
        int price=0;
        if(time<1)
        price=550;
        if(time<2)
        price=1100;
        else if(time>2)
        price=1250;
        cost=price;
    }
    public static void main()throws IOException
    {
        CompactDisk cd=new CompactDisk();
        cd.accept();
        cd.printPrice();
        cd.display();
    }
     }