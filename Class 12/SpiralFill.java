import java.io.*;
class SpiralFill
{
    private int[][] arr;
    private int a;
    private static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    SpiralFill(int p)
    {
        a=p;
        arr=new int[p][p];
    }

    void spiralFill()
    {
        int m=0,n=-1;
        int k=a+1;
        int count=1;
        while(k>0)
        {
            ++n;
            k--;
            for(int i=0;i<k;i++)
            {
                arr[m][n++]=count++; 
            }
            n-=1;
            m++;
            for(int i=0;i<k-1;i++)
                arr[m++][n]=count++;
            m-=1;
            n--;
            for(int i=0;i<k-1;i++)
                arr[m][n--]=count++;
            n+=1;
            m--;
            for(int i=0;i<k-2;i++)
                arr[m--][n]=count++;
            m+=1;
            k-=1;
        }
    }

    void display()
    {
        System.out.println("SPIRAL MATRIX:");  
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
        System.out.println("Enter size of square matrix. Must be odd.");
        int p=Integer.parseInt(br.readLine());
        SpiralFill obj=new SpiralFill(p);
        obj.spiralFill();
        obj.display();
        //System.out.println("If you don't know the difference between odd and even, what are you doing near a computer?");
    }
}