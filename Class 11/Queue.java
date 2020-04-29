import java.io.*;
class Queue
{
    int[] arr;
    int f,r;
    Queue(int a)
    {
        arr=new int[a];
        f=r=-1;
    }


    boolean isEmpty()
    {
        return ((r==-1&&f==-1)||f>r);
    }


    boolean isFull()
    {
        return r>=arr.length-1;
    }


    void enqueue(int x)
    {
        if(!isFull())
        {
            if(f==-1&&r==-1)
            {
                arr[++r]=x;
                ++f;
            }
            else
                arr[++r]=x;
        }
        else
            System.out.println("Overflow.");
    }


    void dequeueW()
    {
        if(!isEmpty())
            f++;
        else
            System.out.println("Underflow.");
    }


    void dequeueT()
    {
        if(!isEmpty())
        {
            for(int i=0;i<r-1;)
            {
                arr[i]=arr[++i];
                --r;
            }
        }
        else
            System.out.println("Underflow.");
    }


    void display()
    {
        if(!isEmpty())
        for(int i=f;i<=r;i++)
            System.out.print(arr[i]+" ");
    }


    public static void main() throws IOException   
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch=0;
        System.out.println("Enter size of queue. Max is 100."); 
        int l=Integer.parseInt(br.readLine());
        Queue q=new Queue(l);
        do{
            System.out.println("Enter 1 to enter.");
            System.out.println("Enter 2 to delete by ticket booth.");
            System.out.println("Enter 3 to delete by waiter.");
            System.out.println("4 to Exit.");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                q.enqueue(Integer.parseInt(br.readLine()));
                break;
                case 2:
                q.dequeueT();
                break;
                case 3:q.dequeueW();
                break;
            }
            q.display();
            System.out.println();
        }while(ch!=4);
    }
    }