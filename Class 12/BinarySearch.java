import java.io.*;
class BinarySearch
{
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    int[] arr;
    int l,key;
    BinarySearch(int a)
    {
        l=a;
        arr=new int[l];
        key=0;
    }

    void binarySearch(int l,int h)
    {
        int mid=h+l;
        mid/=2;
        if(arr[mid]==key)
        {
            System.out.println("Found at position: "+(mid+1));
            return;
        }
        if(l>h)
        {
            System.out.println("Element not found");
            return;
        }
        else if(arr[mid]>key)
            binarySearch(l,mid-1);
        else if(arr[mid]<key)
            binarySearch(mid+1,h);
    }

    void accept()throws IOException
    {
        System.out.println("Enter sorted array.");
        for(int i=0;i<l;i++)
            arr[i]=Integer.parseInt(br.readLine());
        System.out.println("Key?");
        key=Integer.parseInt(br.readLine());
    }

    public static void main() throws IOException
    {
        System.out.println("Enter size of array.");
        BinarySearch obj=new BinarySearch(Integer.parseInt(br.readLine()));
        obj.accept();
        obj.binarySearch(0,obj.l);
    }
}
