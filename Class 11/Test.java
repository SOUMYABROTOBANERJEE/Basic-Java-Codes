import java.io.*;
class Test
 {
     public static void main()throws IOException
     {
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
         System.out.println("Enter a decimal integer.");
         try{
         int n=Integer.parseInt(br.readLine());
         int sum=0,p=0;
         boolean flag;
         for(int i=1;i<n/2+2;i++)
         {
             sum=0;
             p=0;
             flag=false;
             for(int j=i;j<n/2+2;j++)
             {
                 sum+=j;
                 if(sum==n)
                 {
                  flag=true;
                  p=j;
                }
                if(sum>=n)
                break;
            }  
            if(flag)
            {
                for(int k=i;k<=p;k++)
                System.out.print(k+" ");
                System.out.println();
            }
        }
    }
    catch(NumberFormatException e)
    {
        System.out.println("I said a DECIMAL INTEGER. No output for you.");
    }
}
}
            