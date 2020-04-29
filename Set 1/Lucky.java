/*
 * WAP to print all lucky numbers upto n.
 */
class Lucky
 {
     void main(int n)
     {
         int[] arr=new int[n];
         for(int i=1;i<=n;i++)
         arr[i-1]=i;
         for(int i=2;i<n;i++)
         {
             int k=1;
             for(int j=0;j<n;j++)
             {
                 if(k%i==0&&arr[j]!=0)
                 {
                     arr[j]=0;
                     k++;
                    }
                 if(arr[j]!=0)
                 k++;
                }
            }
         for(int i=0;i<n;i++)  
         if(arr[i]>0)
         System.out.println(arr[i]);
        }
    }
    /*
     * 1
     * 3
     * 7
     */
    
     
     