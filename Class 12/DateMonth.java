import java.io.*;
class DateMonth
{
    static int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
    static int n,y;
    static String first;
    private static int date()
    {
        int sum=0;
        int date=999;
        for(int i=0;i<12;i++)
        {
            sum+=arr[i];
            if(n<=sum)
            {
                sum-=n;
                if(n!=sum)
                    date=arr[i]-sum;
                break;
            }
        }
        return date;  
    }

    private static void takeCareOfLeap()
    {
        if((y%100==0)&&(y%400==0))
            arr[1]=29;
        else if ((y%4==0)&&(y%100!=0))
            arr[1]=29;
    }

    private static String month()
    {
        String[] mon={"January","February","March","April","May","June","July","August","September","October","November","December"};
        int i=0,sum=0;
        for(;i<12;i++)
        {
            sum+=arr[i];
            if(n<=sum)
                break;
        }
        return mon[i];  
    }

    private static String dayOfTheWeek()
    {
        String[] days={"Saturday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};
        int i=0;
        for(;i<7;i++)
        {
            if(days[i].equals(first))
                break;
        }
        return days[n%7+i-1];
    }

    public static void main()throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Year?");
        y=Integer.parseInt(br.readLine());
        System.out.println("Day number?");
        n=Integer.parseInt(br.readLine());
        System.out.println("First day is?");
        first=br.readLine();
        takeCareOfLeap();
        int date=date();
        String month=month();
        String day=dayOfTheWeek();
        System.out.println(date+" "+month+","+day+".");
    }
}