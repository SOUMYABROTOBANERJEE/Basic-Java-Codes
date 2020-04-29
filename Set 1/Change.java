class Change
{
    String change(String str)
    {
        int l=str.length();
        String s="";
        char[] arr=new char[l];
        for(int i=0;i<l;i++)
        {
            arr[i]=str.charAt(i);
        }
        for(int i=0;i<=(l-1)/2;i++)
        {
         char temp=arr[i];
         arr[i]=arr[l-i-1];
         arr[l-i-1]=temp;
        }
        for(int i=0;i<l;i++)
        s+=arr[i];
        return s;
    }


    void main(String str)
    {
        int l=str.length();
        String nstr="";
        String word="";
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch=='.'||ch==' ')
            {
                nstr+=(change(word)+" ");
                word="";
            }
            else
            word+=ch;
        }
        System.out.println(nstr);
    }
}