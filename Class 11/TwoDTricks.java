package ArkadebSengupta11A11;

import java.io.*;
class TwoDTricks
{
    int[][] arr;
    int r,c;
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    TwoDTricks(int m,int n)
    {
        r=m;
        c=n;
        arr=new int[r][c];
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

    void sumUp()
    {
        int[] sr=new int[r];
        int[] sc=new int[c];
        int rd=0,ld=0;
        for(int i=0;i<r;i++)
        {
            for (int j=0;j<c;j++)
            {
                sr[i]+=arr[i][j];
                sc[j]+=arr[i][j];
                if(r==c)
                {
                    if(i==j)
                        rd+=arr[i][j];
                    if((i+j)==(c-1))
                        ld+=arr[i][j];
                }
            }  
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
                System.out.print(arr[i][j]+"\t");
            System.out.println(sr[i]);
        }
        for(int i=0;i<c;i++)
            System.out.print(sc[i]+"\t");
        System.out.println();
        if(r==c)
        {
            System.out.println("Right diagonal:"+rd);
            System.out.println("Left diagonal:"+ld);
        }
        else
        System.out.println("No diagonals.");
    }
    void average()
    {
        double s=0;
        for(int i=0;i<r;i++)
            for(int j=0;j<c;j++)
            s+=arr[i][j];
        double avg=s/(r*c);
        System.out.println("Average:"+avg);
    }
    void printSaddlePoint()
    {
     int cmin=0,rmax=0;
     for(int i=0;i<r;i++)
     {
         rmax=0;
         for(int j=0;j<c;j++)
             if(arr[i][j]>arr[i][rmax])
             rmax=j;
         for(int j=0;j<r;j++)
         if(arr[j][rmax]<arr[cmin][rmax])
         cmin=j;
         if(cmin==i)
         System.out.println("Saddle at:"+cmin+","+rmax);
        }
    }
    public static void main()throws IOException
    {
       int ch=0;
       TwoDTricks mat=new TwoDTricks(1,2);
       while(ch!=4)
       {
        if(ch==0)
        {
            System.out.println("Enter size of matrix.");
            int m=Integer.parseInt(br.readLine());
            int n=Integer.parseInt(br.readLine());
            mat=new TwoDTricks(m,n);
            mat.accept();
        }
        System.out.println("Enter 1 for row and column sums.");
        System.out.println("Enter 2 for saddle point(s).");
        System.out.println("Enter 3 for average of array.");
        System.out.println("Enter 4 for the green pill(if you have watched The Matrix) or exit (if you have not).");
        ch=Integer.parseInt(br.readLine());
        if(ch==0)
        ch=5;
        switch(ch)
        {
            case 1:
            mat.sumUp();
            break;
            case 2:
            mat.printSaddlePoint();
            break;
            case 3:
            mat.average();
            break;
        }
        }
        }
    }