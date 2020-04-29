import java.io.*;
class RoundRobbin
{
    static Process[] arr;
    static double time=0.0;
    static double slice=0.0;
    private static void accept() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of processes.");
        arr=new Process[Integer.parseInt(br.readLine())];
        System.out.println("Enter total CPU time.");
        time=Double.parseDouble(br.readLine());
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter name.");
            String str=br.readLine();
            System.out.println("Enter completion time.");
            double t=Double.parseDouble(br.readLine());
            arr[i]=new Process(t,str);
        }
    }


    private static void allocateTime(double e)
    {
        int n=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=null)
                n++;
        }
        if(n!=0)
            slice=(time+e)/n;   
    }

    private static void execute()
    {
        for(int i=0;i<arr.length;i++)
        System.out.print("\t"+arr[i].name+"\t\t\t");
        System.out.println();
        int k=0;
        while(!isComplete())
        {
            System.out.print("Run"+(++k)+"\t");
            allocateTime(0.0);
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]!=null)
                {
                    double extra=arr[i].run(slice);
                    if(arr[i].isFinished())
                    {
                        arr[i]=null;
                        allocateTime(extra);
                    }
                }
            }
            System.out.println();
        }
        System.out.println("\n End of processes.");
    }


    private static boolean isComplete()
    {
        boolean f=true;
        for(int i=0;i<arr.length;i++)
            if(arr[i]!=null)
                f=false;
        return f;
    }


    public static void main() throws IOException
    {
        accept();
        execute();
    }
}         