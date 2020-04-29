import java.io.*;
class Admission
{
    int n;
    boolean isValid;
    String[] name,remarks,grade;
    int[] p;
    Admission()
    {
        name=new String[15];
        remarks=new String[15];
        grade=new String[15];
        p=new int[15];
        isValid=true;
    }
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    void input()throws	IOException
    {
        System.out.println("Enter no. of students. Max 15.");
        try{
        n=Integer.parseInt(br.readLine());
        if(n>0&&n<16)
        {
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter name.");
                name[i]=br.readLine();
                System.out.println("Enter grades.");
                grade[i]=br.readLine().toUpperCase();
            }
        }
        else
            isValid=false;
        }
        catch(NumberFormatException e)
        {
            isValid=false;
        }
    }


    char[] toCharArray(String str)
    {
        char arr[]=new char[str.length()];
        for(int i=0;i<arr.length;i++)
            arr[i]=str.charAt(i);
        return arr;
    }


    char[] bubbleSort(char[] arr)
    {
        int l=arr.length;
        for(int i=0;i<l-1&&isValid;i++)
        {
            for(int j=0;j<l-i-1&&isValid;j++)
            {
                if(arr[j]>71||arr[j]<65)
                    isValid=false;
                if(arr[j]>arr[j+1])
                {
                    char temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    void bubbleSort()
    {
        int l=p.length;
        for(int i=0;i<l&&isValid;i++)
        {
            for(int j=0;j<l-1-i&&isValid;j++)
            {
                if(p[j]<p[j+1])
                {
                    int temp=p[j];
                    p[j]=p[j+1];
                    p[j+1]=temp;
                    String tem=name[j];
                    name[j]=name[j+1];
                    name[j+1]=tem;
                    String s=remarks[j];
                    remarks[j]=remarks[j+1];
                    remarks[j+1]=s;
                }
            }
        }
    }

    void decipher()
    {
        for(int i=0;i<n;i++)
        {
            String str=grade[i];
            char[] arr=toCharArray(str);
            arr=bubbleSort(arr);
            if(arr.length<6||arr.length>10)
                isValid=false;
            else
            {
                for(int j=0;j<6;j++)
                {
                    p[i]+=allocate(arr[j]);
                }
            }
        }       
    }

    int allocate(char c)    
    {
        int x=70-c;
        if(x<0)
            x=0;
        return x;
    }

    void remarks()
    {
        for(int i=0;i<n;i++)
        {
            if(p[i]<14)
                remarks[i]="Disqualified";
            else
                remarks[i]="Qualified";
        }
    }


    void display()
    {
        bubbleSort();
        for(int i=0;i<n;i++)
        {
            System.out.println(name[i]+"\t"+p[i]+"\t"+remarks[i]);
        }
    }


    public static void main()throws IOException
    {
        Admission obj=new Admission();
        obj.input();
        if(obj.isValid)
            obj.decipher();
         if(obj.isValid)
         {
          obj.remarks();
          obj.display();
        }
        if(!obj.isValid)
        System.out.println("Bad input.");
        }
    }