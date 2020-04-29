 import java.io.*;
class MarkSheet
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static double[]mat=new double[25];
    static double[]sc=new double[25];
    static double[]avg=new double[25];
    static void accept()throws IOException
    {
        for(int i=0;i<25;i++)
        {
            System.out.println("Subject 1?");
            mat[i]=Double.parseDouble(br.readLine());
            System.out.println("Subject 2?");
            sc[i]=Double.parseDouble(br.readLine());
            avg[i]=0.5*(sc[i]+mat[i]);
        }
    }


    static void yahoo()
    {
        for(int j=0;j<5;j++)
        {
            int n=0;
            double max=avg[0];
            for(int i=1;i<25;i++)
            {
                if(avg[i]>max)
                    max=avg[i];
            }
            for(int i=0;i<25;i++)
            {
                if(avg[i]==max)
                {
                    n++;
                    avg[i]=-1;
                }
            }
            System.out.println(max+ " received by "+n+" students.");   
        }
    }
    public static void main()throws IOException
    {
        accept();
        yahoo();
    }
    }