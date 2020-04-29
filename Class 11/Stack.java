import java.io.*;
class Stack
{
    int[] arr=new int[10];
    int top;
    Stack()
    {
        for(int i=0;i<10;i++)
            arr[i]=0;
        top =-1;
    }


    boolean isEmpty()
    {
        return top==-1;
    }


    boolean isFull()
    {
        return top==9;
    }


    void push(int x)
    {
        if(!isFull())
            arr[++top]=x;
        else 
            System.out.println("Overflow.");
    }


    int peek()
    {
        return arr[top];
    }


    void pop()
    {
        if(!isEmpty())
        {
            System.out.println("Element to be deleted" +peek());
            top--;
        }
        else
            System.out.println("Stack Underflow");
    }


    void display()
    {
        for(int i=0;i<=top;i++)
            System.out.println(arr[i]);
    }


    public static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ch, x;
        Stack obj=new Stack();
        do
        {
            System.out.println("1.Insert an element.");
            System.out.println("2.Delete an element.");
            System.out.println("3.Display last element.");
            System.out.println("4. Display stack.");
            System.out.println("5.Exit");
            ch=Integer.parseInt(br.readLine());
            switch(ch)
            {
                case 1:
                System.out.println("Enter element to be inserted.");
                x=Integer.parseInt(br.readLine());
                obj.push(x);
                break;
                case 2:
                obj.pop();
                break;
                case 3:
                System.out.println(obj.peek());
                break;
                case 4:
                obj.display();
                break;
                case 5:System.out.println("Exiting.");
                break;
            }
        }while(ch!=5);
    }
}
            