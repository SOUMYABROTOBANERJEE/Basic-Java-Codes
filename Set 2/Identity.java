import java.io.*;
class Identity
{
    int[][] arr;
    int r,c;
    boolean flag;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    Identity(int m,int n)
    {
        r=m;
        c=n;
        arr=new int[r][c];
        flag=true;
    }

    void accept()throws IOException
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println("Enter element:"+i+","+j);
                arr[i][j]=Integer.parseInt(br.readLine());
            }
        }
    }

    void check()
    {
        if(r==c)
        {
            for(int i=0;i<r&&flag;i++)
            {
                for(int j=0;j<c&&flag;j++)
                {
                    int k=arr[i][j];
                    if((i!=j)&&k!=0)
                        flag=false;
                    else if((i==j)&&k!=1)
                        flag=false;
                }
            }
        }
        else
            flag=false;
    }

    void display()
    {
        if(!flag)
            System.out.print("Not an ");
        System.out.println("Identity Matrix.");
    }

    public static void main()throws IOException
    {
        System.out.println("Enter no. of rows.");
        int m=Integer.parseInt(br.readLine());
        System.out.println("Enter no. of columns.");
        int n=Integer.parseInt(br.readLine());
        Identity obj=new Identity(m,n);
        obj.accept();
        obj.check();
        obj.display();
    }
    }