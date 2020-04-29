import java.io.*;
class Expression 
{
    int size,top1,top2;
    String str;
    int[] num;
    char[] op;
    char[] brace;
    Expression(String exp)
    {
        str=exp;
        size=str.length();
        num=new int[size];
        op=new char[size];
        top1=top2=-1;
    }


    private boolean isEmpty(int n)
    {
        return top1==-1;
    }


    private boolean isEmpty(char ch)
    {
        return top2==-1;
    }


    private void pop(int n)
    {
        if(!isEmpty(n))
            top1--;
    }


    private void pop(char ch)
    {
        if(!isEmpty(ch))
            top2--;
    } 


    private void push(int n)
    {
        if(top1<size)
            num[++top1]=n;
    }


    private void push(char ch)
    {
        if(top2<size)
            num[++top2]=ch;
    }   


    private int peek(int n)
    {
        return num[top1];
    }    


    private char peek(char ch)
    {
        return op[top2];
    }

    private void evaluate()
    {
       int op1,op2;
    }

    public static void main() throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter expression.");
        String exp=br.readLine();   
    }
}
