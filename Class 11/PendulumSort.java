package ArkadebSengupta11A11;

import java.util.*;
class PendulumSort
{
    int[] src,arr;
    int size;
    PendulumSort(int l)
    {
        size=l;
        src=new int[size];
        arr=new int[size];
    }

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements one by one.");
        int i=0;
        while(i<size)
        {
            src[i++]=sc.nextInt();
        }
    }

    void kangarooSort()
    {
        int l=size;
        int max=arr[0],min=arr[0];
        for(int i=1;i<l;i++)
        {
            if(src[i]>max)
                max=src[i];
            if(src[i]<min)
                min=src[i];
        }
        int k=(arr.length-1)/2; 
        int ind=0;
        for(int i=max;i>=min;i--)   
        {
            for(int j=0;j<l;j++)
            {
                if(src[j]==i)
                {
                    k=k-(int)Math.pow(-1,ind)*ind;
                    arr[k]=i;
                    ind++;
                }
            }
        }
    }

    void display()
    {
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }

    static void main()
    {
        System.out.println("Enter size");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a>=0)
        {
            PendulumSort obj=new PendulumSort(a);
            obj.accept();
            obj.kangarooSort();
            obj.display();
        }
        else
        {
            System.out.println("Thou shalt not input garbage values. Else, thou wilt be terminated.");
            System.out.println("Self destruct in:");
            for(int i=0;i<100000;i++)
            {
                for(int j=0;j<100000;j++);
                if(i%10000==0)
                System.out.println(10-i/10000);
            }
            System.out.println("Kaboom!");
        }
    }
}