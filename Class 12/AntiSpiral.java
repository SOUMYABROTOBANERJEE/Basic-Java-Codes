import java.io.*;
class AntiSpiral
{
    private int[][] arr;
    private int a;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    AntiSpiral(int p)
    {
        a=p;
        arr=new int[p][p];
    }

    void oddSpiralFill()
    {
        int m=a/2,n=a/2;
        arr[m][n]=1;
        int k=2;
        int count=2;
        while(count<=a*a)
        {
            --n;
            for(int i=0;i<k;i++)
            {
                arr[m++][n]=count++; 
            }
            n+=1;
            m--;
            for(int i=0;i<k;i++)
                arr[m][n++]=count++;
            m-=1;
            n--;
            for(int i=0;i<k;i++)
                arr[m--][n]=count++;
            n-=1;
            m++;
            for(int i=0;i<k;i++)
                arr[m][n--]=count++;
            k+=2;
            n+=1;
        }

    }

    void evenSpiralFill()
    {
        int m=a/2,n=a/2-1;
        int count=1;
        arr[m][n++]=count++;
        arr[m--][n]=count++;
        arr[m][n--]=count++;
        arr[m][n]=count++;
        int k=3;
        while(count<=a*a)
        {
            --n;
            for(int i=0;i<k;i++)
            {
                arr[m++][n]=count++; 
            }
            n+=1;
            m--;
            for(int i=0;i<k;i++)
                arr[m][n++]=count++;
            m-=1;
            n--;
            for(int i=0;i<k;i++)
                arr[m--][n]=count++;
            n-=1;
            m++;
            for(int i=0;i<k;i++)
                arr[m][n--]=count++;
            k+=2;
            n+=1;
        }

    }

    void display()
    {
        System.out.println("ANTISPIRAL MATRIX:");  
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();   
        }
    }

    public static void main() throws IOException
    {
        System.out.println("Enter size of square matrix. ");
        int p=Integer.parseInt(br.readLine());
        AntiSpiral obj=new AntiSpiral(p);
        if(p%2!=0)
            obj.oddSpiralFill();
        else
            obj.evenSpiralFill();
        obj.display();
    }
}
