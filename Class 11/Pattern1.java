/*
 * WAP to print the following pattern:
 * 12345
 *  234
 *   3
 *  234
 * 12345,
 * for input=3
 */
class Pattern1
 {
     void main(int n)
     {
         for(int i=0;i<n;i++)
         {
             for(int s=0;s<i;s++)
             System.out.print(' ');
             for(int j=i+1;j<2*n-i;j++)
             System.out.print(j);
             System.out.println();
            }
         for(int i=1;i<=n-1;i++)
         {
             for(int s=n-i-1;s>0;s--)
             System.out.print(' ');
             for(int j=n-i;j<n+i+1;j++)
             System.out.print(j);
             System.out.println();
            }
        }
    }
    /*
     * 12345
        234
         3
        234
       12345

     */
             
             