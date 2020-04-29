import java.io.*;
class BraceMatch
{
    char[] arr;
    int top,size;
    String msg;
    BraceMatch(int n)
    {
        arr=new char[n];
        top =-1;
        size=n;
        msg="No input.";
    }


    private boolean isEmpty()
    {
        return top==-1;
    }


    private boolean isFull()
    {
        return top==size;
    }


    private void push(char x)
    {
        if(!isFull())
            arr[++top]=x;
    }


    private char peek()
    {
        return arr[top];
    }


    private void pop()
    {
        if(!isEmpty())
        {
            arr[top--]=' ';
        }
    }
    void checkBrace(String str)
    {
        int f=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='('||ch=='{'||ch=='[')
             push(ch);
            else
            if(ch==')'||ch=='}'||ch==']')
            {
                if(top!=-1)
                {
                if((peek()=='('&&ch==')')||(peek()=='['&&ch==']')||(peek()=='{'&&ch=='}'))
                 pop();
                 else
                 f=-1;
                }
                else
                f=-1;
            }
        }
        if(f==-1)
        {
         msg="Braces don't match.";
        }
        else if(top!=-1)
         msg="Braces incomplete.";
         else
         msg="Braces all right.";
    }
    private void display()
    {
        System.out.println(msg);
    }
     void displayStack()
     {
         for (int i=0;i<top;i++)
         System.out.print(arr[i]+" ");
         System.out.println();
        }
    public static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter expression.");
        String str=br.readLine();
        int n=0,l=str.length();
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='['||ch=='{'||ch=='(')
                n++;
        }
        BraceMatch obj=new BraceMatch(n);
        if(!str.equals(""))
        obj.checkBrace(str);
        obj.display();
    }
}
    
        