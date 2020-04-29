class PalDiff
{
    void main(String str)
    {
        int l=str.length(),n=0;
        for(int i=0;i<=l/2;i++)
        {
            if(str.charAt(i)!=str.charAt(l-i-1))
                n++;
        }
        System.out.println(n*2);
    }
}

