import java.io.*;
class YetAnotherPattern
{
    public static void main()throws IOException
    {
        System.out.println("Enter number, then Direction(L/R)");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        char ch=br.readLine().toUpperCase().charAt(0);
        int x=0,a=0,b=0;
        switch(ch)
        {
            case 'L':
            x=0;
            a=1;
            b=0;
            break;
            case 'R':
            x=n-1;
            a=-1;
            b=n-1;
        }
        int[] arr=new int[n];
        for(int i=0;i<n;)
        arr[i]=++i;
        for(int i=0;i<n;i++)
        {
            for(int j=b;;j+=a)
            {
                if((j!=0)&&(x!=0)&&(j==x))
                break;
                if((j==0)&&x==0)
                break;
                arr[j]=arr[x];
            }
            x+=a;
            for(int j=0;j<n;j++)
            System.out.print(arr[j]);
            System.out.println();
        }
    }
}

