import java.io.*;
class NumberPlate
{
    String state,al;
    int reg,id;
    NumberPlate(String str)
    {
        state=str.substring(0,2);
        al=str.substring(6,7);
        reg=Integer.parseInt(str.substring(3,5));
        id=Integer.parseInt(str.substring(8));
    }

    static boolean isValid(String str)
    {
        if(str.length()!=12)
            return false;
        boolean flag=true;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            switch(i)
            {
                case 2:
                case 5:
                case 7:
                if(ch!=' ')
                    flag=false;
                break;
                case 0:
                case 1:
                case 6:
                if(!Character.isLetter(ch))
                    flag=false;
                break;
                default:
                if(ch<48||ch>57)
                    flag=false;
            }
        }
        return flag;
    }

    int compareTo(NumberPlate n1)
    {
       int l1=al.charAt(0);
       int l2=n1.al.charAt(0);
       int x=(int)(Math.abs((id-n1.id)+(10000*(l1-l2))+260000*(reg-n1.reg)));
       return x;
    }

    int waitFor(int a)
    {
        if(id>a)
        return id-a;
        return id-a+10000;
    }

    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch=0;
        while(ch!=4)
        {
            System.out.println("Enter 1 to see number of cars sold between two cars.");
            System.out.println("Enter 2 to see amount collected between two cars.");
            System.out.println("Enter 3 to see how many cars you need to wait for before your dream number comes.");
            System.out.println("Enter 4 to exit.");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                System.out.println("Enter two plates.");
                String str1=br.readLine();
                String str2=br.readLine();
                if(isValid(str1)&&isValid(str2))
                {
                    NumberPlate ob1=new NumberPlate(str1);
                    NumberPlate ob2=new NumberPlate(str2);
                    System.out.println(ob1.compareTo(ob2));
                }

                else
                    System.out.println("This is not a Vat. Do not input garbage.");
                break;
                case 2:
                System.out.println("Enter specific amount.");
                int amt=Integer.parseInt(br.readLine());
                System.out.println("Enter two plates.");
                String str3=br.readLine();
                String str4=br.readLine();
                if(isValid(str3)&&isValid(str4))
                {
                    NumberPlate ob3=new NumberPlate(str3);
                    NumberPlate ob4=new NumberPlate(str4);
                    System.out.println(ob3.compareTo(ob4)*amt);
                }
                else 
                    System.out.println("This is not a Vat. Do not input garbage.");
                break;
                case 3:
                System.out.println("Enter dream no.");
                int dream=Integer.parseInt(br.readLine());
                System.out.println("Enter current numberplate.");
                String plt=br.readLine();
                if(isValid(plt)&&dream<=10000)
                {
                    NumberPlate ob=new NumberPlate(plt);   
                    System.out.println(ob.waitFor(dream));
                }
            }
        }
    }
}