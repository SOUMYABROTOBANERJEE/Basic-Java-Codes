import java.io.*;
class StringPat
{
    int ch;
    String dat;
    void pattern1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i-1;j>=0;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-i-1;j>=0;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }   
    }

    void pattern2(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i-1;j>=0;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-i-1;j>=0;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }   
    }

    void pattern3(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=n-i-1;j>=0;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                if(j==1||j==i)   
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--)
        {
            for(int j=n-i-1;j>=0;j--)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
            {if(j==1||j==i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }  
    }

    void pattern4(String str)
    {
        int l=str.length();
        int p=1;
        for(int i=0;i<2*l-1;i++)
        {
            for(int j=0;j<p;j++)
                System.out.print(str.charAt(j));
            if(i>=l-1)
                p--;
            else 
                p++;
            System.out.println();
        }
    }

    void pattern5(String str)
    {
        int l=str.length();
        int p=l;;
        for(int i=0;i<2*l-1;i++)
        {
            for(int j=0;j<p;j++)
                System.out.print(str.charAt(j));
            if(i>=l-1)
                p++;
            else 
                p--;
            System.out.println();
        }
    }

    void decidePat()
    {
        switch(ch)
        {
            case 1:
            pattern1(Integer.parseInt(dat));
            break;
            case 2:
            pattern2(Integer.parseInt(dat));
            break;
            case 3:
            pattern3(Integer.parseInt(dat));
            break;
            case 4:
            pattern4(dat);
            break;
            case 5:
            pattern5(dat);
            break;
        }
    }

    void accept()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        do
        {
            try{

                System.out.println("Enter choice:1 to 5.");
                ch=Integer.parseInt(br.readLine());
            }

            catch(NumberFormatException n)
            {
                System.out.println("Invalid input.");
                ch=6;
            }
        }while(ch>5||ch<1);
        if(ch>=1&&ch<=3)
        {
            System.out.println("Enter no.");
            dat=br.readLine();
        }
        if(ch>3&&ch<6)
        {
            System.out.println("Enter string");
            dat=br.readLine();
        }
    }

    public static void main()throws IOException
    {
        StringPat obj=new StringPat();
        obj.accept();
        obj.decidePat();
    }
}

