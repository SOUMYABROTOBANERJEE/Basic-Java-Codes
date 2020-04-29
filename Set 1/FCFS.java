import java.io.*;
class FCFS
 {
    static Process[] arr;
     private static void accept() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter no. of processes.");
        arr=new Process[Integer.parseInt(br.readLine())];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter name.");
            String str=br.readLine();
            System.out.println("Enter completion time.");
            double t=Double.parseDouble(br.readLine());
            arr[i]=new Process(t,str);
        }
    }

    private static void execute()
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i].name()+" is executing.");
            System.out.println(arr[i].name()+" is completed in "+ arr[i].time());
        }
    }
    public static void main() throws IOException
    {
        accept();
        execute();
    }
}
