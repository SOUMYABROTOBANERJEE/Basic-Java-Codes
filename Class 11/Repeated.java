//WAP to accept a string and print the repeated words

class Repeated
{
    void main(String str)
    {
        int l=str.length();
        int n=0;
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch==' '||ch=='.')
                n++;
        }
        String[] arr=new String[n];
        String wd="";
        int k=0;
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch==' '||ch=='.')
            {
                arr[k++]=wd;
                wd="";
            }
            else
                wd+=ch;
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=1;j<n;j++)

                if(arr[j-1].compareToIgnoreCase(arr[j])>0)
                {
                    String temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
            }
        }
        for(int i=1;i<n-1;i++)
        {
            if(arr[0].equalsIgnoreCase(arr[1]))
            System.out.print(arr[0]+" ");
             else if(arr[i].equalsIgnoreCase(arr[i+1])&& !arr[i].equalsIgnoreCase(arr[i-1]))
                System.out.print(arr[i]+" ");
        }
    }
}

         