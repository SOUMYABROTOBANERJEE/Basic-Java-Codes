import java.io.*;
class MatSub
{
    int[][] arr;
    int r,c;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    MatSub(int p,int q)
    {
        r=c;
        p=q;
        arr=new int[p][q];
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

    MatSub findAddend(MatSub B)
    {
        MatSub res=new MatSub(r,c);
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                res.arr[i][j]=B.arr[i][j]-arr[i][j];
            }
        }
        return res;
    }
    
    void display()
    {
        System.out.println("ADDEND:");  
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();   
        }
    }
    public static void main()throws IOException
    {
        System.out.println("Enter no. of rows.");
        int a=Integer.parseInt(br.readLine());
        System.out.println("Enter no. of columns.");
        int b=Integer.parseInt(br.readLine());
        MatSub A=new MatSub(a,b);
        MatSub B=new MatSub(a,b);
        A.accept();
        B.accept();
        MatSub res=B.findAddend(A);
        res.display();
    }
}