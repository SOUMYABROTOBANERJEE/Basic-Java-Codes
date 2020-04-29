class Consecutive
{
    void printConsecutive(int n)
    {
        for(int c=0;c<n;c++)
        {
            System.out.println("\n"+c+"\n");
            for(int i=1;i<c/2+1;i++)
            {
                int copy=c;
                int k=i;
                while(copy>=k)
                {
                    copy-=k++;
                }
                if(copy==0)
                {
                    for(int j=i;j<k-1;j++)
                        System.out.print(j+"+");
                    System.out.println(k-1);
                }
            }
        }
    }
}