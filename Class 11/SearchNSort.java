/*Name:SearchNSort
 * data members:int[]arr
 * size
 * key
 * Member functions:
 * SearchnSort(int)
 * void binarySearch()-accepts key and searches for element and displays accordingly.
 * void selectionSort()-sorts array in ascending order
 * boolean isSorted()-returns true if ascending
 * void main()-Obj/displays menu/binary search
 */
import java.io.*;
class SearchNSort
{
    int[] arr;
    int size, key;
    SearchNSort(int a)
    {
        size=a;
        key=0;
        arr=new int[a];
    }

    void binarySearch()throws IOException
    {
        System.out.println("enter.");
        key=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int l=0,u=size-1;
        int mid=0,flag=0;
        while(u>=l)
        {
            mid=(l+u)/2;
            if(arr[mid]>key)
                u=mid-1;
            else if(arr[mid]<key)
                l=mid+1;
            else
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
            System.out.println("element"+key+" found at "+(mid+1));
        else
            System.out.println("Element not found.");
    }

    boolean isSorted()
    {
        int i=1;
        for(;i<size;i++)
        {
            if(arr[i-1]>arr[i])
                break;
        }
        if(i<size)
            return false;
        return true;
    }

    void selectionSort()
    {
        int pos,low;
        for(int i=0;i<size;i++)
        {
            pos=i;
            low=arr[0];
            for(int j=i+1;j<size;j++)
            {
                if(arr[j]<arr[i])
                {
                    pos=j;
                    low=arr[j];
                }
            }
            int temp=arr[i];
            arr[i]=arr[pos];
            arr[pos]=temp;
        }
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
    }

    void accept()throws IOException
    {
        System.out.println("Enter "+size+" elements, one by one.");
        for(int i=0;i<size;i++)
            arr[i]=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
    }

    void main()throws IOException       
    {
        System.out.println("Enter array size.");
        int s=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        SearchNSort obj=new SearchNSort(s);
        int ch=0;
        do
        {
            int flag=0;
            System.out.println("Enter 1 to enter array.");
            System.out.println("Enter 2 to sort array.");
            System.out.println("Enter 3 to search array.");
            System.out.println("Enter 4 to quit.");
            ch=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
            if (ch==1)
            {  
                flag=1;
                obj.accept();
                do{
                    System.out.println("Enter 2 to sort array.");
                    System.out.println("Enter 3 to search array.");
                    System.out.println("Enter 4 to quit.");
                    ch=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                }while(ch<2&&ch>4);
            }

            else if (ch==2)
            {
                if(flag==0)
                    System.out.println("No elements.Unable to sort.");
                else
                {
                    if(!obj.isSorted())    
                        obj.selectionSort();
                    flag=2;
                    do{
                        System.out.println("Enter 3 to search array.");
                        System.out.println("Enter 4 to quit.");
                        ch=Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
                    }while(ch<3&&ch>4);
                }
            }
            else if(ch==3)
            {
                if(flag==2||flag==1)
                if(obj.isSorted())
                    obj.binarySearch();
                else 
                System.out.println("Unable to search.");
            }
        }while(ch>5&&ch<1);
    }
}


 